package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {

  private boolean caixaAlta;
  private String hostServidorSmtp;

  public NotificadorSMS() {
    //this.hostServidorSmtp = hostServidorSmtp;
    System.out.println("Notificador email");
  }

  @Override
  public void notificar(Cliente cliente, String mensagem) {
    if (this.caixaAlta) {
      mensagem = mensagem.toUpperCase();
    }

    System.out
        .printf("Notificando o %s através do telefone %s usando SMTP %s: %s\n", cliente.getNome(),
            cliente.getTelefone(), this.hostServidorSmtp, mensagem);
  }

  public boolean isCaixaAlta() {
    return caixaAlta;
  }

  public void setCaixaAlta(boolean caixaAlta) {
    this.caixaAlta = caixaAlta;
  }
}
