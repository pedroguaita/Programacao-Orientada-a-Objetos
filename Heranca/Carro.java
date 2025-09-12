/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacaoorientadaobjetos;




//sessao de importação
import javax.swing.JOptionPane;

/**
 * Classe criada para herdar TODOS os atributos e métodos da superclasse Veiculo
 * @author Pedro Pereira Guaita
 * @since Classe criada em 11/09/2025
 */

public class Carro extends Veiculo {
    
  int volPortaMalas;
  boolean conversivel;
  
  //construtor para um objeto do tipo Carro em memória
  public Carro(String marca, String modelo, String cor, int ano, float valor, int volPortaMalas, boolean conversivel){
      super(marca, modelo, cor, ano, valor); //sempre ser a primeira coisa a ser chamada no construtor
      
      this.volPortaMalas = volPortaMalas;
      this.conversivel = conversivel;
  }
  
  //Construtor para entrada de dados com GUI
  public Carro(){
      this.volPortaMalas = Integer.parseInt(JOptionPane.showInputDialog("Volume do Porta-malas: "));
      String resp = JOptionPane.showInputDialog("Conversível: ");
      
      if("Sim".equals(resp) || resp.equals("sim"))
          this.conversivel = true;
      else
          this.conversivel = false;
  }
  
  //Métodos para exibir os dados de Carro
  public void exibirDadosCarro(){
      super.exibirDadosVeiculo();
      System.out.println("Volume do porta malas: " + volPortaMalas);
      
    //System.out.println("É conversível: " + (conversivel == true ? "Sim" : "Não"));
      System.out.println("É conversível: " + (conversivel ? "Sim" : "Não"));
  }
  
  //Método comum para exibir os dados de um CARRO por meio de GUI
  //Graphical User Interface
    public void exibirDadosCarroGUI(){
        String msg;
        
        msg = "Marca: " + marca;
        msg = msg + "\nModelo: " + modelo;
        msg = msg + "\nCor: " + cor;
        msg = msg + "\nAno de Fabricação: " + ano;
        msg = msg + "\nValor(R$): " + valor;
        msg = msg + "\nVolume de Porta-Malas: " + volPortaMalas;
        msg = msg + "\nConversível: " + conversivel;
        JOptionPane.showMessageDialog(null, msg, "DADOS DO CARRO", -1);        
    }

}//fim da classe
