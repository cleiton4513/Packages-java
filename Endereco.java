package br.unipar.ads.projetolivraria;

    public class Endereco {
    
    private int cep;
    private String uf;
    private String cidade;
    private String nomeRua;
    private int numRua;

    public Endereco(String nomeRua, int numRua, int cep, String cidade, 
            String uf) {
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.nomeRua = nomeRua;
        this.numRua = numRua;
    }
    public Endereco() {
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.nomeRua = nomeRua;
        this.numRua = numRua;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public int getNumRua() {
        return numRua;
    }

    public void setNumRua(int numRua) {
        this.numRua = numRua;
    }

    @Override
    public String toString() {
        return "Endereco{" + "cep=" + cep + ", uf=" + uf + ", cidade=" + cidade + ", nomeRua=" + nomeRua + ", numRua=" + numRua + '}';
    }

}
