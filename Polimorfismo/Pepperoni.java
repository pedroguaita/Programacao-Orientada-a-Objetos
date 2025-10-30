
/**
 * Classe criada para...
 * @author Pedro Pereira Guaita
 * @since Classe criada em 30/10/2025
 */
public class Pepperoni implements IPizza{
    @Override
    public void montar() {
        System.out.println("Pizza de pepperoni");
        System.out.println("Salsicha pepperoni, queijo, tomate");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 10 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$65,00");
    }
}//fim da classe
