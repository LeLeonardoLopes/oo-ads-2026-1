public class Pessoa {

    // Atributos agora são PRIVADOS
    private String nome;
    private Integer idade;
    private String cpf;
    private String email;
    private String telefone;

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
    public Pessoa(String nome,
                  Integer idade,
                  String cpf,
                  String email,
                  String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
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
