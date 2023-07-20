//Fábrica concreta
public class EmpresaVendaVarejo extends Empresa{

        public Venda realizaVenda (String produto, String comprador) {

            return new VendaVarejo (produto , comprador);
        }
    }