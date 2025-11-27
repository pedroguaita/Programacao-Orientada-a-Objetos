import java.util.ArrayList;

/**
 * Classe criada para gerar um objeto do tipo venda
 * @author 2830482411036
 */
public class Venda {
    int codigo;
    String cliente;
    ArrayList<Produto>itens = new ArrayList();
    
    public Venda(int codigo, String cliente){
        this.codigo = codigo;
        this.cliente = cliente;
    }
    
    //método que relaciona o produto com a venda
    public void adicionarProduto(Produto p){
        itens.add(p);
        System.out.println("Item adicionado à venda!");
    }
    
    public void removerItemProduto(Produto p){
        itens.remove(p);
    }
    
    //exibir todo o conteúdo dos produtos comprados pelo cliente
    public void listarProdutos(){
        for (Produto x: itens)
        {
            System.out.println("Produto: " + x.nome);
            System.out.println("Valor: " + x.valor);
        }
    }
    
    public void indicesProduto(){
         for (Produto x:itens)
         {
             System.out.println("Produto: " + itens);
         }
     }
    
    public void totalizarCompra(){
        float total = 0;
        for (Produto x: itens){
            total = total + x.valor;
        }
        System.out.println("Total: " + total);
    }
}
