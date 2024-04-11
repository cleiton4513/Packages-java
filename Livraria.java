package br.unipar.ads.projetolivraria;

import java.util.ArrayList;

public class Livraria {
    private String nome;
    private Endereco endereco;
    private ArrayList<Cliente> clientesCadastrados = new ArrayList<>();

    public Livraria(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
     public Livraria() {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Cliente> getClientesCadastrados() {
        return clientesCadastrados;
    }
    public void addClientes(Cliente cliente){
        this.clientesCadastrados.add(cliente);
    }
    public void setClientesCadastrados(ArrayList<Cliente> clientesCadastrados) {
        this.clientesCadastrados = clientesCadastrados;
    }

    @Override
    public String toString() {
        return "Livraria{" + "nome=" + nome + ", endereco=" + endereco + ", clientesCadastrados=" + clientesCadastrados + '}';
    }
     
    
    
}
