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
public class REG_F120 implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String desc_bem_imob;
    
    @Column
    private String vl_oper_dep;
    
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
    private String aliq_cofins;
    
    @Column
    private String vl_cofins;
    
    @Column
    private String cod_cta;
    
    @Column
    private String desc_bem_imob_2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc_bem_imob() {
        return desc_bem_imob;
    }

    public void setDesc_bem_imob(String desc_bem_imob) {
        this.desc_bem_imob = desc_bem_imob;
    }

    public String getVl_oper_dep() {
        return vl_oper_dep;
    }

    public void setVl_oper_dep(String vl_oper_dep) {
        this.vl_oper_dep = vl_oper_dep;
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

    public String getAliq_cofins() {
        return aliq_cofins;
    }

    public void setAliq_cofins(String aliq_cofins) {
        this.aliq_cofins = aliq_cofins;
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

    public String getDesc_bem_imob_2() {
        return desc_bem_imob_2;
    }

    public void setDesc_bem_imob_2(String desc_bem_imob_2) {
        this.desc_bem_imob_2 = desc_bem_imob_2;
    }
    
}
