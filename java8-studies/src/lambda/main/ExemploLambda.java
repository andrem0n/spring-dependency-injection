package lambda.main;

import lambda.dao.FaturaDAO;
import lambda.model.Fatura;
import lambda.util.EnviadorDeEmail;

import java.util.List;
import java.util.stream.Stream;

public class ExemploLambda {
    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

        EnviadorDeEmail enviadorDeEmail = new EnviadorDeEmail();

//        for (Fatura fatura : faturasVencidas){
//            enviadorDeEmail.enviarEmail(fatura.getEmailDevedor(), fatura.resumo());
//        }
        //lambda
//        faturasVencidas.forEach(fatura -> {
//            enviadorDeEmail.enviarEmail(fatura.getEmailDevedor(), fatura.resumo());
//            fatura.setEmailEnviado(true);
//        });

        //referencia por metodo
        //faturasVencidas.forEach(Fatura::atualizarStatus);

        //stream
        Stream<Fatura> faturas = faturasVencidas.stream().filter(f -> f.getValor() > 350.00);

        faturas.forEach(System.out::println);

        //ou
        faturasVencidas.stream().filter(Fatura::estarEmRisco)
                .forEach(System.out::println);
    }
}
