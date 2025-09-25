/**
 * Classe criada para demonstrar o recurso de Sobreescrita de métodos (recurso de linguagem)
 * @author Pedro Pereira Guaita
 * @since Classe criada em 25/09/2025
 */
public class Pessoa {

    protected String nome;
    protected int idade;
    protected float altura;

    //Construtor do objeto Pessoa em memória
    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    //Método para exibir os dados da Pessoa
    public void exibirDados(){
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Idade da pessoa: " + idade);
        System.out.println("Altura da pessoa: " + altura);
    }
    
}//fim da classe
