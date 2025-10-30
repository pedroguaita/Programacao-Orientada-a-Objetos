/**
 * Classe criada para gerar um objeto do tipo Pizza
 * @author Pedro Pereira Guaita
 * @since Classe criada em 30/10/2025
 */
public class FrangoCatupiry implements IPizza{

    @Override
    public void montar() {
        System.out.println("Pizza de frango com catupiry");
        System.out.println("Molho de tomate, frango, catupiry e azeitona verdes");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 12 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$70,00");
    }

}//fim da classe
