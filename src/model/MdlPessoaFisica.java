/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author andre
 */
@Entity
public class MdlPessoaFisica extends MdlPessoa implements Serializable{
    private String cpf;
    private String rg;
    
    @ManyToMany (mappedBy = "funcionario")
    private List<MdlProjeto> projeto;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public List<MdlProjeto> getProjeto() {
        return projeto;
    }

    public void setProjeto(List<MdlProjeto> Projeto) {
        this.projeto = Projeto;
    }
}