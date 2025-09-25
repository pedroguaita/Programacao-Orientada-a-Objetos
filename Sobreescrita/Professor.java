/**
 * Classe criada para herdar todos os atributos de todos da superclasse Pessoa
 * e promovendo a sobreescrita de alguns métodos
 * @author Pedro Pereira Guaita
 * @since Classe criada em 25/09/2025
 */

public class Professor extends Pessoa{
    
    int codigo;
    String disciplina;
    private float salario;

    //Construtor do objeto Professor em memória
    public Professor(String nome, int idade, float altura, int codigo, String disciplina, float salario) {
        super(nome, idade, altura);
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.salario = salario;
    }
    
    @Override //sobreescrita
    public void exibirDados(){
         System.out.println("O professor " + nome + 
                            " ministra a disciplina " + disciplina + 
                            " e tem o salário de R$" + salario);
    }
    
    //sobrecarga
    public void exibirDados(boolean resp){
        super.exibirDados();
        System.out.println("Salário: " + salario);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Código do funcionário: " + codigo);
    }

     public void exibirDados(int x){
        System.out.println("Professor: " + nome);
        System.out.println("Salário: " + salario);
    }

     
}//fim da classe
