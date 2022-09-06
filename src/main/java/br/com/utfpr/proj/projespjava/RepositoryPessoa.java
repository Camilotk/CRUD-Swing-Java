/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.proj.projespjava;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cazevedo
 */
public class RepositoryPessoa {
    private Pessoa pes;
    private List<Pessoa> bd = new ArrayList<Pessoa>();

    public List<Pessoa> getBd() {
        return bd;
    }
    
    public Pessoa cadastrar(Pessoa p) {
        
        if(pesquisar(p) == null) {
            bd.add(p);
            return p;
        } else {
            return null;
        }
    }
    
    public Pessoa pesquisar(Pessoa p) {
        for (Pessoa pessoa : this.bd) {
            if (pessoa.getCpf() == p.getCpf()) {
                return pessoa;
            }
        }
        
        return null;
    }
    
    public Pessoa remover(Pessoa p) {
        p = pesquisar(p);
        if (p != null) {
            bd.remove(p);
            return null;
        } else {
            return p;
        }
    }
    
    public Pessoa atualizar(Pessoa p) {
        for(int i = 0; i <= bd.size(); i++) {
            if (p.getCpf() == bd.get(i).getCpf()) {
                String nome = JOptionPane.showInputDialog(null, "Nome: ", "Nome", JOptionPane.QUESTION_MESSAGE);
                p.setNome(nome);
                bd.set(i, p);
                return p;
            }
        }
        
        return null;
    }
    
    public void imprimeCPFs() {
        for(Pessoa pessoa : this.bd) {
            System.out.println("CPF: " + pessoa.getCpf());
        }
    }
}
