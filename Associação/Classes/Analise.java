/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para analisar um objeto do tipo de Pessoa
 * @author Pedro Pereira Guaita
 * @since Classe criada em 04/09/2025
 */
public class Analise {
    
    //Método comum para analisar uma pessoa
    public String analisarIdadePessoa(Pessoa p){
        
        if(p.idade < 2)
            return p.nome + "é Bebê";
        else if(p.idade < 13)
            return p.nome + " é uma Criança";
        else if(p.idade < 20)
            return p.nome + " é um(a) adolescente";
        else if(p.idade <= 60)
            return p.nome + " é um(a) adulto(a)";
        else if(p.idade < 85)
            return p.nome + " é um(a) Idoso(a)";
        else
            return "Matusalém";
    }
    
    //Método comum para analisar a altura de uma pessoa
    public String analisarAlturaPessoa(Pessoa p){
        
        if(p.altura < 1.20)
            return "Anão";
        else if(p.altura < 1.60)
            return "Muito baixa";
        else if(p.altura < 1.70)
            return "Altura baixa";
        else if(p.altura < 1.80)
            return "Altura média";
        else if(p.altura < 1.90)
            return "Altura alta";
        else
            return "Altura muito alta";
    }
    
    //Método para comparar dois objetos do tipo Pessoa
    public String compararIdadePessoas(Pessoa a, Pessoa b){
        
        if(a.idade > b.idade)
            return a.nome + " é mais velho que " + b.nome;
        else if(a.idade < b.idade)
            return b.idade + " é mais velho que "+ a.nome;
        else
            return "Ambos tem a mesma idade";
    }
    
}//fim da classe
