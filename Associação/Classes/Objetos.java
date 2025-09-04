/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para instanciar objetos do tipo Pessoa
 * @author Pedro Pereira Guaita
 * @since Classe criada em 04/09/2025
 */
public class Objetos {
    public static void main(String[] args) {
        /*
        Pessoa x, y, z;
        x = new Pessoa("Márcia", 55, 1.55f);
        y = new Pessoa("Giovanna", 19, 1.68f);
        
        x.exibirDadosPessoa();
        y.exibirDadosPessoa();
        
        x = y;
        x.exibirDadosPessoa();
        */
        
        Pessoa p1, p2;
        
        p1 = new Pessoa();
        p2 = new Pessoa();
        Analise analise = new Analise();
        
        //tipo   var         construtor
        //Pessoa pessoa1 = new Pessoa("Pedro", 20, 1.68f, 81.0f); //pessoa = variável de referência 
        //Pessoa pessoa2 = new Pessoa("Giovanna", 20, 1.68f, 83.0f);
        
        //exibir dados
        p1.exibirDadosPessoa();
        System.out.println(" ");
        System.out.println(analise.analisarIdadePessoa(p1));
        
        System.out.println(" ");
        p2.exibirDadosPessoa();
        System.out.println(" ");
        System.out.println(analise.analisarIdadePessoa(p2));
        System.out.println(" ");
        
        System.out.println(analise.compararIdadePessoas(p1, p2));
        
    }//fim do main
    
}//fim da classe
