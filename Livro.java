package br.unipar.ads.projetolivraria;


public class Livro {
    
    private String editora;
    private Autor autor;
    private int anoFabricacao;
    private String genero;
    private int numPaginas;
    private int qtdEmEstoque;
    private double preco;
    
    public Livro(String editora, Autor autor, int anoFabricacao, String genero, int numPaginas, int qtdEmEstoque, double preco) {
        
    }

    public Livro() {
        
       
    }
    
    //getters e setters
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getQtdEmEstoque() {
        return qtdEmEstoque;
    }

    public void setQtdEmEstoque(int qtdEmEstoque) {
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" + "editora=" + editora + ", autor=" + autor + ", anoFabricacao=" + anoFabricacao + ", genero=" + genero + ", numPaginas=" + numPaginas + ", qtdEmEstoque=" + qtdEmEstoque + ", preco=" + preco + '}';
    }
 
    
}
