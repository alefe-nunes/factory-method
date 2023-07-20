public class MinhaApp {

    public static void main(String[] args) {

        //Empresas
        Empresa empresaVarejo = new EmpresaVendaVarejo();

        Empresa empresaAtacado = new EmpresaVendaAtacado();

        //Realiza vendas
        Venda varejo = empresaVarejo.realizaVenda("automóvel" , "senhor Alberto");

        Venda atacado = empresaAtacado.realizaVenda("roupas", "Brechó da Elisama");

        //Exibe detalhes das vendas
        varejo.exibeDetalhesVenda();

        atacado.exibeDetalhesVenda();
    }
}