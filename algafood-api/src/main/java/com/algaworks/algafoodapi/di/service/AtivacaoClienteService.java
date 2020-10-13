package com.algaworks.algafoodapi.di.service;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import com.algaworks.algafoodapi.di.notificacao.NivelUrgencia;
import com.algaworks.algafoodapi.di.notificacao.Notificador;
import com.algaworks.algafoodapi.di.notificacao.TipoDoNotificador;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

  @TipoDoNotificador(NivelUrgencia.URGENTE)
  @Autowired
  private Notificador notificador;

  @Autowired
  private ApplicationEventPublisher applicationEventPublisher;

  @PostConstruct
  public void init() {
    System.out.println("INIT");
  }

  @PreDestroy
  public void destroy() {
    System.out.println("DESTROY");
  }

  public void ativar(Cliente cliente) {
    cliente.ativar();
    //notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

    applicationEventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
  }
}
