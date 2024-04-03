class Braço {
    private int comprimento;
    private boolean estáQuebrado;

    public Braço(){}

    public Braço(int comprimento) {
        this.comprimento = comprimento;
        this.estáQuebrado = false; // Por padrão, o braço não está quebrado
    }

    // Métodos getters e setters
    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public boolean isEstáQuebrado() {
        return estáQuebrado;
    }

    public void setEstáQuebrado(boolean estáQuebrado) {
        this.estáQuebrado = estáQuebrado;
    }
}