import java.util.Date;

class Funcionario extends Pessoa {
    private String matricula;
    private Date dataAdmissao;
    private double salario;

    public Funcionario(){}

    public Funcionario(String matricula, Date dataAdimissao, double salario) {
        this.matricula = matricula;
        this.dataAdmissao = dataAdimissao;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
