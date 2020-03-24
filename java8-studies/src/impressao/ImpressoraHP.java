package impressao;

public class ImpressoraHP implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("Enviando comando para imprimir na HP!");
    }
}
