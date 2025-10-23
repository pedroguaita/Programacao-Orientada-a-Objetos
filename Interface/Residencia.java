/**
 * Classe criada para instaciar objetos do tipo eletrodoméstico e testar suas funcionalidades
 * @author Pedro Pereira Guaita
 * @since Classe criada em 23/10/2025
 */
public class Residencia {
    public static void main(String[] args) throws InterruptedException {
        
        /*
        TV tv = new TV("LG", 65, false);
        tv.ligar();
        tv.desligar(5);
        */
        System.out.println("");
        
        Microondas micro = new Microondas("Brastemp", 10, 30, false);
        micro.timer(5);
        micro.mais30seg();
        micro.desligar();
        
        //micro.pipoca();
    }
}//fim da classe
