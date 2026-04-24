import java.util.Date;

public class Funcionario extends Pessoa {

    public static Double taxaComissao = 10.0;

    // 1. Atributos alterados de public para private
    private String matricula;
    private String cargo;
    private Double salarioBase;
    private String departamento;
    private Date dataAdmissao;

    public Funcionario(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone,
            String matricula,
            String cargo,
            Double salarioBase,
            String departamento
    ) {
        super(nome, idade, cpf, email, telefone);

        this.matricula = matricula;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.dataAdmissao = new Date();
    }

    // Métodos Originais
    public Double calcularSalario() {
        return this.salarioBase * (1 + (taxaComissao / 100));
    }

    public void aumentarSalarioBase(Double percentual) {
        if(percentual == null || percentual <= 0) {
            throw new IllegalArgumentException("O percentual de aumento deve ser positivo.");
        }
        this.salarioBase = this.salarioBase * (1 + (percentual / 100));
        System.out.println("Salário base atualizado para R$ " + this.salarioBase);
    }

    public void registrarPonto() {
        System.out.println("Ponto registrado para " + this.getNome() + // Atualizado para usar getNome()
                "\nMatrícula: " + this.matricula +
                "\nData/hora:" + new Date()
        );
    }

    @Override
    public String exibirDados() {
        String dadosPessoa = super.exibirDados();
        return dadosPessoa +
                "\nMatricula: " + this.matricula +
                "\nCargo: " + this.cargo +
                "\nSalário base: R$ " + this.salarioBase +
                "\nDepartamento: " + this.departamento +
                "\nData de admissão: " + this.dataAdmissao;
    }

    // 2. Getters e Setters implementados
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}