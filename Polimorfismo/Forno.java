/**
 * Classe criada para gerar o objeto polimórfico forno que irá preparar todo e qualquer tipo de Pizza
 * @author Pedro Pereira Guaita
 * @since Classe criada em 30/10/2025
 */

public class Forno {
    
    public void preparar(IPizza pizza){
        pizza.montar();
        pizza.assar();
        pizza.cobrar();
    }
    
}//fim da classe
