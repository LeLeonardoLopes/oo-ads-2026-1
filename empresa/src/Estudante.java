class Estudante extends Pessoa {

    public String curso;
    public Double nota1;
    public Double nota2;


    public Estudante(String curso) {

        this.curso = curso;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public String verificarStatus() {
        if (this.calcularMedia() >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }


    public String exibirDados() {
        return "Nome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nCPF: " + this.cpf +
                "\nE-mail: " + this.email +
                "\nTelefone: " + this.telefone +
                "\nCurso: " + this.curso +
                "\nNota 1: " + this.nota1 +
                "\nNota 2: " + this.nota2 +
                "\nMédia Final: " + this.calcularMedia() +
                "\nSituação: " + this.verificarStatus();
    }
}
//Prova 1