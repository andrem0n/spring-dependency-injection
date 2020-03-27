package com.exampledi.injectionstudy.notificacao;


import com.exampledi.injectionstudy.model.Cliente;

public class NotificadorEmail implements Notificador{

	@Override
	public void notificar(Cliente cliente, String mensagem){
		System.out.printf("Notificando %s através do email %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
