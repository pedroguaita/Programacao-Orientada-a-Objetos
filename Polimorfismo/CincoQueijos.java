/**
 * Classe criada para implementar todos os métodos abstratos da Interface IPizza
 * 
 * @author Pedro Pereira Guaita
 * @since Classe criada em 30/10/2025
 */
public class CincoQueijos implements IPizza{

    @Override
    public void montar() {
        System.out.println("Pizza de Cinco Queijos");
        System.out.println("Mussarela, provolone, gorgonzola, parmesão, cheedar, tomate, orégano, ");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 9 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$75,00");
    }
    
}//fim da classe
