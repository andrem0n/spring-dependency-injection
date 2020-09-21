package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

  private boolean caixaAlta;
  private String hostServidorSmtp;

  public NotificadorEmail(String hostServidorSmtp) {
    this.hostServidorSmtp = hostServidorSmtp;
    System.out.println("Notificador email");
  }

  @Override
  public void notificar(Cliente cliente, String mensagem) {
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
