/**
 * Classe criada para...
 * @author Pedro Pereira Guaita
 * @since Classe criada em 30/10/2025
 */
public class RomeuJulieta implements IPizza{

    @Override
    public void montar() {
        System.out.println("Pizza sabor Romeu e Julieta");
        System.out.println("Queijo, goiabada e leite condensado");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 7 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor R$65,00");
    }
    
    public void adicionarIngrediente(){
        System.out.println("Informar o que deseja a mais");
    }

}//fim da classe
