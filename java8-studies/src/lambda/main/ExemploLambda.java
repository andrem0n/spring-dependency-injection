package lambda.main;

import lambda.dao.FaturaDAO;
import lambda.model.Exemplo;
import lambda.model.Fatura;
import lambda.model.FaturaAntiga;
import lambda.model.Inside;
import lambda.util.EnviadorDeEmail;

import java.util.List;

public class ExemploLambda {
    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
        Inside inside = new Inside("inside");
        Exemplo exemplo = new Exemplo("nomeExemplo", "enailExemplo", inside);
        FaturaAntiga faturaAntiga = new FaturaAntiga(exemplo);

        Fatura fatura = new Fatura(faturaAntiga);
        System.out.println(fatura);
        EnviadorDeEmail enviadorDeEmail = new EnviadorDeEmail();

//        for (Fatura fatura : faturasVencidas){
//            enviadorDeEmail.enviarEmail(fatura.getEmailDevedor(), fatura.resumo());
//        }

//        faturasVencidas.forEach(fatura -> {
//            enviadorDeEmail.enviarEmail(fatura.getEmailDevedor(), fatura.resumo());
//            fatura.setEmailEnviado(true);
//        });
//
//        faturasVencidas.forEach(Fatura::atualizarStatus);
    }
}
