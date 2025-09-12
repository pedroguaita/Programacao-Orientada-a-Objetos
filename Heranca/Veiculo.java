
package programacaoorientadaobjetos;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para demonstrar o princípio da Herança entre classes
 * @author Pedro Pereira Guaita
 * @since Classe criada em 11/09/2025
 */
public class Veiculo {
    
    String marca;
    String modelo;
    String cor;
    int ano;
    float valor;
    
    
    //Método construtor responsável por criar um objeto em memória
    public Veiculo(String marca, String modelo, String cor, int ano, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }
   
    //construtor para a entrada de dados com GUI
    public Veiculo(){
        this.marca = JOptionPane.showInputDialog("Marca: ");
        this.modelo = JOptionPane.showInputDialog("Modelo: ");
        this.cor = JOptionPane.showInputDialog("Cor: ");
        this.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de fabricação: "));
        this.valor = Float.parseFloat(JOptionPane.showInputDialog("Valor(R$): "));
    }
    
    //Método comum para exibir os dados de veículo
    public void exibirDadosVeiculo(){
       System.out.println("Marca: " + marca);
       System.out.println("Modelo: " + modelo);
       System.out.println("Ano de fabricação: " + ano);
       System.out.println("Cor: " + cor);
       System.out.println("Valor(R$): " + valor);
    }
    
    
    
}//fim da classe
