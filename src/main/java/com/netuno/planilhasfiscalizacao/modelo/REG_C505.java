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
public class REG_C505 implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String cad_nome;
    
    @Column
    private String cad_cnpj;
    
    @Column
    private String ser;
    
    @Column
    private String num_doc;
    
    @Column
    private String dt_doc;
    
    @Column
    private String dt_ent;
    
    @Column
    private String vl_cofins;
    
    @Column
    private String cst_cofins;
    
    @Column
    private String vl_item;
    
    @Column
    private String vl_bc_cofins;
    
    @Column
    private String aliq_confis;
    
    @Column
    private String vl_cofins_2;
    
    @Column
    private String cod_cta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCad_nome() {
        return cad_nome;
    }

    public void setCad_nome(String cad_nome) {
        this.cad_nome = cad_nome;
    }

    public String getCad_cnpj() {
        return cad_cnpj;
    }

    public void setCad_cnpj(String cad_cnpj) {
        this.cad_cnpj = cad_cnpj;
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

    public String getDt_ent() {
        return dt_ent;
    }

    public void setDt_ent(String dt_ent) {
        this.dt_ent = dt_ent;
    }

    public String getVl_cofins() {
        return vl_cofins;
    }

    public void setVl_cofins(String vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    public String getCst_cofins() {
        return cst_cofins;
    }

    public void setCst_cofins(String cst_cofins) {
        this.cst_cofins = cst_cofins;
    }

    public String getVl_item() {
        return vl_item;
    }

    public void setVl_item(String vl_item) {
        this.vl_item = vl_item;
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

    public String getVl_cofins_2() {
        return vl_cofins_2;
    }

    public void setVl_cofins_2(String vl_cofins_2) {
        this.vl_cofins_2 = vl_cofins_2;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }
    
}
