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
public class REG_D105 implements Serializable {
    
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
    private String dt_a_p;
    
    @Column
    private String vl_doc;
    
    @Column
    private String cst_cofins;
    
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

    public String getNome_part() {
        return nome_part;
    }

    public void setNome_part(String nome_part) {
        this.nome_part = nome_part;
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

    public String getDt_a_p() {
        return dt_a_p;
    }

    public void setDt_a_p(String dt_a_p) {
        this.dt_a_p = dt_a_p;
    }

    public String getVl_doc() {
        return vl_doc;
    }

    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    public String getCst_cofins() {
        return cst_cofins;
    }

    public void setCst_cofins(String cst_cofins) {
        this.cst_cofins = cst_cofins;
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
    
}
