/**
 * Classe criada para gerar objetos do tipo Microondas que implementam
 * TODOS os métodos da iterface Eletrodomestico
 * @author Pedro Pereira Guaita
 * @since Classe criada em 23/10/2025
 */
public class Microondas implements IEletrodomestico{
    
    String marca;
    int litros;
    int potencia;
    boolean ligado;

    public Microondas(String marca, int litros, int potencia, boolean ligado) {
        this.marca = marca;
        this.litros = litros;
        this.potencia = potencia;
        this.ligado = false;
    }
    
     @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("O microondas " + marca + " está ligado."); 
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("Piiiiiii - aparelho desligado!");
    }
    
    public void ligar(int tempo) throws InterruptedException{
        ligar();
        timer(tempo);
        desligar();
    }
    
    public void timer(int tempo) throws InterruptedException{
         while(tempo > 0){
            System.out.println(tempo);
            Thread.sleep(1000);  //equivale a 1 segundo
            tempo--;
        }
        desligar();
    }
    
    public void pipoca() throws InterruptedException{
        int tempo = 120;
        System.out.println("A tecla pipoca foi ativada!");
        timer(tempo);
        desligar();
        System.out.println("\nPipoca pronta");
    }
   
    public void mais30seg() throws InterruptedException{
        int tempo = 30;
        timer(tempo);
    }

}//fim da classe
