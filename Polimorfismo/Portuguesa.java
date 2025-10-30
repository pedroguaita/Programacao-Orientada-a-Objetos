
/**
 * Classe criada para...
 * @author Pedro Pereira Guaita
 * @since Classe criada em 30/10/2025
 */
public class Portuguesa implements IPizza{
    @Override
    public void montar() {
        System.out.println("Pizza de portuguesa");
        System.out.println("Presunto, ovo, cebola, ervilha, azeitona e queijo");
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
