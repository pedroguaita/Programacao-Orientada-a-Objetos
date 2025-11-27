

/**
 *
 * @author 2830482411036
 */
public class Produto {
    int codigo;
    String nome;
    float valor;
    
    public Produto(int codigo, String nome, float valor){
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }
    
    public void exibirProduto(){
        System.out.println("Codigo: " + codigo +
                         "\nProduto: " +nome + 
                         "\nPreço: " + valor);
    }
}
