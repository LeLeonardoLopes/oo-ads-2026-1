import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //teste01();
        //teste02();
        //teste03();
        //prova1();
        teste04();
    }

    public static void teste01() {
        // Criação do primeiro objeto de pessoa
        Pessoa pessoa1 = new Pessoa(
                "Gervásio Gomes Garcia",
                54,
                "123.456.789-01",
                "gervasio.garcia@empresa.com.br",
                "(16) 98765-4321"
        );

        // Atribuindo valores aos atributos
//        pessoa1.nome = "Gervásio Gomes Garcia";
//        pessoa1.idade = 54;
//        pessoa1.cpf = "123.456.789-01";
//        pessoa1.email = "gervasio.garcia@empresa.com.br";
//        pessoa1.telefone = "(16) 98765-4321";

        // Chamando o método para exibir os dados da pessoa 1
        System.out.println(pessoa1.exibirDados());

        System.out.println("-".repeat(80));  // Traço separador

        pessoa1.fazerAniversario();

        // Chamando a apresentação da pessoa, que reflete a nova idade
        pessoa1.apresentar();

        System.out.println("-".repeat(80));  // Traço separador

        // Atualizando o e-mail
        pessoa1.atualizarEmail("ggarcia@outlook.com");

        System.out.println("-".repeat(80));  // Traço separador

        // Exibindo novamente os dados para conferir as alterações feitas
        System.out.println(pessoa1.exibirDados());

        // Alterando novamente o e-mail por meio de manipulação direta
        // do valor do atributo
        pessoa1.email = "garcia.gervasio@bol.com.br";

        System.out.println("-".repeat(80));  // Traço separador

        // Exibindo novamente os dados para conferir as alterações feitas
        System.out.println(pessoa1.exibirDados());

        System.out.println("*".repeat(80));

        // Vamos criar o primeiro objeto da classe Funcionario
        Funcionario func1 = new Funcionario(
                "Veneranda Vieira",
                26,
                "987.654.321-09",
                "veneranda@empresa.com.br",
                "(36) 91234-5678",
                "F0123",
                "Assistente Financeiro",
                3500.00,
                "Gerência Financeira"
        );

        // Dando valor aos atributos do funcionário
        // (inclui atributos herdados de Pessoa)
//        func1.nome = "Veneranda Vieira";
//        func1.idade = 26;
//        func1.cpf = "987.654.321-09";
//        func1.email = "veneranda@empresa.com.br";
//        func1.telefone = "(36) 91234-5678";
//        //----//
//        func1.matricula = "F0123";
//        func1.cargo = "Assistente Financeiro";
//        func1.salarioBase = 3500.00;
//        func1.departamento = "Gerência Financeira";
//        func1.dataAdmissao = new Date();

        // Exibindo os dados do funcionário
        System.out.println(func1.exibirDados());

        System.out.println("-".repeat(80));

        func1.fazerAniversario();

        // Exibindo os dados novamente para verificar mudança de idade
        System.out.println(func1.exibirDados());

        System.out.println("-".repeat(80));

        // Calculando o salário de Veneranda
        Double salarioFinal = func1.calcularSalario();
        System.out.println("O salário final de Veneranda é R$ " + salarioFinal);
    }

    public static void teste02() {

//        System.out.println("%".repeat(80));
//
//        Pessoa p = new Pessoa();
//        System.out.println("Exibindo dados de uma pessoa...");
//        System.out.println(p.exibirDados());
//
//        Funcionario f = new Funcionario();
//        System.out.println("Exibindo dados de um funcionário...");
//        System.out.println(f.exibirDados());
    }

    public static void teste03() {
        System.out.println("=== TESTE CONTAS BANCÁRIAS COMUNS ===");
        // Criando 3 contas (informando titular e saldo no ato da criação)
        ContaBancaria c1 = new ContaBancaria("Gervásio", 1000.0);
        ContaBancaria c2 = new ContaBancaria("Veneranda", 2500.0);
        ContaBancaria c3 = new ContaBancaria("Leonardo", 500.0);

        c1.depositar(200.0);
        c2.sacar(500.0);
        c3.sacar(100.0);
        System.out.println("-".repeat(80));
        c1.exibirSaldo();
        System.out.println("-".repeat(80));
        c2.exibirSaldo();
        System.out.println("-".repeat(80));
        c3.exibirSaldo();

        System.out.println("\n=== TESTE CONTAS ESPECIAIS ===");
        // Criando 3 contas especiais (titular, saldo, limite)
        ContaEspecial ce1 = new ContaEspecial("Gervásio Especial", 1000.0, 500.0);
        ContaEspecial ce2 = new ContaEspecial("Veneranda Especial", 2000.0, 1000.0);
        ContaEspecial ce3 = new ContaEspecial("Leonardo Especial", 0.0, 2000.0);

        ce1.depositar(300.0);
        ce2.sacar(100.0);
        ce3.depositar(500.0);

        // Exibindo saldos (Real e com Limite)
        ce1.exibirSaldo();
        ce1.exibirSaldoReal();
        System.out.println("-".repeat(80));
        ce2.exibirSaldo();
        ce2.exibirSaldoReal();
        System.out.println("-".repeat(80));
        ce3.exibirSaldo();
        ce3.exibirSaldoReal();
    }

    public static void prova1() {
        System.out.println("=== PROVA 1 ===");

        // --- ALUNO 01 ---
        Estudante aluno1 = new Estudante("Análise e Desenvolvimento de sistemas");
        aluno1.nome = "Jaspion da Silva";
        aluno1.idade = 20;
        aluno1.cpf = "999.444.855-55";
        aluno1.email = "jaspionBrasileiro@gmail.com";
        aluno1.telefone = "(16) 97111-5522";
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 9.0;

        System.out.println(aluno1.exibirDados());
        System.out.println("-".repeat(80));


        Estudante aluno2 = new Estudante("Gestão da produção industrial");
        aluno2.nome = "Carlos Magno ";
        aluno2.idade = 22;
        aluno2.cpf = "333.444.855-55";
        aluno2.email = "CarlosMagnoDaFrança@gmail.com";
        aluno2.telefone = "(16) 91111-5522";
        aluno2.nota1 = 5.0;
        aluno2.nota2 = 6.0;

        System.out.println(aluno2.exibirDados());
        System.out.println("-".repeat(80));

        Estudante aluno3 = new Estudante("Direito");
        aluno3.nome = "Ragnar Lothbrook";
        aluno3.idade = 19;
        aluno3.cpf = "222.333.444-55";
        aluno3.email = "RagnarInvasorNordico@gmail.com";
        aluno3.telefone = "(16) 91111-2222";
        aluno3.nota1 = 7.5;
        aluno3.nota2 = 4.0;

        System.out.println(aluno3.exibirDados());
        System.out.println("-".repeat(80));

        Estudante aluno4 = new Estudante("Analise e Desenvolvimento de Sistemas");
        aluno4.nome = "Leonardo Lopes dos Santos";
        aluno4.idade = 29;
        aluno4.cpf = "111.222.444-55";
        aluno4.email = "leleonardolopes@gmail.com";
        aluno4.telefone = "(16) 99366-1739";
        aluno4.nota1 = 10.0;
        aluno4.nota2 = 9.5;

        System.out.println(aluno4.exibirDados());
        System.out.println("=".repeat(80));
    }

//PROVA 1

    public static void teste04() {
        ContaBancaria c1 = new ContaBancaria("Zeferino Zacarias", 500.00);
        c1.exibirSaldo();

        c1.sacar(500.00);
        c1.exibirSaldo();

        //Atributo saldo foi privatizado
        //Mudanças no saldo agora só podem ser feitas por meio dos
        // métodos depositar() e sacar()
        //c1.saldo = -100.00;
        //c1.exibirSaldo();

        c1.depositar (200.00);
        c1.exibirSaldo();

        ContaBancaria c2 =  new ContaBancaria("Yuri Yamashita", -850.00);
        c2.exibirSaldo();

    }
}