package impressao;

public class Main {
    public static void main(String[] args) {
        //Impressora i = new ImpressoraHP();
        Impressora i = () -> {
            System.out.println("Simulando a impressão");
        };

        i.imprimir();
    }
}
