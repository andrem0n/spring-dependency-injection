package com.exampledi.injectionstudy.notificacao;


import com.exampledi.injectionstudy.model.Cliente;

public interface Notificador {
	void notificar(Cliente cliente, String mensagem);
}
