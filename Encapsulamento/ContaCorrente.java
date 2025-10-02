package encapsulamento;

import javax.swing.JOptionPane;

/**
* Classe criada para exemplificar o uso de Encapsulamento
* @author Pedro Pereira Guaita
* @since Classe criada em 02/10/2025
*/

public class ContaCorrente {

    // ATRIBUTOS
    private String cliente;
    private float saldo;
    private int senha;
    private int tentativas;       
    private boolean bloqueada;    

    // Construtor
    public ContaCorrente(String cliente, float saldo, int senha){
        this.cliente = cliente;
        this.saldo = saldo;
        this.senha = senha;
        this.tentativas = 0;
        this.bloqueada = false;
    }

    // Exibir dados da conta
    public void exibirDadosContaCliente(){
        System.out.println("Nome do cliente: " + cliente);
        System.out.println("Saldo: " + saldo);
    }

    private boolean verificarSenha(String verificar){
        if (bloqueada){
            JOptionPane.showMessageDialog(null, "Conta bloqueada! Procure o gerente.");
            return false;
        }
        int pwd = Integer.parseInt(JOptionPane.showInputDialog(verificar));
        if (pwd != senha){
            tentativas++;
            JOptionPane.showMessageDialog(null, "Senha inválida! Tentativa " + tentativas + " de 3.");
            if (tentativas > 3){
                bloqueada = true;
                JOptionPane.showMessageDialog(null, "Conta BLOQUEADA após 3 tentativas erradas!");
            }
            return false;
        }

        tentativas = 0;
        return true;
    }

     private boolean verificarSenha(){
        return verificarSenha("Senha: ");
    }

    public void realizarSaque(){
        if (!verificarSenha())
            return;
        float valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Valor a sacar: "));
        
        if (valorSaque > saldo){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        } 
        else if (valorSaque <= 0){
            JOptionPane.showMessageDialog(null, "Valor inválido para saque!");
        } 
        else {
            saldo -= valorSaque;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!\nSaldo atual: " + saldo);
        }
    }

    public void realizarDeposito(){
        if (bloqueada){
            JOptionPane.showMessageDialog(null, "Conta bloqueada! Procure o gerente.");
            return;
        }
        float valorDeposito = Float.parseFloat(JOptionPane.showInputDialog("Valor a depositar: "));
        if (valorDeposito <= 0){
            JOptionPane.showMessageDialog(null, "Valor inválido para depósito!");
        } 
        else {
            saldo += valorDeposito;
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!\nSaldo atual: " + saldo);
        }
    }

    public void trocarSenha(){
        if (!verificarSenha("Digite sua senha atual: ")) 
            return;
        int novaSenha = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova senha: "));
        this.senha = novaSenha;
        JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
    }

    // Métodos assessores
    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    private float getSaldo(){
        return this.saldo;
    }

    private void setSaldo(float saldo){
        this.saldo = saldo;
    }

    private int getSenha(){
        return this.senha;
    }

    private void setSenha(int senha){
        this.senha = senha;
    }

}// fim da classe
 