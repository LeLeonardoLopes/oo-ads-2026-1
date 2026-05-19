import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
           "Farinha de Trigo",
           "Nitta",
           6.50,
           180.0,
           100.0,
           70.0,
           1000.0
        );
        produto1.setEstoque(120);

        System.out.println("-".repeat(80));

        Produto produto2 = new Produto(
                "Vinho Tinto",
                "Periquita",
                42.0,
                250.0,
                90.0,
                90.0,
                1300.0
        );
        produto2.setImportado(true);
        produto2.setEstoque(30);

        Produto produto3 = new Produto(
                "Água Sanitária",
                "DaBoa",
                5.50,
                250.0,
                100.0,
                100.0,
                1050.0
        );

        //---------------------------------------------------------------

        Eletronico e1 = new Eletronico(
            "Rádio relógio",
            "Sony",
            62.90,
            100.0,
            180.0,
            140.0,
            350.0,
            0.05
        );
        e1.setImportado(true);
        e1.setVoltagem(0); // Bivolt

        Eletronico e2 = new Eletronico(
                "SmartTV 46",
                "LG",
                4200.0,
                700.0,
                1200.0,
                100.0,
                8000.0,
                0.15
        );

        Eletronico e3 = new Eletronico(
                "Fone de ouvido",
                "Xing Ling",
                25.0,
                60.0,
                60.0,
                15.0,
                20.0,
                0.1
        );
        e3.setVoltagem(0);

        //--------------------------------------------------------------------

        Notebook n1 = new Notebook(
                "Notebook gamer",                   // descrição
                "Alienware",                        // marca
                6000.0,                             // preço base
                25.0,                               // altura
                320.0,                              // largura
                210.0,                              // profundidade
                900.0,                              // peso
                5.5,                                // consumo em watts
                "Intel Core i9 13ª geração",        //
                32,                                 // memória RAM em GB
                2048                                // armazenamento em GB
        );

        //n1.setImportado(true);
        n1.setTipoPlacaVideo("dedicada");

        Notebook n2 = new Notebook(
                "Macbook M2",                       // descrição
                "Apple",                            // marca
                13000.00,                            // preço base
                25.0,                               // altura
                320.0,                              // largura
                210.0,                              // profundidade
                750.0,                              // peso
                4.2,                                // consumo em watts
                "M2",                               // processador
                16,                                 // memória RAM em GB
                1024                                // armazenamento em GB
        );

        n2.setImportado(true);
        n2.setTipoPlacaVideo("dedicada");

        // Criando uma lista com todos os produtos
        ArrayList<Produto> listagemEstoque = new ArrayList<>();

        listagemEstoque.add(produto1);
        listagemEstoque.add(produto2);
        listagemEstoque.add(produto3);

        listagemEstoque.add(e1);
        listagemEstoque.add(e2);
        listagemEstoque.add(e3);

        listagemEstoque.add(n1);
        listagemEstoque.add(n2);

        relacionarProdutos(listagemEstoque);

    }

    private static void relacionarProdutos(ArrayList<Produto> lista) {
        System.out.println("LISTAGEM DOS PRODUTOS EM ESTOQUE");
        System.out.println("-".repeat(80));

        for(Produto p: lista) {
            p.exibir();
            System.out.println("-".repeat(80));
        }
    }
}