/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para instanciar objetos do tipo TV que implementarão TODOS os métodos da interface Eletrodoméstico
 * @author Pedro Pereira Guaita
 * @since Classe criada em 23/10/2025
 */
public class TV implements IEletrodomestico{
    
    String marca;
    int polegada;
    boolean ligado;

    //Construtor do objeto TV
    public TV(String marca, int polegada, boolean ligado) {
        this.marca = marca;
        this.polegada = polegada;
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("A TV " + marca + " foi ligada."); 
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("A TV foi desligada.");
    }
    
    public void desligar(int tempo) throws InterruptedException{
        while(tempo >= 0){
            System.out.println(tempo);
            Thread.sleep(1000);  //equivale a 1 segundo
            tempo--;
        }
        
        desligar();
    }
    
}//fim da classe
