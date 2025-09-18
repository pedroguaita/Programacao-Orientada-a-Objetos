//sessão de importação
import javax.swing.JOptionPane;

/**
 * Classe criada para demonstrar o recurso de sobrecarga de métodos
 * @author Pedro Pereira Guaita
 * @since Classe criada em 18/09/2025
 */
public class Figura {
    
    Integer a, b, c, d;
    
    //Construtor para um Ponto
    Figura(int a){
        this.a = a;
    }
    
    //Construtor para uma Linha
    Figura(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    //Construtor para um Triângulo
    Figura(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //Construtor para um Retângulo
    Figura(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    /**
     * Método genérico para exibir qualaquer tipo de Figura
     * Este método identificará automaticamente qual é o tipo de Figura que foi instanciada
     *
     */
     
    public void exibirFigura(){
        if(a != null && b == null && c == null && d == null)
            exibirFigura(1);
        else if(a != null && b != null && c == null && d == null)
            exibirFigura(1, 2);
        else if(a != null && b != null && c != null && d == null)
            exibirFigura(true);
        else
            exibirFigura(4.5f, "abcd");
    }
    

    /**
     * Método comum para exibir os dados do Ponto
     * Devera ser passado um número inteiro 
     * @param x um valor inteiro
     * @return Um objeto do tipo Ponto
     */
    public void exibirFigura(int x){
        JOptionPane.showMessageDialog(null, "É um ponto de valor: " + a, "PONTO", -1);
        //System.out.println("É um ponto de valor: " + a);
    }
    
    //Método comum para exibir os dados de uma Linha
    public void exibirFigura(int x, int y){
        JOptionPane.showMessageDialog(null, "É uma linha de coordenadas " + a + " e " + b,"LINHA", -1);
        //System.out.println("É uma linha de coordenadas " + a + " e " + b);
    }
    
    //Método comum para exibir os dados de um Triângulo
    public void exibirFigura(boolean z){
        JOptionPane.showMessageDialog(null, "É um Triângulo de valores " + a + " , " + b + " e " + c,"TRIÂNGULO", -1);
        //System.out.println("É um triângulo os valores " + a + ", " + b + " e " + c);
    }
    
    //Método comum para exibir os dados de um Retângulo
    public void exibirFigura(float f, String g){
        JOptionPane.showMessageDialog(null, "É um Retângulo de valores " + a + ", " + b + ", " + c + " e " + d,"RETÂNGULO", -1);
        //System.out.println("É um retângulo cujas coordenadas sao: " + a + ", " + b + ", " + c + ", " + d);
    }
    
}//fim da classe
