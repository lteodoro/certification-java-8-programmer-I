package cap1.javaBasics;

/**
 * Variáveis locais são declaradas dentro de blocos, como dentro de métodos ou construtores.
 * O ciclo de vida de uma variável local vai do ponto onde ela foi declarada até o fim do bloco onde foi declarada.
 * 
 * @author teodoro
 */
public class escopoDeVariaveis {

	
	/** Exemplo de variável local. */	
	public void m1(String s) {
		
		int x = 10; //Variável local x, pertence ao método m1.
		
		if (x >= 10) {
			int y = 50; //Variável local do bloco if.
			
			System.out.println(x); //Imprime 10.
			
			System.out.println(y); //Imprime 50.
			
		}
		
		System.out.println(x); //Imprime 10.
		
		//System.out.println(y); //Erro: A variável y existe apenas no bloco if.
		
		for (int i = 0, j = 0; i < 10; i++)
			j++;
			
		//System.out.println(j); //Erro: A variável j existe apenas no bloco for.
		
	}
	
	public void m2() {
		//System.out.println(s); //Erro: A variável s existe apenas no método m1.
	}
	

}
