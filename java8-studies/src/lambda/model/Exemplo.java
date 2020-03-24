package lambda.model;

public class Exemplo {

    private String nome;
    private String email;
    private Inside inside;

    public Exemplo(String nome, String email, Inside inside) {
        this.nome = nome;
        this.email = email;
        this.inside = inside;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Inside getInside() {
        return inside;
    }

    public void setInside(Inside inside) {
        this.inside = inside;
    }

    @Override
    public String toString() {
        return "Exemplo{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", inside=" + inside +
                '}';
    }
}
