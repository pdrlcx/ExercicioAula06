package exercicioAula06;



public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		
		
		cachorro.setNome("Kiara");
		System.out.println("O nome da cachorra �: " + cachorro.getNome());
		cachorro.setIdade(5);
		System.out.println("A idade da cachorra �: " + cachorro.getIdade());
		 cachorro.correr();
		 cachorro.emitirSom();
		
		
		Cavalo cavalo = new Cavalo();
		
		
		cavalo.setNome("Andrew");
		System.out.println("O nome do cavalo �: " + cavalo.getNome());
		cavalo.setIdade(10);
		System.out.println("A idade do cavalo �: " + cavalo.getIdade());
		
		cavalo.correr();
		cavalo.emitirsom();
		
		
		Pregui�a pregui�a = new Pregui�a();
		
		
		pregui�a.setNome("Karol");
		System.out.println("O nome da pregui�a �: " + pregui�a.getNome());
		pregui�a.setIdade(7);
		System.out.println("A idade da pregui�a �: " + pregui�a.getIdade());
		
		pregui�a.EmitirSom();
		pregui�a.SubindoArvore();
		
		
	
	}
		
		
		

}
