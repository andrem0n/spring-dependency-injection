package lambda.dao;

import lambda.model.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscarFaturasVencidas() {
        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura("joao@gmail.com", 350.00));
        faturas.add(new Fatura("maria@gmail.com", 200.00));
        faturas.add(new Fatura("josegmail.com", 500.00));
        return faturas;
    }
}
