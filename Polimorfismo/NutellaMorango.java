
/**
 * Classe criada para...
 * @author Pedro Pereira Guaita
 * @since Classe criada em 30/10/2025
 */
public class NutellaMorango implements IPizza{
    @Override
    public void montar() {
        System.out.println("Pizza sabor Romeu e Julieta");
        System.out.println("Nutella e morango");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 5 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor R$65,00");
    }
}//fim da classe
