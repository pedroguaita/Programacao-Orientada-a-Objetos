
/**
 * Classe criada para...
 * @author Pedro Pereira Guaita
 * @since Classe criada em 30/10/2025
 */
public class Marguerita implements IPizza{

    @Override
    public void montar() {
        System.out.println("Pizza de marguerita");
        System.out.println("Queijo, tomate, manjeiricão e azeite");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 9 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$70,00");
    }

}//fim da classe
