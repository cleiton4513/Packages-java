package br.unipar.ads.projetolivraria;

/**
 *
 * @author cleit
 */
public class ItemVenda {
    
    private Livro livro;
    private int qtdVendas;
    private double valorUnitaDesconto;

    public ItemVenda(Livro livro, int qtdVendas, double valorUnitaDesconto) {
        this.livro = livro;
        this.qtdVendas = qtdVendas;
        this.valorUnitaDesconto = valorUnitaDesconto;
    }
    public ItemVenda() {
       
    }
    
    //getters e setters

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public double getValorUnitaDesconto() {
        return valorUnitaDesconto;
    }

    public void setValorUnitaDesconto(double valorUnitaDesconto) {
        this.valorUnitaDesconto = valorUnitaDesconto;
    }
    //toString

    @Override
    public String toString() {
        return "ItemVenda{" + "livro=" + livro + ", qtdVendas=" + qtdVendas + ", valorUnitaDesconto=" + valorUnitaDesconto + '}';
    }
    
}

    

