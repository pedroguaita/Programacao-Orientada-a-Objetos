

/**
 * Interface para servir de padrão para todo e qualquer tipo de pizza
 * Possui as funcionalidades "montar", "assar" e "cobrar".
 * @author Pedro Pereira Guaita
 * @since 30/10/2025
 */
public interface IPizza {
    //método para montar a pizza
    public void montar();
    
    //método para o tempo que a pizza ficará no forno
    public void assar();
    
    //método para cobrar o valor da pizza de acordo com o sabor
    public void cobrar();
}
