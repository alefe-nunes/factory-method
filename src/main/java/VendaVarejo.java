public class VendaVarejo extends Venda {

        public VendaVarejo (String produto, String comprador) {

            super(produto, comprador);
        }

    public void exibeDetalhesVenda() {

            System.out.println("Venda Varejo: " + "Foi vendido o produto "  +  this.getProduto() +
                    " para o " +  this.getComprador() +  " na modalidade varejo.");
        }
    }