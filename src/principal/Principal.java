package principal;

import cadastro.CadastroDeFuncionarios;
import cadastro.CadastroDeMembros;
import aulas.GerenciamentoDeAulas;
import pagamentos.ControleDePagamentos;
import cadastro.CadastroDeEquipamentos;
import cadastro.CadastroDeProdutos;
import estoque.EstoqueDeProdutos;
import pagamentos.CompraDeProdutos;

public class Principal {

  public static void main(String[ ] args) {

CadastroDeFuncionarios cadastroDeFuncionarios = new CadastroDeFuncionarios();
CadastroDeMembros cadastroDeMembros = new CadastroDeMembros();
GerenciamentoDeAulas gerenciamentoDeAulas = new GerenciamentoDeAulas();
ControleDePagamentos controleDePagamentos = new ControleDePagamentos();
CadastroDeEquipamentos cadastroDeEquipamentos = new CadastroDeEquipamentos();
CadastroDeProdutos cadastroDeProdutos = new CadastroDeProdutos();
EstoqueDeProdutos estoqueDeProdutos = new EstoqueDeProduto(); 
CompraDeProdutos compraDeProdutos = new CompraDeProdutos();
  }
}
