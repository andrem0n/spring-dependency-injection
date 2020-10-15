package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

  private boolean caixaAlta;
  private String hostServidorSmtp;

  @Autowired
  private NotificadorProperties notificadorProperties;

  public NotificadorEmail() {
    System.out.println("Notificador email real");
  }

  @Override
  public void notificar(Cliente cliente, String mensagem) {
    System.out.println("Host: "+this.notificadorProperties.getHostServidor());
    System.out.println("Porta: "+this.notificadorProperties.getPortaServidor());

    if (this.caixaAlta) {
      mensagem = mensagem.toUpperCase();
    }

    System.out
        .printf("Notificando o %s através do email %s usando SMTP %s: %s\n", cliente.getNome(),
            cliente.getEmail(), this.hostServidorSmtp, mensagem);
  }

  public boolean isCaixaAlta() {
    return caixaAlta;
  }

  public void setCaixaAlta(boolean caixaAlta) {
    this.caixaAlta = caixaAlta;
  }
}
