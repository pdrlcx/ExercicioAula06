package exercicioAula06;



public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		
		
		cachorro.setNome("Kiara");
		System.out.println("O nome da cachorra é: " + cachorro.getNome());
		cachorro.setIdade(5);
		System.out.println("A idade da cachorra é: " + cachorro.getIdade());
		 cachorro.correr();
		 cachorro.emitirSom();
		
		
		Cavalo cavalo = new Cavalo();
		
		
		cavalo.setNome("Andrew");
		System.out.println("O nome do cavalo é: " + cavalo.getNome());
		cavalo.setIdade(10);
		System.out.println("A idade do cavalo é: " + cavalo.getIdade());
		
		cavalo.correr();
		cavalo.emitirsom();
		
		
		Preguiça preguiça = new Preguiça();
		
		
		preguiça.setNome("Karol");
		System.out.println("O nome da preguiça é: " + preguiça.getNome());
		preguiça.setIdade(7);
		System.out.println("A idade da preguiça é: " + preguiça.getIdade());
		
		preguiça.EmitirSom();
		preguiça.SubindoArvore();
		
		
	
	}
		
		
		

}
