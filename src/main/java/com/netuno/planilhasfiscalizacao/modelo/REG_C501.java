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
public class REG_C501 implements Serializable {
    
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
    private String vl_pis;
    
    @Column
    private String cst_pis;
    
    @Column
    private String vl_item;
    
    @Column
    private String vl_bc_pis;
    
    @Column
    private String aliq_pis;
    
    @Column
    private String vl_pis_2;
    
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

    public String getVl_pis() {
        return vl_pis;
    }

    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
    }

    public String getCst_pis() {
        return cst_pis;
    }

    public void setCst_pis(String cst_pis) {
        this.cst_pis = cst_pis;
    }

    public String getVl_item() {
        return vl_item;
    }

    public void setVl_item(String vl_item) {
        this.vl_item = vl_item;
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

    public String getVl_pis_2() {
        return vl_pis_2;
    }

    public void setVl_pis_2(String vl_pis_2) {
        this.vl_pis_2 = vl_pis_2;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }
    
}
