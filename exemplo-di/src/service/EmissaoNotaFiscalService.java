package service;

import model.Cliente;
import model.Produto;
import notificacao.Notificador;

public class EmissaoNotaFiscalService {

  private Notificador notificador;

  public EmissaoNotaFiscalService(Notificador notificador) {
    this.notificador = notificador;
  }

  public void emitir(Cliente cliente, Produto produto) {
    notificador.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + " foi emitida!");
  }
}
