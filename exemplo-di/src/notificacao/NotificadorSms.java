package notificacao;

import model.Cliente;

public class NotificadorSms implements Notificador{

	@Override
	public void notificar(Cliente cliente, String mensagem){
		System.out.printf("Notificando %s através do sms %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}
}
