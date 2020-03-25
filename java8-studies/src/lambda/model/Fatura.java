package lambda.model;

public class Fatura {

    private String emailDevedor;
    private double valor;
    private boolean emailEnviado;

    public Fatura(String emailDevedor, double valor) {
        this.emailDevedor = emailDevedor;
        this.valor = valor;
    }

    public String getEmailDevedor() {
        return emailDevedor;
    }

    public void setEmailDevedor(String emailDevedor) {
        this.emailDevedor = emailDevedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEmailEnviado(boolean emailEnviado) {
        this.emailEnviado = emailEnviado;
    }

    public String resumo() {
        return "valor da fatura vencida " + this.valor;
    }

    public boolean estarEmRisco(){
        return valor > 350 ? true : false;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "emailDevedor='" + emailDevedor + '\'' +
                ", valor=" + valor +
                ", emailEnviado=" + emailEnviado +
                '}';
    }

    public void atualizarStatus(){
        System.out.println("fatura atualizada, valor: " +this.valor);
    }
}
