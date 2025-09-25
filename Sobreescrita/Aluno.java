/**
 * Classe criada para...
 * @author Pedro Pereira Guaita
 * @since Classe criada em 25/09/2025
 */
public class Aluno extends Pessoa{

    int ra;
    float media;
    int faltas;
    boolean dependencia;

    //Construtor do objeto Aluno e memória
    public Aluno(String nome, int idade, float altura, int ra, float media, int faltas, boolean dependencia) {
        super(nome, idade, altura);
        this.ra = ra;
        this.media = media;
        this.faltas = faltas;
        this.dependencia = dependencia;
    }
    
    @Override //sobreescrita do método exibirDados
     public void exibirDados(){
        System.out.println("O RA do aluno é " + ra + 
                            ", este aluno possui "+ faltas + " faltas." +
                            " Tem dependências? " + dependencia);
    }
    
    //sobrecarga do método exibirDados
    public void exibirDados(boolean resp){
        super.exibirDados();
        System.out.println("RA: " + ra + "\nMédia: " + media + "\nFaltas: "+ faltas);
    }
    
}//fim da classe
