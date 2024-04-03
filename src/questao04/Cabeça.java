class Cabeça {
    private Olho olhoEsquerdo;
    private Olho olhoDireito;
    private Boca boca;

    public Cabeça() {
        olhoEsquerdo = new Olho();
        olhoDireito = new Olho();
        boca = new Boca();
    }

    public Boca getBoca() {
        return boca;
    }

    public void setBoca(Boca boca) {
        this.boca = boca;
    }

    public Olho getOlhoDireito() {
        return olhoDireito;
    }

    public void setOlhoDireito(Olho olhoDireito) {
        this.olhoDireito = olhoDireito;
    }

    public Olho getOlhoEsquerdo() {
        return olhoEsquerdo;
    }

    public void setOlhoEsquerdo(Olho olhoEsquerdo) {
        this.olhoEsquerdo = olhoEsquerdo;
    }
    
}