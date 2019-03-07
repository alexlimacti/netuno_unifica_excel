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
public class REG_C170 implements Serializable {
    
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
    private String dt_e_s;
    
    @Column
    private String vl_doc;
    
    @Column
    private String vl_merc;
    
    @Column
    private String descr_item;
    
    @Column
    private String ncm;
    
    @Column
    private String vl_item;
    
    @Column
    private String cfop;
    
    @Column
    private String vl_bc_icms;
    
    @Column
    private String cst_pis;
    
    @Column
    private String vl_bc_pis;
    
    @Column
    private String aliq_pis;
    
    @Column
    private String quant_bc_pis;
    
    @Column
    private String aliq_pis_quant;
    
    @Column
    private String vl_pis;
    
    @Column
    private String cst_cofins;
    
    @Column
    private String vl_bc_cofins;
    
    @Column
    private String aliq_cofins;
    
    @Column
    private String quant_bc_cofins;
    
    @Column
    private String aliq_cofins_quant;
    
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

    public String getDt_e_s() {
        return dt_e_s;
    }

    public void setDt_e_s(String dt_e_s) {
        this.dt_e_s = dt_e_s;
    }

    public String getVl_doc() {
        return vl_doc;
    }

    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    public String getVl_merc() {
        return vl_merc;
    }

    public void setVl_merc(String vl_merc) {
        this.vl_merc = vl_merc;
    }

    public String getDescr_item() {
        return descr_item;
    }

    public void setDescr_item(String descr_item) {
        this.descr_item = descr_item;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getVl_item() {
        return vl_item;
    }

    public void setVl_item(String vl_item) {
        this.vl_item = vl_item;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
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

    public String getQuant_bc_pis() {
        return quant_bc_pis;
    }

    public void setQuant_bc_pis(String quant_bc_pis) {
        this.quant_bc_pis = quant_bc_pis;
    }

    public String getAliq_pis_quant() {
        return aliq_pis_quant;
    }

    public void setAliq_pis_quant(String aliq_pis_quant) {
        this.aliq_pis_quant = aliq_pis_quant;
    }

    public String getVl_pis() {
        return vl_pis;
    }

    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
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

    public String getAliq_cofins() {
        return aliq_cofins;
    }

    public void setAliq_cofins(String aliq_cofins) {
        this.aliq_cofins = aliq_cofins;
    }

    public String getQuant_bc_cofins() {
        return quant_bc_cofins;
    }

    public void setQuant_bc_cofins(String quant_bc_cofins) {
        this.quant_bc_cofins = quant_bc_cofins;
    }

    public String getAliq_cofins_quant() {
        return aliq_cofins_quant;
    }

    public void setAliq_cofins_quant(String aliq_cofins_quant) {
        this.aliq_cofins_quant = aliq_cofins_quant;
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
