package Lista01;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private char sexo;
	private LocalDate dataNascimento;
	private String estadoCivil;
	
	//construtor com parametros
	public Pessoa(String nome, char sexo, LocalDate data) {
		this.nome = nome;
		this.setSexo(sexo);
		this.dataNascimento = data;
		this.setEstadoCivil(estadoCivil);
		
	}
	
	//métodos
	public void setSexo(char valor) {
		if (valor == 'M' || valor == 'F') {
			this.sexo = valor;
		}
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public void setEstadoCivil(String relacionamento) {
		this.estadoCivil = relacionamento;
	}
	
	public String getEstadoCivil() {
		return this.estadoCivil;
	}
	
	//teste
	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();	
		
		Pessoa p1 = new Pessoa("João", 'M', data);
		p1.setEstadoCivil("Casado");
		System.out.println(p1.nome);
		System.out.println(p1.sexo);
		System.out.println(p1.dataNascimento);
		System.out.println(p1.estadoCivil);
					
	}
	
}
