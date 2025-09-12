/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacaoorientadaobjetos;

/**
 * Classe criada para demonstrar o princípio da Herança entre classes
 * @author Pedro Pereira Guaita
 * @since Classe criada em 11/09/2025
 */

// package veiculos; // <-- se usar pacotes, descomente e ajuste

public class Concessionaria {
    public static void main(String[] args) {
        // TIPO  VAR REF
        Carro carro = new Carro("BMW", "M3 Competition", "Preto", 2023, 850000.0f, 250, false);
        carro.exibirDadosCarro();

        Carro car = new Carro();
        car.exibirDadosCarroGUI();

        Caminhao caminhao = new Caminhao("Scania", "giga", "branco", 2025, 200000.0f, "Grade baixa", 10.0f, 4);
        caminhao.exibirDadosCaminhao();

        Caminhao cam = new Caminhao();
        cam.exibirDadosCaminhaoGUI();
    }
} // fim da classe
