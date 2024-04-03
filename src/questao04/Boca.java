class Boca {
    private String cor;
    private boolean temDentes;

    public Boca(){}

    public Boca(String cor, boolean temDentes) {
        this.cor = cor;
        this.temDentes = temDentes;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTemDentes() {
        return temDentes;
    }

    public void setTemDentes(boolean temDentes) {
        this.temDentes = temDentes;
    }
}
