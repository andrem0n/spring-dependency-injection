package com.algaworks.algafoodapi;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import com.algaworks.algafoodapi.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

  private AtivacaoClienteService ativacaoClienteService;

  public MeuPrimeiroController(
      AtivacaoClienteService ativacaoClienteService) {
    System.out.println("Meu primeiro controler: " + ativacaoClienteService );
    this.ativacaoClienteService = ativacaoClienteService;
  }

  @GetMapping("/hello")
  @ResponseBody
  public String helloWorld(){
    Cliente cliente = new Cliente("joao", "joaomail", "99999999");

    ativacaoClienteService.ativar(cliente);
    return "Hello World!";
  }
}
