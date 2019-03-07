/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netuno.planilhasfiscalizacao.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author alexl
 */

@Entity
public class REG_A170 implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String nome_part;
    
    @Column
    private String cnpj_cpf;
    
    @Column
    private String ser;
    
    @Column
    private String num_doc;
    
    @Column
    private String dt_doc;
    
    @Column
    private String dt_exe_serv;
    
    @Column
    private String vl_doc;
    
    @Column
    private String descr_item;
    
    @Column
    private String cst_pis;
    
    @Column
    private String vl_bc_pis;
    
    @Column
    private String aliq_pis;
    
    @Column
    private String vl_pis;
    
    @Column
    private String vl_bc_cofins;
    
    @Column
    private String aliq_confis;
    
    @Column
    private String vl_cofins;
    
    @Column
    private String cod_cta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj_cpf() {
        return cnpj_cpf;
    }

    public void setCnpj_cpf(String cnpj_cpf) {
        this.cnpj_cpf = cnpj_cpf;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public String getDt_exe_serv() {
        return dt_exe_serv;
    }

    public void setDt_exe_serv(String dt_exe_serv) {
        this.dt_exe_serv = dt_exe_serv;
    }

    public String getVl_doc() {
        return vl_doc;
    }

    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    public String getDescr_item() {
        return descr_item;
    }

    public void setDescr_item(String descr_item) {
        this.descr_item = descr_item;
    }

    public String getCst_pis() {
        return cst_pis;
    }

    public void setCst_pis(String cst_pis) {
        this.cst_pis = cst_pis;
    }

    public String getVl_bc_pis() {
        return vl_bc_pis;
    }

    public void setVl_bc_pis(String vl_bc_pis) {
        this.vl_bc_pis = vl_bc_pis;
    }

    public String getAliq_pis() {
        return aliq_pis;
    }

    public void setAliq_pis(String aliq_pis) {
        this.aliq_pis = aliq_pis;
    }

    public String getVl_pis() {
        return vl_pis;
    }

    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
    }

    public String getVl_bc_cofins() {
        return vl_bc_cofins;
    }

    public void setVl_bc_cofins(String vl_bc_cofins) {
        this.vl_bc_cofins = vl_bc_cofins;
    }

    public String getAliq_confis() {
        return aliq_confis;
    }

    public void setAliq_confis(String aliq_confis) {
        this.aliq_confis = aliq_confis;
    }

    public String getVl_cofins() {
        return vl_cofins;
    }

    public void setVl_cofins(String vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

	public String getNome_part() {
		return nome_part;
	}

	public void setNome_part(String nome_part) {
		this.nome_part = nome_part;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
}
