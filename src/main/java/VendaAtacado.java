//Produto concreto
public class VendaAtacado extends Venda{

        public VendaAtacado (String produto, String comprador) {

            super(produto , comprador);
        }

    public void exibeDetalhesVenda() {

            System.out.println("Venda Atacado: " + "Foi vendido o produto " + this.getProduto() +
                    " para o " +  this.getComprador() +  " na modalidade atacado.");
        }
    }