/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para instanciar objetos do tipo Produto e Venda
 * @author Pedro Guaita
 */
public class Mercado {
    public static void main(String[] args) {
        Produto p1, p2, p3, p4, p5;
        Venda v1, v2;
        
        //Produtos disponíveis para compra (instâncias/ objetos)
        p1 = new Produto(10, "Vassoura", 23.0f);
        p2 = new Produto(15, "Arroz", 7.83f);
        p3 = new Produto(20, "Detergente", 1.75f);
        p4 = new Produto(25, "Esponja", 1.25f);
        p5 = new Produto(30, "Feijão", 4.92f);
        
        //Intâncias de Vendas
        v1 = new Venda(101, "Carlos Alberto");
        v2 = new Venda(205, "Camila Souza");
        
        v1.adicionarProduto(p1);
        v1.adicionarProduto(p2);
        v1.adicionarProduto(p3);
        
        v2.adicionarProduto(p4);
        v2.adicionarProduto(p3);
        v2.adicionarProduto(p5);
        System.out.println("----------------------");
        
        //Listagem de produtos da venda 1
        v1.listarProdutos();
        v1.totalizarCompra();
        System.out.println("Cliente: " + v1.cliente);
        System.out.println("======================");
        
        //Listagem de produtos da venda 2
        v2.listarProdutos();
        v2.totalizarCompra();
        System.out.println("Cliente: " + v2.cliente);
        System.out.println("======================");
    }
}
