package solucao;

import problema.Produto;
import problema.ProdutoDigital;
import problema.ProdutoFisico;
import problema.TipoProdutoEnum;

public class ProdutoFactory {

    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum){

        switch (tipoProdutoEnum){
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;


            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("tipo de produto indisponivel");
        }

    }
}
