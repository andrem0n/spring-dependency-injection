package notificacao;

import model.Cliente;

public interface Notificador {
	void notificar(Cliente cliente, String mensagem);
}
