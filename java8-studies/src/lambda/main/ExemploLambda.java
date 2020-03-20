package lambda.main;

import lambda.dao.FaturaDAO;
import lambda.model.Fatura;
import lambda.util.EnviadorDeEmail;

import java.util.List;

public class ExemploLambda {
    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

        EnviadorDeEmail enviadorDeEmail = new EnviadorDeEmail();

//        for (Fatura fatura : faturasVencidas){
//            enviadorDeEmail.enviarEmail(fatura.getEmailDevedor(), fatura.resumo());
//        }

        faturasVencidas.forEach(fatura -> {
            enviadorDeEmail.enviarEmail(fatura.getEmailDevedor(), fatura.resumo());
            fatura.setEmailEnviado(true);
        });
    }
}
