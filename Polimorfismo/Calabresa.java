
/**
 * Classe criada para implementar TODOS os métodos abstratos da interface Pizza
 * @author Pedro Pereira Guaita
 * @since Classe criada em 30/10/2025
 */
public class Calabresa implements IPizza{

    @Override
    public void montar() {
        System.out.println("Pizza de calabresa");
        System.out.println("Calabresa, molho de tomate, cebola, azeitonas pretas");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 15 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$60,00");
    }
    
}//fim da classe
