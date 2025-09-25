/**
 * Classe criada para instanciar objetos do tipo Pessoa e Professor
 * @author Pedro Pereira Guaita
 * @since Classe criada em 25/09/2025
 */

public class Cadastro {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Pedro", 21, 1.68f);
        pessoa.exibirDados();
        
        System.out.println("");
        
        Professor prof = new Professor("Doriva", 65, 1.72f, 1910, "Introdução ao Corinthianismo", 10f);
        prof.exibirDados(2);
        
        System.out.println("");
        
        Aluno aluno = new Aluno("Giovanna", 19, 1.68f, 28112005, 8.85f, 2, false);
        aluno.exibirDados();
        
        System.out.println("");
        
        aluno.exibirDados(true);
             
    }//fim do main

}//fim da classe
