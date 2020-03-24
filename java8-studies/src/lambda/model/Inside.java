package lambda.model;

public class Inside {
    private String insider;

    public Inside(String insider) {
        this.insider = insider;
    }

    public String getInsider() {
        return insider;
    }

    public void setInsider(String insider) {
        this.insider = insider;
    }

    @Override
    public String toString() {
        return "Inside{" +
                "insider='" + insider + '\'' +
                '}';
    }
}
