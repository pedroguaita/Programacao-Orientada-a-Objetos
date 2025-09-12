
package programacaoorientadaobjetos;

import javax.swing.JOptionPane;

/**
 * Classe criada para...
 * @author Pedro Pereira Guaita
 * @since Classe criada em 11/09/2025
 */

public class Caminhao extends Veiculo{
    
    String carroceria;
    float tara;
    int eixos;
    
    //Método contrutor para um objeto do tipo Caminhao 
    public Caminhao (String marca, String modelo, String cor, int ano, float valor, String carroceria, float tara, int eixos){
        super(marca, modelo, cor, ano, valor);
        
        this.carroceria = carroceria;
        this.tara = tara;
        this.eixos = eixos;
    }
    
    public Caminhao(){
        this.carroceria = JOptionPane.showInputDialog("Carroceria: ");
        this.tara = Float.parseFloat(JOptionPane.showInputDialog("Tara: "));
        this.eixos = Integer.parseInt(JOptionPane.showInputDialog("Eixos: "));
    }
    
    //Métodos para exibir os dados de Caminhao
    public void exibirDadosCaminhao(){
      super.exibirDadosVeiculo();
      
      System.out.println("Carroceria: " + carroceria);
      System.out.println("Tara: " + tara);
      System.out.println("Eixos " + eixos);
    }
      
   //Método comum para exibir os dados de um CAMINHAO por meio de GUI
   //Graphical User Interface
  
     public void exibirDadosCaminhaoGUI(){
                
        String msg = "Marca: " + marca;
        msg = msg + "\nModelo: " + modelo
                  + "\nCor: " + cor
                  + "\nAno de Fabricação: " + ano
                  + "\nValor(R$): " + valor
                  + "\nCarroceria: " + carroceria
                  +"\nTara: " + tara
                  +"\nEixos: " + eixos;
        JOptionPane.showMessageDialog(null, msg, "DADOS DO CAMINHÃO", -1);        
    }
  
}//fim da classe
