package lambda.model;

public class FaturaAntiga {
    private Exemplo exemplo;

    public FaturaAntiga(Exemplo exemplo) {
        this.exemplo = exemplo;
    }

    public Exemplo getExemplo() {
        return exemplo;
    }

    public void setExemplo(Exemplo exemplo) {
        this.exemplo = exemplo;
    }

    @Override
    public String toString() {
        return "FaturaAntiga{" +
                "exemplo=" + exemplo +
                '}';
    }
}
