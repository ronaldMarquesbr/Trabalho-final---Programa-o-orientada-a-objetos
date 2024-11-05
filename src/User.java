public class User {
    public static void main (String[] args) {
        // Utils
        DateHandler data = new DateHandler();

        // Inicializando categorias
        ListaManager<Categoria> minhasCategorias = new ListaManager<>();
        Categoria pessoal = new Categoria("Pessoal", "sem link");
        minhasCategorias.adicionar(pessoal);
        Categoria comida = new Categoria("Comida", "sem link");
        minhasCategorias.adicionar(comida);
        Categoria casa = new Categoria("Casa", "sem link");
        minhasCategorias.adicionar(casa);
        Categoria diversao = new Categoria("Diversão", "sem link");
        minhasCategorias.adicionar(diversao);
        Categoria educacao = new Categoria("Educação", "sem link");
        minhasCategorias.adicionar(educacao);

        // Inicializando bancos
        ListaManager<Banco> meusBancos = new ListaManager<>();
        Banco bb = new Banco("Banco do Brasil", "001");
        meusBancos.adicionar(bb);
        Banco santander = new Banco("Banco Santander", "033");
        meusBancos.adicionar(santander);
        Banco caixa = new Banco("Caixa Econômica Federal", "104");
        meusBancos.adicionar(caixa);
        Banco itau = new Banco("Itaú", "341");
        meusBancos.adicionar(itau);

        // Inicializar usuario
        Usuario ronald = new Usuario("Ronald Marques", data.stringToDate("10/10/2024"));
        ContaPessoal meuBb = new ContaPessoal("Principal", "Ronald Marques",
                "123.456.789-12", bb);
        ContaPessoal meuItau = new ContaPessoal("Secundaria", "Ronald Marques",
                "123.456.789-12", itau);

        ronald.adicionarConta(meuBb);
        ronald.adicionarConta(meuItau);

        // Inicializar transacoes
        meuBb.adicionarTransacao(new Receita("Salario", 1000,
                data.stringToDate("01/10/2024"), pessoal, true, true));

        meuBb.adicionarTransacao(new Despesa("X-tudo", 14,
                data.stringToDate("11/10/2024"), comida, true, false));

        meuItau.adicionarTransacao(new Despesa("Internet", 110,
                data.stringToDate("15/10/2024"), comida, false, true));

        // Editar nome da transacao "Salario" para "Mesada"

        Transacao transacaoDesejada = meuBb.obterTransacaoPorNome("Salario");
        meuBb.mostrarResumoTransacao("Salario");
        transacaoDesejada.setNome("Mesada");
        meuBb.mostrarResumoTransacao("Mesada");

        // Obter saldos do usuario
        ronald.imprimirResumo();

        // Obter saldo das contas individualmente
        meuBb.imprimirResumo();
        meuItau.imprimirResumo();

        // Adicionar cartao
        meuBb.adicionarCartao(
                new Cartao("Compras online",
                        "1234 1234",
                        1000,
                        1,
                        23,
                        30)
        );

        // Criar despesa com cartao
        meuBb.adicionarTransacao(
                new DespesaCartao(
                        "Televisao",
                        2500,
                        data.stringToDate("29/10/2024"),
                        casa,
                        true,
                        false,
                        0,
                        "1234 1234")
        );

        // Verificar despesas
        meuBb.mostrarResumoTransacoes();

        // Realizar transferencia
        ContaExterna pixDoMercado = new ContaExterna("Mercado de Casa",
                                                    "Lider",
                                                    "123.123.123-12",
                                                     caixa);

        meuBb.adicionarTransacao(new Transferencia("Compra do mes",
                                                   150,
                                                   data.stringToDate("20/10/2024"),
                                                   casa,
                                                   false,
                                                   false,
                                                   false,
                                                   pixDoMercado));

        // novo salario
        meuBb.adicionarTransacao(new Receita(
                "Bolsa",
                12000,
                data.stringToDate("25/10/2024"),
                pessoal,
                true,
                true
        ));

        ronald.imprimirResumo();
    }
}
