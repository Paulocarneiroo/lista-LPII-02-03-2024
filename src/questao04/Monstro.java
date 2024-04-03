class Monstro {
    private Cabeça cabeça;
    private Braço braçoEsquerdo;
    private Braço braçoDireito;
    private Perna pernaEsquerda;
    private Perna pernaDireita;

    public Monstro() {
        cabeça = new Cabeça();
        braçoEsquerdo = new Braço();
        braçoDireito = new Braço();
        pernaEsquerda = new Perna();
        pernaDireita = new Perna();
    }

    public Braço getBraçoDireito() {
        return braçoDireito;
    }

    public Braço getBraçoEsquerdo() {
        return braçoEsquerdo;
    }

    public Perna getPernaDireita() {
        return pernaDireita;
    }

    public Perna getPernaEsquerda() {
        return pernaEsquerda;
    }

    public Cabeça getCabeça() {
        return cabeça;
    }

    public void setBraçoDireito(Braço braçoDireito) {
        this.braçoDireito = braçoDireito;
    }

    public void setBraçoEsquerdo(Braço braçoEsquerdo) {
        this.braçoEsquerdo = braçoEsquerdo;
    }

    public void setCabeça(Cabeça cabeça) {
        this.cabeça = cabeça;
    }

    public void setPernaDireita(Perna pernaDireita) {
        this.pernaDireita = pernaDireita;
    }

    public void setPernaEsquerda(Perna pernaEsquerda) {
        this.pernaEsquerda = pernaEsquerda;
    }
}