package com.algaworks.algafoodapi;

import com.algaworks.algafoodapi.di.notificacao.NotificadorEmail;
import com.algaworks.algafoodapi.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AlgaConfig {

  @Bean
  public NotificadorEmail notificadorEmail() {
    NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.algamail.com");
    notificadorEmail.setCaixaAlta(true);
    return notificadorEmail;
  }

  @Bean
  public AtivacaoClienteService ativacaoClienteService() {
    return new AtivacaoClienteService(notificadorEmail());
  }
}
