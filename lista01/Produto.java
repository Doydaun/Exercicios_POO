package Lista01;

public class Produto {
	
	//atributos
	
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int desconto;
	
	
	//construtor padrão
	
	public Produto() {
		
	}
	
	//construtor com atributos
	
	public Produto(String nome, String descricao, double procoUnitario, int desconto) {
		this.setNome(nome);
		this.setDescricao(descricao);
		this.setPrecoUnitario(precoUnitario);
		this.setDesconto(desconto);
		
	}

	//metodos
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
			this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	public String imprime() {
		String objeto = "";
		
		return objeto;
	}
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.setNome("Caderno");
		p1.setDescricao("Caderno em espiral tamanho médio");
		p1.setPrecoUnitario(4.50);
		p1.setDesconto(15);
		
		Produto p2 = new Produto("Esquadro", "Esquadro de acrílico 20 cm", 2.35, 10);
		
		Produto p3 = new Produto("Caneta ESF","Caneta esferográfica 5mm", 1.20, 2);
		
		System.out.println(p1.getNome());
		System.out.println(p1.getDescricao());
		System.out.println(p1.getPrecoUnitario());
		System.out.println(p1.getDesconto());
		
		System.out.println(p2);
		
	}

}

