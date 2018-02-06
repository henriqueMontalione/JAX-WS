package br.com.caelum.estoque.cliente;

public class TesteClienteSoap {

	public static void main(String[] args) {
		EstoqueWS cliente = new EstoqueWSService().getEstoqueWSPort();
		System.out.println(cliente);
		Filtro filtro = new Filtro();
		filtro.setNome("IPhone");
		filtro.setTipo(TipoItem.CELULAR);

		Filtros filtros = new Filtros();
		filtros.getFiltro().add(filtro);

		ListaItens lista = cliente.todosOsItens(filtros);

		System.out.println("Resposta do serviço: " + lista);
	}

}
