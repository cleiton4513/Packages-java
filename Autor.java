package br.unipar.ads.projetolivraria;

import java.util.ArrayList;


public class Autor {
    private String nome;
    private String DocIdent;
    private Endereco endereco;
    private ArrayList<Livro> ObrasProduzidas = new ArrayList<>();

    public Autor(String nome, String DocIdent, Endereco endereco) {
        this.nome = nome;
        this.DocIdent = DocIdent;
        this.endereco = endereco;
    }
     public Autor() {
       
    }

     //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocIdent() {
        return DocIdent;
    }

    public void setDocIdent(String DocIdent) {
        this.DocIdent = DocIdent;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Livro> getObrasProduzidas() {
        return ObrasProduzidas;
    }

    public void setObrasProduzidas(ArrayList<Livro> ObrasProduzidas) {
        this.ObrasProduzidas = ObrasProduzidas;
    }
     
    public void addLivro(Livro ObraProd){
        this.ObrasProduzidas.add(ObraProd);
    }

    @Override
    public String toString() {
        return "Autor{" + "nome=" + nome + ", DocIdent=" + DocIdent + ", endereco=" + endereco + ", ObrasProduzidas=" + ObrasProduzidas + '}';
    }
    
}
