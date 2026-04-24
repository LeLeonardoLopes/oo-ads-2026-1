import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Você pode descomentar os métodos que deseja testar
        //teste01();
        //teste02();
        //teste03();
        //prova01();
        //teste04();
    }

    public static void teste01() {
        Pessoa pessoa1 = new Pessoa(
                "Gervásio Gomes Garcia",
                54,
                "123.456.789-01",
                "gervasio.garcia@empresa.com.br",
                "(16) 98765-4321"
        );

        System.out.println(pessoa1.exibirDados());
        System.out.println("-".repeat(80));

        pessoa1.fazerAniversario();
        pessoa1.apresentar();
        System.out.println("-".repeat(80));

        pessoa1.atualizarEmail("ggarcia@outlook.com");
        System.out.println("-".repeat(80));
        System.out.println(pessoa1.exibirDados());

        // CORREÇÃO: Como "email" é privado na classe Pessoa, devemos usar setEmail()
        pessoa1.setEmail("garcia.gervasio@bol.com.br");

        System.out.println("-".repeat(80));
        System.out.println(pessoa1.exibirDados());
        System.out.println("*".repeat(80));

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

        System.out.println(func1.exibirDados());
        System.out.println("-".repeat(80));

        func1.fazerAniversario();
        System.out.println(func1.exibirDados());
        System.out.println("-".repeat(80));

        Double salarioFinal = func1.calcularSalario();
        System.out.println("O salário final de Veneranda é R$ " + salarioFinal);
    }

    public static void teste02() {
        // Mantido vazio ou comentado conforme seu código original
    }

    // teste03 omitido por focar em ContaBancaria (funciona normalmente)

    public static void prova01() {
        Estudante e1 = new Estudante(
                "Adamastor Alves", 20, "111.111.111-11", "adamastor@faculdade.edu.br", "(16) 91111-1111", "Administração"
        );

        Estudante e2 = new Estudante(
                "Belisa Borges", 19, "222.222.222-22", "belisa@faculdade.edu.br", "(16) 92222-2222", "Biomedicina"
        );

        Estudante e3 = new Estudante(
                "Cosme Cordeiro", 18, "333.333.333-33", "cosme@faculdade.edu.br", "(16) 93333-3333", "Ciências Contábeis"
        );

        Estudante e4 = new Estudante(
                "Deusdete Duarte", 21, "444.444.444-44", "deusdete@faculdade.edu.br", "(16) 94444-4444", "Direito"
        );

        // CORREÇÃO: Como "nota1" e "nota2" são atributos privados na classe Estudante,
        // não podemos fazer e1.nota1 = 8.5. Devemos usar os setters implementados:
        e1.setNota1(8.5);
        e1.setNota2(6.0);

        e2.setNota1(5.6);
        e2.setNota2(4.3);

        e3.setNota1(10.0);
        e3.setNota2(8.2);

        e4.setNota1(7.0);
        e4.setNota2(4.6);

        System.out.println(e1.exibirDados());
        System.out.println("-".repeat(80));

        System.out.println(e2.exibirDados());
        System.out.println("-".repeat(80));

        System.out.println(e3.exibirDados());
        System.out.println("-".repeat(80));

        System.out.println(e4.exibirDados());
        System.out.println("-".repeat(80));
    }
}