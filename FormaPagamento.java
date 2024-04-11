package br.unipar.ads.projetolivraria;

/**
 *
 * @author cleit
 */
public class FormaPagamento {
    
    private String tipo;//se for 1 - dinheiro com desconto, se for 2 - cartao sem desconto.
    private double valorPago;

    
    public FormaPagamento(String tipo, double valorPago) {
        this.tipo = tipo;
        this.valorPago = valorPago;
    }
      public FormaPagamento() {
        
    }
    //getters e setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
      
    //toString

    @Override
    public String toString() {
        return "FormaPagamento{" + "tipo=" + tipo + ", valorTotal=" + valorPago + '}';
    }
    
}

    

