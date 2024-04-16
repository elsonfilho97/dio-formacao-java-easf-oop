package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
	
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");	

        Aluno anderson = new Aluno();
		anderson.setNome("Anderson");
		anderson.setIdade(14);
		
		System.out.println("O aluno " + anderson.getNome() + " tem " + anderson.getIdade() + " anos.");	
	}
}