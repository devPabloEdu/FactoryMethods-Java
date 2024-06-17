package solucao;

import problema.Produto;
import problema.TipoProdutoEnum;

public class TesteProdutoComFactoryMethod {
    public static void main(String[] args) {
       Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);

       Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoFisico);
        System.out.println(produtoDigital);
    }
}
