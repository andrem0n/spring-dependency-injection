package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NORMAL)
//@Component
public class NotificadorEmailMock implements Notificador {

  private boolean caixaAlta;
  private String hostServidorSmtp;

  public NotificadorEmailMock() {
    System.out.println("Notificador email mock");
  }

  @Override
  public void notificar(Cliente cliente, String mensagem) {
    if (this.caixaAlta) {
      mensagem = mensagem.toUpperCase();
    }

    System.out
        .printf("Notificação seria enviada para %s através do email %s usando SMTP %s: %s\n",
            cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
  }

  public boolean isCaixaAlta() {
    return caixaAlta;
  }

  public void setCaixaAlta(boolean caixaAlta) {
    this.caixaAlta = caixaAlta;
  }
}
