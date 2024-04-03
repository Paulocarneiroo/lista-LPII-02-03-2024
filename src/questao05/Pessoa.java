import java.util.Date;

class Pessoa {
    private String nome;
    private String cpf;
    private Date dataNasc;

    public Pessoa(){}

    public Pessoa(String nome, String cpf, Date dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
}