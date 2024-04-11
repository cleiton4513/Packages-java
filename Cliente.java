package br.unipar.ads.projetolivraria;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Cliente {
     
    private String nome;
    private int numId;
    private Endereco endereco;
    private String telefone;
    private String cpf;
    private boolean cadastrado = false;
    private Date inicioCadastro;
    private Date terminoCadastro;
    private ArrayList<Cliente> clientesCadastrados = new ArrayList<>();

    public Cliente(String nome, int numId, Endereco endereco, String telefone,
            String cpf, Date inicioCadastro, Date terminoCadastro) {
        this.nome = nome;
        this.numId = numId;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.inicioCadastro = inicioCadastro;
        this.terminoCadastro = terminoCadastro;
    }
    
    public Cliente() {
        this.nome = nome;
        this.numId = numId;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.inicioCadastro = inicioCadastro;
        this.terminoCadastro = terminoCadastro;
    }
    
    //getters e setters
    public void atualizarCliente(){
        Endereco atuaEnde = new Endereco();
        String nomeRua;
        String input;
        int numRua = 0;
        int cep = 0;
        String cidade;
        String uf;
  
        nomeRua = JOptionPane.showInputDialog(null
                            ,"informe o nome da rua");
        input = JOptionPane.showInputDialog(null,
                            "informe o numero do complemento");
        numRua = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null,
                            "informe o cep");
        cep = Integer.parseInt(input);
        cidade = JOptionPane.showInputDialog(null,
                            "informe a cidade");
        uf = JOptionPane.showInputDialog(null,
                            "informe o estado");
        this.nome = JOptionPane.showInputDialog("informe o nome");
        this.numId = numId;
        this.endereco = atuaEnde;
        this.telefone = JOptionPane.showInputDialog(null
                            ,"informe o telefone");
        this.cpf = JOptionPane.showInputDialog(null
                            ,"informe o cpf");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome= nome;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isCadastrado() {
        return cadastrado;
    }
     public ArrayList<Cliente> getClientesCadastrados() {
        return clientesCadastrados;
    }
    public void setClientesCadastrados(ArrayList<Cliente> clientesCadastrados) {
        this.clientesCadastrados = clientesCadastrados;
    }
    public void addClientes(Cliente cliente){
        this.clientesCadastrados.add(cliente);
    }
    public void verifCadastro(Cliente nome){
        
    }
    public void setCadastrado(boolean cadastrado) {
        this.cadastrado = cadastrado;
    }

    public Date getInicioCadastro() {
        return inicioCadastro;
    }

    public void setInicioCadastro(Date inicioCadastro) {
        this.inicioCadastro = inicioCadastro;
    }

    public Date getTerminoCadastro() {
        return terminoCadastro;
    }

    public void setTerminoCadastro(Date terminoCadastro) {
        this.terminoCadastro = terminoCadastro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", numId=" + numId + ", endereco="
                + endereco + ", telefone=" + telefone + ", cpf=" + cpf +
                ", cadastrado=" + cadastrado + ", inicioCadastro=" + 
                inicioCadastro + ", terminoCadastro=" + terminoCadastro + 
                ", clientesCadastrados=" + clientesCadastrados + '}';
    }

   
}   