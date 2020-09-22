package com.algaworks.algafoodapi.di.service;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import com.algaworks.algafoodapi.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;

public class AtivacaoClienteService {

  @Autowired(required = false)
  private Notificador notificador;

  public AtivacaoClienteService(Notificador notificador) {
    this.notificador = notificador;
    System.out.println("AtivacaoClienteService: " + notificador);
  }

  public void ativar(Cliente cliente) {
    cliente.ativar();

    notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
  }
}
