/**
 * Classe criada para exibir diversos frames contínuos na tela
 * @author Pedro Pereira Guaita
 * @since Classe criada em 13/11/2025
 */
public class Virus {
    public static void main(String[] args) {
        int x = 0;
        while(x < 5){
            Janela j1, j2, j3, j4;
            j1 = new Janela();
            j2 = new Janela();
            j3 = new Janela();
            j4 = new Janela();

            j1.start();
            j2.start();
            j3.start();
            j4.start();
            x++;
        }
        
    }//fim do main

}//fim da classe
