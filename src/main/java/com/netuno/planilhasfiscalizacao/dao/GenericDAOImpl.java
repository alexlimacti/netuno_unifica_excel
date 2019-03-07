package com.netuno.planilhasfiscalizacao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

@SuppressWarnings("unchecked")
public class GenericDAOImpl<Tipo> {

	private EntityManager entityManager = HibernateUtil.geEntityManager();

	/* (non-Javadoc)
	 * @see com.netuno.planilhasfiscalizacao.dao.GenericDAO#salvar(Tipo)
	 */
	public void salvar(Tipo entidade) {
		EntityTransaction transaction = entityManager.getTransaction(); // Obejto de transação
		transaction.begin();// Inicia uma transação
		entityManager.persist(entidade);// Salva no banco de dados
		transaction.commit();// Grava no banco de dados
	}

	/* (non-Javadoc)
	 * @see com.netuno.planilhasfiscalizacao.dao.GenericDAO#updateMerge(Tipo)
	 */
	public Tipo updateMerge(Tipo entidade) { // Salva ou Atualiza
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Tipo entidadeSalva = entityManager.merge(entidade);// Salva, atualiza e retorna o objeto
		transaction.commit();

		return entidadeSalva;
	}

	/* (non-Javadoc)
	 * @see com.netuno.planilhasfiscalizacao.dao.GenericDAO#pesquisar(Tipo)
	 */
	public Tipo pesquisar(Tipo entidade) {
		Object id = HibernateUtil.getPrimaryKey(entidade);
		Tipo e = (Tipo) entityManager.find(entidade.getClass(), id);
		return e;

	}

	/* (non-Javadoc)
	 * @see com.netuno.planilhasfiscalizacao.dao.GenericDAO#pesquisar(java.lang.Long, java.lang.Class)
	 */
	public Tipo pesquisar(Long id, Class<Tipo> entidade) {
		entityManager.clear();
		Tipo e = (Tipo) entityManager.createQuery("from " + entidade.getSimpleName() + " where id = " + id).getSingleResult();
		return e;

	}

	/* (non-Javadoc)
	 * @see com.netuno.planilhasfiscalizacao.dao.GenericDAO#deletarPoId(Tipo)
	 */
	public void deletarPoId(Tipo entidade) throws Exception {
		Object id = HibernateUtil.getPrimaryKey(entidade); // Obtem o ID do objeto PK
		EntityTransaction transaction = entityManager.getTransaction();// Obejeto de transação
		transaction.begin();// Começa uma Transação no banco de dados

		entityManager.createNativeQuery("delete from " + entidade.getClass(). // Monta a Query para delete
				getSimpleName().toLowerCase() + " where id =" + id).executeUpdate(); // Executa o delete no banco de
																						// dados
		transaction.commit();// Grava alteração no banco

	}

	/* (non-Javadoc)
	 * @see com.netuno.planilhasfiscalizacao.dao.GenericDAO#listar(java.lang.Class)
	 */
	public List<Tipo> listar(Class<Tipo> entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		List<Tipo> lista = entityManager.createQuery("from " + entidade.getName())// Cria a queru de consulta
				.getResultList();// Retorna a lista de objetos consultados
		transaction.commit();

		return lista;
	}

	/* (non-Javadoc)
	 * @see com.netuno.planilhasfiscalizacao.dao.GenericDAO#getEntityManager()
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
