package exercicioAula06;

/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe*/

public class Animal {

	private String Nome;
	private int idade;
	
	public String getNome() {
		return Nome;
	}
	//void nao tem retorno
	
	public void setNome(String nome) {
		//this: ele fala que � a variavel la em cima
		this.Nome = nome;
	}
	//get pega
	public int getIdade() {
		return idade;
	}
	//set recebe
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
