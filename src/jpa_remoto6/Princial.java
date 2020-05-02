/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa_remoto6;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.MdlCategoria;
import model.MdlPessoaFisica;
import model.MdlPessoaJuridica;
import model.MdlProjeto;

/**
 *
 * @author andre
 */
public class Princial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManagerFactory fabrica =  Persistence.createEntityManagerFactory("remoto6PU");
        EntityManager gerenciador = fabrica.createEntityManager();
        gerenciador.getTransaction().begin();
        
        
        MdlCategoria categoria = new MdlCategoria();
        MdlProjeto projeto = new MdlProjeto();
        MdlPessoaJuridica pJuridica = new MdlPessoaJuridica();
        MdlPessoaFisica pFisica = new MdlPessoaFisica();
        
        
        System.out.println("inserindo");
        
        
        /*
        
        */
        //insere pessoa fisica
        pFisica.setNome("André");
        pFisica.setSalario(600);
        pFisica.setCpf("123123123");
        pFisica.setRg("1213");
        gerenciador.persist(pFisica);
        //
        //insere pessoa juridica
        pJuridica.setNome("empresa");
        pJuridica.setSalario(600);
        pJuridica.setCnpj("12123123123412");
        pJuridica.setIe("98");
        gerenciador.persist(pJuridica);
        //
        //insere categoria
        categoria.setNome("compra");
        gerenciador.persist(categoria);
        //
        
        
        //insere projeto
        pFisica = gerenciador.find(MdlPessoaFisica.class, 1);
        categoria = gerenciador.find(MdlCategoria.class, 1);
        ArrayList<MdlPessoaFisica> funcionarios = new ArrayList<>();
        
        projeto.setNome("carro");
        projeto.setGerente(pFisica);
        projeto.setCategoria(categoria);
        projeto.setFuncionario(funcionarios);
        gerenciador.persist(projeto);
        //
        
        
        gerenciador.getTransaction().commit();
        fabrica.close();
        System.out.println("Fim");
    }   
}