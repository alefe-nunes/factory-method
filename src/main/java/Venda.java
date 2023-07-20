//Produto
public abstract class Venda {

        private String produto;
        public String comprador;



        public Venda (String produto, String comprador) {
            this.produto = produto;
            this.comprador = comprador;
        }

        public String getProduto () {
            return produto;
        }

        public void setProduto (String produto) {
            this.produto = produto;
        }

        public String getComprador () {
            return comprador;
        }

        public void setComprador (String comprador) {
            this.comprador = comprador;
        }

        public abstract void exibeDetalhesVenda();
    }