package br.unipar.ads.projetolivraria;

import java.util.ArrayList;

public class Venda {
    private ArrayList<FormaPagamento> formasPagamento = new ArrayList<>();
    private ArrayList<ItemVenda> itens = new ArrayList<>();
    private double valorTotal;
    
    //construtores

    public Venda(double valorTotal) {
        this.valorTotal = valorTotal;
    }
     public Venda() {
        
    }
     
     //getters e setters

    public ArrayList<FormaPagamento> getFormasPagamento() {
        return formasPagamento;
    }

    public void setFormasPagamento(ArrayList<FormaPagamento> formasPagamento) {
        this.formasPagamento = formasPagamento;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void addFormaPagamento(FormaPagamento formaPagamento){
        this.formasPagamento.add(formaPagamento);
    }
    public void addItem(ItemVenda item){
        this.itens.add(item);
    }
    public double calcularValorTotal(){
        double total = 0 ;
        for(ItemVenda item : itens){
            total += (item.getLivro().getPreco() - item.getValorUnitaDesconto() * item.getQtdVendas());
        }
        return valorTotal = total;
    }

    @Override
    public String toString() {
        return "Venda{" + "formasPagamento=" + formasPagamento + ", itens=" + itens + ", valorTotal=" + valorTotal + '}';
    }     
            
}   