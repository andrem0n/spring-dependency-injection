import model.Cliente;
import notificacao.NotificadorEmail;
import notificacao.NotificadorSms;
import service.AtivacaoClienteService;

public class Main {
	public static void main(String[] args) {
		Cliente joao = new Cliente("Joao", "joao@gmail", "999987");
		Cliente maria = new Cliente("Maria", "maria@gmail", "999955");

		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(new NotificadorEmail());

		ativacaoClienteService.ativar(joao);
		ativacaoClienteService.ativar(maria);
	}
}
