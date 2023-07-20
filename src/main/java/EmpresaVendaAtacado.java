//Fábrica concreta
public class EmpresaVendaAtacado extends Empresa{

        public Venda realizaVenda (String produto , String comprador) {

            return new VendaAtacado (produto , comprador);
        }
}