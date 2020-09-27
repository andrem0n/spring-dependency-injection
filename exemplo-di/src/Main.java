import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import model.Cliente;
import notificacao.Notificador;
import notificacao.NotificadorEmail;
import service.AtivacaoClienteService;

public class Main {

  public static void main(String[] args) {

    Cliente joao = new Cliente("João dos Santos", "joao@gmail.com", "9988563727");
    Cliente maria = new Cliente("Maria das Couves", "maria@gmail.com", "9988553647");

    Notificador notificadorEmail = new NotificadorEmail();

    AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificadorEmail);
    ativacaoClienteService.ativar(joao);
    ativacaoClienteService.ativar(maria);
  }
}
