package cap1.javaBasics;

/**
 * Variáveis de instância ou variáveis de objeto são os atributos dos objetos.
 * São declaradas dentro da classe, mas fora de qualquer método ou construtor.
 * Podem ser acessadas por qualquer membro da classe e ficam em escopo enquanto o objeto existir.
 * 
 * @author teodoro
 *
 */

public class variaveisDeInstancia {
	
	String nome;
	
	public void setNome(String n) {
		this.nome = n; // Acesso explicito (this) a variavel de instância.
	}

}
