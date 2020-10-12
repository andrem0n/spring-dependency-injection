package com.algaworks.algafoodapi.di.listener;

import com.algaworks.algafoodapi.di.notificacao.NivelUrgencia;
import com.algaworks.algafoodapi.di.notificacao.Notificador;
import com.algaworks.algafoodapi.di.notificacao.TipoDoNotificador;
import com.algaworks.algafoodapi.di.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

  @TipoDoNotificador(NivelUrgencia.URGENTE)
  @Autowired
  private Notificador notificador;

  @EventListener
  public void clienteAtivadoListener(ClienteAtivadoEvent clienteAtivadoEvent) {
    //notificador.notificar(clienteAtivadoEvent.getCliente(), "Seu cadastro está ativo.");
    System.out
        .println("Emitindo nota fiscal para o cliente " + clienteAtivadoEvent.getCliente().getNome()
            + "");
  }
}
