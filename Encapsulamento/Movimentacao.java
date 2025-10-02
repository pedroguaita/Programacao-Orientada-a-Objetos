package encapsulamento;

/**
 * Classe criada para criar instâncias de conta corrente e testar o encapsulamento
 * @author Pedro Pereira Guaita
 * @since Classe criada em 02/10/2025
 */
public class Movimentacao {
    public static void main(String[] args) {
    //               var de referencia(cc)  
        ContaCorrente cc = new ContaCorrente("Pedro Pereira Guaita", 1000.00f, 12345);
        cc.exibirDadosContaCliente();
        cc.realizarDeposito();
        cc.realizarSaque();
        cc.trocarSenha();
        cc.exibirDadosContaCliente();
    }
    
}//fim da classe
