class Perna {
    private int comprimento;
    private boolean estáQuebrada;

    public Perna(){
        
    }
  
    public Perna(int comprimento) {
        this.comprimento = comprimento;
        this.estáQuebrada = false; // Por padrão, a perna não está quebrada
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public boolean isEstáQuebrada() {
        return estáQuebrada;
    }

    public void setEstáQuebrada(boolean estáQuebrada) {
        this.estáQuebrada = estáQuebrada;
    }
}