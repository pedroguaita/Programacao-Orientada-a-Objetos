
/**
 * Classe criada para instanciar os objetos do tipo thread e propor o paralelismo
 * @author Pedro Pereira Guaita
 * @since Classe criada em 06/11/2025
 */
public class Processo {
    public static void main(String[] args) {
        while(true){
            Threads t1 = new Threads("Pedro");
            Threads t2 = new Threads("Giovanna");
            Threads t3 = new Threads("Toby");
            Threads t4 = new Threads("Scooby");
            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }
    }
}//fim da classe
