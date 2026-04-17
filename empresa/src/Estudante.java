class Estudante extends Pessoa {

    private String curso;
    private Double nota1;
    private Double nota2;

    // Construtor atualizado para receber todos os 6 argumentos
    public Estudante(String nome, int idade, String cpf, String email, String telefone, String curso) {

        // Atribuindo os valores herdados da classe Pessoa
        super(nome, idade, cpf, email, telefone);

        // Atribuindo o valor específico da classe Estudante
        this.curso = curso;
    }

    // Getters e Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        // Usando uma verificação simples para evitar erro caso as notas ainda não tenham sido cadastradas
        double n1 = (this.nota1 != null) ? this.nota1 : 0.0;
        double n2 = (this.nota2 != null) ? this.nota2 : 0.0;
        return (n1 + n2) / 2;
    }

    public String verificarStatus() {
        if (this.calcularMedia() >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String exibirDados() {
        // super.exibirDados() traz Nome, Idade, CPF, E-mail e Telefone da classe Pessoa
        return super.exibirDados() +
                "\nCurso: " + this.curso +
                "\nNota 1: " + this.nota1 +
                "\nNota 2: " + this.nota2 +
                "\nMédia Final: " + this.calcularMedia() +
                "\nSituação: " + this.verificarStatus();
    }
}