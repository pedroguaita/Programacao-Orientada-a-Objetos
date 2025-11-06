/**
 * Classe criada para gerar Threads que executam uma determinada tarefa
 * @author Pedro Pereira Guaita
 * @since Classe criada em 06/11/2025
 */
public class Threads extends Thread{
    int sleepTime;
    
    public Threads(String nome){
        super(nome);
        sleepTime = (int)(Math.random() * 5000);
        System.out.println("A Thread " + getName() + " vai dormir por " + sleepTime + " ms.");
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException ex) {
            System.out.println("A Thread " + getName() + " foi interrompida.");
        }
        System.err.println("A Thread " + getName() + " =====> ACORDOU.");
    }
}//fim da classe
