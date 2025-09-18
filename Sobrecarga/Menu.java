//sessão de importação
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para exibir um Menu de opções para o usuário
 * @author Pedro Pereira Guaita
 * @since Classe criada em 18/09/2025
 */
public class Menu {
    
    int a, b, c, d;
    int opcao;
    String msg;
    Figura figura;
    
    public Menu(){
        
        boolean flag;
        
        msg = "1 - Ponto\n2 - Linha \n3 - Triângulo\n4 - Retângulo";
        msg = msg + "\n5 - Finalizar o programa";
        
       while(true){
           
           flag = false;
           opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
        
            switch(opcao){
                case 1: 
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Ponto: "));
                    figura = new Figura(a);
                    break;
            
                case 2: 
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial da Linha: "));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final da Linha: "));    
                    figura = new Figura(a,b);
                    break;

                case 3:
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro ponto do Triângulo: "));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo ponto do Triângulo: ")); 
                    c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do terceiro ponto do Triângulo: "));
                    System.out.println("Construindo Triângulo...");
                    figura = new Figura(a,b,c);
                    break;

                case 4:
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro ponto do Retângulo: "));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo ponto do Retângulo: ")); 
                    c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do terceiro ponto do Retângulo: "));
                    d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do terceiro ponto do Retângulo: "));
                    System.out.println("Construindo Retângulo...");
                    figura = new Figura(a,b,c,d);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    flag = true;
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    System.out.println("Opção inválida!");
                    break;
                
            }//fim do switch
            if(flag != true)
                figura.exibirFigura();
        
       }//fim do while
        
    }//fim do construtor

}//fim da classe
