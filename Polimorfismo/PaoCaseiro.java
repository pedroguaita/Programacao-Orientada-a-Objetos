/**
 * Classe criada para instanciar um objeto do tipo PaoCasaeiro
 * para ser preparado pelo objeto polimórfico forno
 * @author Pedro Pereira Guaita
 * @since Classe criada em 30/10/2025
 */
public class PaoCaseiro implements IPizza{

    @Override
    public void montar() {
        System.out.println("Pão caseiro");
        System.out.println("Farinha, leite, ovos, fermento, sal, açúcar e óleo");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 40 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$15,00");
    }
    
}//fim da classe
