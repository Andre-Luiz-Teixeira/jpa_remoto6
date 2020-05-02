/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author andre
 */
@Entity
public class MdlProjeto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nome;
    
    @ManyToOne
    private MdlPessoa gerente;
    
    @ManyToOne
    private MdlCategoria categoria;
    
    @ManyToMany 
    private List<MdlPessoaFisica> funcionario;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MdlPessoa getGerente() {
        return gerente;
    }

    public void setGerente(MdlPessoa gerente) {
        this.gerente = gerente;
    }

    public MdlCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(MdlCategoria categoria) {
        this.categoria = categoria;
    }

    public List<MdlPessoaFisica> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<MdlPessoaFisica> funcionario) {
        this.funcionario = funcionario;
    }
}
