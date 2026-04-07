public class Pessoa {

    // Atributos
    public String nome;
    public Integer idade;
    public String cpf;
    public String email;
    public String telefone;


    public Pessoa() {
    }

    /*
        MÉTODO CONSTRUTOR
        O método construtor é sempre chamado quando se cria um novo objeto
        a partir da classe.
        Nele, podemos exigir que determinados valores sejam informados para
        que a existência do objeto seja possível.
        O método construtor SEMPRE tem o MESMO NOME DA CLASSE.
    */
    public Pessoa(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone
    ) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    // Métodos
    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e tenho " + this.idade + " anos.");
    }

    public void fazerAniversario() {
        this.idade++;   // Incrementa a idade
        System.out.println("Feliz aniversário, " + this.nome + "! Agora você tem " + this.idade + " anos.");
    }

    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
        System.out.println("Email atualizado para: " + this.email);
    }

    public String exibirDados() {
        // \n significa quebra de linha
        return "Nome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nCPF: " + this.cpf +
                "\nE-mail: " + this.email +
                "\nTelefone: " + this.telefone;

    }
}
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