
import javax.swing.JOptionPane;


/**
 * Classe criada para apresentar um menu de opções ao cliente com os diversos sabores de pizza e o pão
 * @author Pedro Pereira Guaita
 * @since Classe criada em 30/10/2025
 */
public class Menu {
    
    IPizza pizza;
    Forno forno = new Forno();
    String msg;
    
    public Menu(){
        int opc = 0;
        
        msg = "1 - Frango com catupiry";
        msg = msg + "\n2 - Calabresa";
        msg = msg + "\n3 - Cinco Queijo";
        msg = msg + "\n4 - Marguerita";
        msg = msg + "\n5 - Portuguesa";
        msg = msg + "\n6 - Pepperoni";
        msg = msg + "\n7 - Nutella com morango";
        msg = msg + "\n8 - Romeu e Julieta";
        msg = msg + "\n9 - Pão caseiro";
        msg = msg + "\n10 - Sair";
        
        opc = Integer.parseInt(JOptionPane.showInputDialog(msg));
        
        switch(opc){
            case 1: pizza = new FrangoCatupiry(); 
                    break;
            
            case 2: pizza = new Calabresa();
                    break;
            
            case 3: pizza = new CincoQueijos(); 
                    break;
            
            case 4: pizza = new Marguerita(); 
                    break;
            
            case 5: pizza = new Portuguesa(); 
                    break;
            
            case 6: pizza = new Pepperoni(); 
                    break;
            
            case 7: pizza = new NutellaMorango(); 
                    break;
            
            case 8: pizza = new RomeuJulieta(); 
                    break;
            
            case 9: pizza = new PaoCaseiro(); 
                    break;
            
            case 10: System.exit(0);
                    break;
            
            default: JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
                
        }// fim do swicth
        
        //Objeto polimórfico
        forno.preparar(pizza);
        
    }// fim do construtor
      
}//fim da classe
