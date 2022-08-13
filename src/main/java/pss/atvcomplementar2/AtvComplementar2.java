/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pss.atvcomplementar2;

import Collection.ContaCollection;
import Collection.UsuarioCollection;
import Util.Autenticador;
import Util.AutenticadorCPF;
import Util.AutenticadorDeSenha;
import Util.Autorizacao;
import Util.AutorizacaoPadrao;
import Util.GerenciadorDeAutorizacao;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import model.Componente;
import model.ContaCorrenteProxy;
import model.Usuario;

/**
 *
 * @author jhonatan
 */
public class AtvComplementar2 {

    public static void main(String[] args) throws IOException {
        int contador =0;
        Set<String> autorizacoes = new HashSet<String>();
        autorizacoes.add("sacar");
        autorizacoes.add("depositar");
        autorizacoes.add("transferir");
        autorizacoes.add("desativar");
        
        UsuarioCollection listUsuarios = new UsuarioCollection();
        
        
        Componente usuario1 = new Usuario("Jose Maria", "Usuario Comum", "Jose", "123", autorizacoes, "11111");
        autorizacoes.add("ativaAll");
        autorizacoes.add("desativaAll");
        autorizacoes.add("getSaldo");
        Componente usuario2 = new Usuario("Maria", "Gerente", "Maria", "321", autorizacoes, "33333");
        listUsuarios.addPessoa(usuario1);
        listUsuarios.addPessoa(usuario2);
        Autorizacao autorizacao = new AutorizacaoPadrao();
        GerenciadorDeAutorizacao gerenciadorAutorizacao = new GerenciadorDeAutorizacao(autorizacao);
        
        ContaCorrenteProxy conta1 = new ContaCorrenteProxy(gerenciadorAutorizacao, "1", usuario1);
        ContaCorrenteProxy conta2 = new ContaCorrenteProxy(gerenciadorAutorizacao, "2", usuario1);
        ContaCollection listContas = new ContaCollection();
        listContas.add(conta1);
        listContas.add(conta2);
        
        
        Autenticador autenticadorCPF = new AutenticadorCPF();
        Autenticador autenticadorSenha = new AutenticadorDeSenha();
        boolean flag=false;
        
        
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        String loginUsuario = null;
        while (flag != true){
            contador++;
            System.out.println("Insira seu nome de usuario");
            loginUsuario = scanner.next();

            System.out.println("Insira sua senha");
            String senha = scanner.next();
            flag = autenticadorSenha.valida(loginUsuario, senha, listUsuarios);
            if(flag == false){
                System.out.println("Login ou senha incorreta");
            }
            if(contador == 3)
                System.exit(0);
            System.out.println();
            System.out.println();
        }
        
        contador= 0;
        flag=false;
        while (flag != true){
            contador++;
            System.out.println("Insira os 3 primeiros digigitos do seu CPF");
            String cpf = scanner.next();     
            flag = autenticadorCPF.valida(loginUsuario, cpf, listUsuarios);
            if(flag == false){
                System.out.println("CPF incorreto");
            }
            if(contador == 3)
                System.exit(0);
            System.out.println();
            System.out.println();
        }


        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        int opc=0;
        
        double valor = 0;
        
        while(opc != 8){
            
            System.out.println("--- Bem Vindo ---");
            System.out.println("Escolha uma das opções possiveis");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Realizar deposito");
            System.out.println("3 - Realizar saque");
            System.out.println("4 - Realizar pagamento");
            System.out.println("5 - Realizar transferencia");
            System.out.println("6 - Ativar conta");
            System.out.println("7 - Desativar conta");
            System.out.println("8 - Sair");
            opc = scanner.nextInt();
            
            if(opc == 2 || opc == 3 || opc == 4 || opc == 5){
                System.out.println("Informe o valor:");
                valor = scanner.nextDouble();
                if(valor < 0){
                    opc = 10;
                }
            }
            System.out.println();
            System.out.println();
            System.out.println();
            switch (opc) {
                case 1:
                    System.out.println("Seu saldo é: " + conta1.getSaldo());                    
                    break;
                case 2:
                    conta1.depositar(valor);
                    break;
                case 3:                  
                    conta1.sacar(valor);
                    break;
                case 4:
                   conta1.pagar(valor);
                   break;
                case 5:
                    System.out.println("Informe o numero da conta de destino:");
                    String numeroContaDestino = scanner.next();
                    ContaCorrenteProxy contaDestino = listContas.buscaByNumber(numeroContaDestino);
                    if(contaDestino != null){
                        conta1.transferir(opc, contaDestino);
                    } else {
                        System.out.println("Conta invalida");
                    }                   
                    break;
                case 6:
                    conta1.ativar();
                    break;
                case 7:
                    conta1.desativar();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("O número escolhido é inválido! Digite um número entre 1 a 10.");
            }
            
            scanner.next();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
        
    }
}
