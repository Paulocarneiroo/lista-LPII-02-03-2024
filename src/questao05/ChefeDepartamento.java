import java.util.Date;

class ChefeDepartamento extends Funcionario {
    private String departamento;
    private Date dataPromocao;
    private double gratificacao;

    public ChefeDepartamento() {
        
    }

    public ChefeDepartamento(String departamento, Date dataPromocao, double gratificacao) {
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Date getDataPromocao() {
        return dataPromocao;
    }

    public void setDataPromocao(Date dataPromocao) {
        this.dataPromocao = dataPromocao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
}