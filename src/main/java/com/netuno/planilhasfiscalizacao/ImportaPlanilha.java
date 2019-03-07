package com.netuno.planilhasfiscalizacao;


import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import com.netuno.planilhasfiscalizacao.dao.REG_A170DAOImpl;
import com.netuno.planilhasfiscalizacao.dao.REG_C170DAOImpl;
import com.netuno.planilhasfiscalizacao.dao.REG_C501DAOImpl;
import com.netuno.planilhasfiscalizacao.dao.REG_C505DAOImpl;
import com.netuno.planilhasfiscalizacao.dao.REG_D101DAOImpl;
import com.netuno.planilhasfiscalizacao.dao.REG_D105DAOImpl;
import com.netuno.planilhasfiscalizacao.dao.REG_F120DAOImpl;
import com.netuno.planilhasfiscalizacao.modelo.REG_A170;
import com.netuno.planilhasfiscalizacao.modelo.REG_C170;
import com.netuno.planilhasfiscalizacao.modelo.REG_C501;
import com.netuno.planilhasfiscalizacao.modelo.REG_C505;
import com.netuno.planilhasfiscalizacao.modelo.REG_D101;
import com.netuno.planilhasfiscalizacao.modelo.REG_D105;
import com.netuno.planilhasfiscalizacao.modelo.REG_F120;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ImportaPlanilha {

	public static void main(String[] args) throws BiffException, IOException {
		
		FileFilter filter = new FileFilter() {
		    public boolean accept(File file) {
		        return file.getName().endsWith(".xls");
		    }
		};
		
		REG_A170DAOImpl rEG_A170DAO = new REG_A170DAOImpl();
		REG_C170DAOImpl rEG_C170DAO = new REG_C170DAOImpl();
		REG_C501DAOImpl rEG_C501DAO = new REG_C501DAOImpl();
		REG_C505DAOImpl rEG_C505DAO = new REG_C505DAOImpl();
		REG_D101DAOImpl rEG_D101DAO = new REG_D101DAOImpl();
		REG_D105DAOImpl rEG_D105DAO = new REG_D105DAOImpl();
		REG_F120DAOImpl rEG_F120DAO = new REG_F120DAOImpl();
		
		System.out.println("Inicio da leitura");
		
		File dir = new File("d:\\trabalho_fiscal\\2016");
		File[] files = dir.listFiles(filter);
		for(int fi = 0; fi < files.length; fi++){
			System.out.println(files[fi].getName());
			Workbook workbook = Workbook.getWorkbook(files[fi]);
			int planilhas = workbook.getSheets().length;
			int linhas = 0;
			for (int j = 0; j < planilhas; j++) {
				Sheet sheet = workbook.getSheet(j);
				linhas = sheet.getRows();
				for (int i = 1; i < linhas; i++) {
					if (sheet.getName().equals("REG A170")) {
						
						System.out.println(sheet.getName());
						
						REG_A170 a = new REG_A170();
						Cell celula0 = sheet.getCell(0, i);
						a.setCnpj_cpf(celula0.getContents());

						Cell celula1 = sheet.getCell(1, i);
						a.setSer(celula1.getContents());

						Cell celula2 = sheet.getCell(2, i);
						a.setNum_doc(celula2.getContents());

						Cell celula3 = sheet.getCell(3, i);
						a.setDt_doc(celula3.getContents());

						Cell celula4 = sheet.getCell(4, i);
						a.setDt_exe_serv(celula4.getContents());

						Cell celula5 = sheet.getCell(5, i);
						a.setVl_doc(celula5.getContents());

						Cell celula6 = sheet.getCell(6, i);
						a.setDescr_item(celula6.getContents());

						Cell celula7 = sheet.getCell(7, i);
						a.setCst_pis(celula7.getContents());

						Cell celula8 = sheet.getCell(8, i);
						a.setVl_bc_pis(celula8.getContents());

						Cell celula9 = sheet.getCell(9, i);
						a.setAliq_pis(celula9.getContents());

						Cell celula10 = sheet.getCell(10, i);
						a.setVl_pis(celula10.getContents());

						Cell celula11 = sheet.getCell(11, i);
						a.setVl_bc_cofins(celula11.getContents());

						Cell celula12 = sheet.getCell(12, i);
						a.setAliq_confis(celula12.getContents());

						Cell celula13 = sheet.getCell(13, i);
						a.setVl_cofins(celula13.getContents());

						Cell celula14 = sheet.getCell(14, i);
						a.setCod_cta(celula14.getContents());
						
						rEG_A170DAO.salvar(a);
					}

					if (sheet.getName().equals("REG C170")) {
						
						System.out.println(sheet.getName());
						
						REG_C170 a = new REG_C170();
						Cell celula0 = sheet.getCell(0, i);
						a.setNome_part(celula0.getContents());

						Cell celula1 = sheet.getCell(1, i);
						a.setCnpj_cpf(celula1.getContents());

						Cell celula2 = sheet.getCell(2, i);
						a.setSer(celula2.getContents());

						Cell celula3 = sheet.getCell(3, i);
						a.setSer(celula3.getContents());

						Cell celula4 = sheet.getCell(4, i);
						a.setNum_doc(celula4.getContents());

						Cell celula5 = sheet.getCell(5, i);
						a.setDt_doc(celula5.getContents());

						Cell celula6 = sheet.getCell(6, i);
						a.setDt_e_s(celula6.getContents());

						Cell celula7 = sheet.getCell(7, i);
						a.setVl_doc(celula7.getContents());

						Cell celula8 = sheet.getCell(8, i);
						a.setVl_merc(celula8.getContents());

						Cell celula9 = sheet.getCell(9, i);
						a.setDescr_item(celula9.getContents());

						Cell celula10 = sheet.getCell(10, i);
						a.setNcm(celula10.getContents());

						Cell celula11 = sheet.getCell(11, i);
						a.setVl_item(celula11.getContents());

						Cell celula12 = sheet.getCell(12, i);
						a.setCfop(celula12.getContents());

						Cell celula13 = sheet.getCell(13, i);
						a.setVl_bc_icms(celula13.getContents());

						Cell celula14 = sheet.getCell(14, i);
						a.setCst_pis(celula14.getContents());

						Cell celula15 = sheet.getCell(15, i);
						a.setAliq_pis(celula15.getContents());

						Cell celula18 = sheet.getCell(18, i);
						a.setVl_pis(celula18.getContents());

						Cell celula19 = sheet.getCell(19, i);
						a.setCst_cofins(celula19.getContents());

						Cell celula20 = sheet.getCell(20, i);
						a.setVl_bc_cofins(celula20.getContents());

						Cell celula21 = sheet.getCell(21, i);
						a.setAliq_cofins(celula21.getContents());

						Cell celula24 = sheet.getCell(24, i);
						a.setVl_cofins(celula24.getContents());

						Cell celula25 = sheet.getCell(25, i);
						a.setCod_cta(celula25.getContents());
						
						rEG_C170DAO.salvar(a);
					}

					if (sheet.getName().equals("REG C501")) {
						
						System.out.println(sheet.getName());
						
						REG_C501 a = new REG_C501();
						Cell celula0 = sheet.getCell(0, i);
						a.setCad_nome(celula0.getContents());

						Cell celula1 = sheet.getCell(1, i);
						a.setCad_cnpj(celula1.getContents());

						Cell celula2 = sheet.getCell(2, i);
						a.setSer(celula2.getContents());

						Cell celula3 = sheet.getCell(3, i);
						a.setNum_doc(celula3.getContents());

						Cell celula4 = sheet.getCell(4, i);
						a.setDt_doc(celula4.getContents());

						Cell celula5 = sheet.getCell(5, i);
						a.setDt_ent(celula5.getContents());

						Cell celula7 = sheet.getCell(7, i);
						a.setCst_pis(celula7.getContents());

						Cell celula8 = sheet.getCell(8, i);
						a.setVl_item(celula8.getContents());

						Cell celula9 = sheet.getCell(9, i);
						a.setVl_bc_pis(celula9.getContents());

						Cell celula10 = sheet.getCell(10, i);
						a.setAliq_pis(celula10.getContents());

						Cell celula11 = sheet.getCell(11, i);
						a.setVl_pis_2(celula11.getContents());

						Cell celula12 = sheet.getCell(12, i);
						a.setCod_cta(celula12.getContents());

						rEG_C501DAO.salvar(a);
					}

					if (sheet.getName().equals("REG C505")) {
						
						System.out.println(sheet.getName());
						
						REG_C505 a = new REG_C505();
						Cell celula0 = sheet.getCell(0, i);
						a.setCad_nome(celula0.getContents());

						Cell celula1 = sheet.getCell(1, i);
						a.setCad_cnpj(celula1.getContents());

						Cell celula2 = sheet.getCell(2, i);
						a.setSer(celula2.getContents());

						Cell celula3 = sheet.getCell(3, i);
						a.setNum_doc(celula3.getContents());

						Cell celula4 = sheet.getCell(4, i);
						a.setDt_doc(celula4.getContents());

						Cell celula5 = sheet.getCell(5, i);
						a.setDt_ent(celula5.getContents());

						Cell celula6 = sheet.getCell(6, i);
						a.setVl_cofins(celula6.getContents());

						Cell celula7 = sheet.getCell(7, i);
						a.setCst_cofins(celula7.getContents());

						Cell celula8 = sheet.getCell(8, i);
						a.setVl_item(celula8.getContents());

						Cell celula9 = sheet.getCell(9, i);
						a.setVl_bc_cofins(celula9.getContents());

						Cell celula10 = sheet.getCell(10, i);
						a.setAliq_confis(celula10.getContents());

						Cell celula11 = sheet.getCell(11, i);
						a.setVl_cofins_2(celula11.getContents());

						Cell celula12 = sheet.getCell(12, i);
						a.setCod_cta(celula12.getContents());

						rEG_C505DAO.salvar(a);
					}

					if (sheet.getName().equals("REG D101")) {
						
						System.out.println(sheet.getName());
						
						REG_D101 a = new REG_D101();
						Cell celula0 = sheet.getCell(0, i);
						a.setNome_part(celula0.getContents());

						Cell celula1 = sheet.getCell(1, i);
						a.setCnpj_cpf(celula1.getContents());

						Cell celula2 = sheet.getCell(2, i);
						a.setSer(celula2.getContents());

						Cell celula3 = sheet.getCell(3, i);
						a.setNum_doc(celula3.getContents());

						Cell celula4 = sheet.getCell(4, i);
						a.setDt_doc(celula4.getContents());

						Cell celula5 = sheet.getCell(5, i);
						a.setDt_a_p(celula5.getContents());

						Cell celula6 = sheet.getCell(6, i);
						a.setVl_doc(celula6.getContents());

						Cell celula7 = sheet.getCell(7, i);
						a.setCst_pis(celula7.getContents());

						Cell celula8 = sheet.getCell(8, i);
						a.setVl_bc_pis(celula8.getContents());

						Cell celula9 = sheet.getCell(9, i);
						a.setAliq_confis(celula9.getContents());

						Cell celula10 = sheet.getCell(10, i);
						a.setVl_pis(celula10.getContents());

						Cell celula11 = sheet.getCell(11, i);
						a.setCod_cta(celula11.getContents());

						
						rEG_D101DAO.salvar(a);
					}
					
					if (sheet.getName().equals("REG D105")) {
						
						System.out.println(sheet.getName());
						
						REG_D105 a = new REG_D105();
						Cell celula0 = sheet.getCell(0, i);
						a.setNome_part(celula0.getContents());

						Cell celula1 = sheet.getCell(1, i);
						a.setCnpj_cpf(celula1.getContents());

						Cell celula2 = sheet.getCell(2, i);
						a.setSer(celula2.getContents());

						Cell celula3 = sheet.getCell(3, i);
						a.setNum_doc(celula3.getContents());

						Cell celula4 = sheet.getCell(4, i);
						a.setDt_doc(celula4.getContents());

						Cell celula5 = sheet.getCell(5, i);
						a.setDt_a_p(celula5.getContents());

						Cell celula6 = sheet.getCell(6, i);
						a.setVl_doc(celula6.getContents());

						Cell celula7 = sheet.getCell(7, i);
						a.setCst_cofins(celula7.getContents());

						Cell celula8 = sheet.getCell(8, i);
						a.setVl_bc_cofins(celula8.getContents());

						Cell celula9 = sheet.getCell(9, i);
						a.setAliq_confis(celula9.getContents());

						Cell celula10 = sheet.getCell(10, i);
						a.setVl_cofins(celula10.getContents());

						Cell celula11 = sheet.getCell(11, i);
						a.setCod_cta(celula11.getContents());

						
						rEG_D105DAO.salvar(a);
					}
					
					if (sheet.getName().equals("REG F120")) {
						
						System.out.println(sheet.getName());
						
						REG_F120 a = new REG_F120();
						Cell celula0 = sheet.getCell(0, i);
						a.setDesc_bem_imob(celula0.getContents());

						Cell celula1 = sheet.getCell(1, i);
						a.setVl_oper_dep(celula1.getContents());

						Cell celula2 = sheet.getCell(2, i);
						a.setCst_pis(celula2.getContents());

						Cell celula3 = sheet.getCell(3, i);
						a.setVl_bc_pis(celula3.getContents());

						Cell celula4 = sheet.getCell(4, i);
						a.setAliq_pis(celula4.getContents());

						Cell celula5 = sheet.getCell(5, i);
						a.setVl_pis(celula5.getContents());

						Cell celula6 = sheet.getCell(6, i);
						a.setVl_bc_cofins(celula6.getContents());

						Cell celula7 = sheet.getCell(7, i);
						a.setAliq_cofins(celula7.getContents());

						Cell celula8 = sheet.getCell(8, i);
						a.setVl_cofins(celula8.getContents());

						Cell celula9 = sheet.getCell(9, i);
						a.setCod_cta(celula9.getContents());
						
						rEG_F120DAO.salvar(a);
					}
				}
			}
		}
		System.out.println("Fim da leitura");
		System.exit(1);
	}

}
