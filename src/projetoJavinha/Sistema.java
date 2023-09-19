package projetoJavinha;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	static Scanner entrada = new Scanner(System.in);
	static ArrayList<Conta> ListaCliente = new ArrayList<Conta>();

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		System.out.println("Olá, seja bem vindo! Escolha qual ação deseja realizar:");
		System.out.println("1- Login");
		System.out.println("2- Cadastrar");
		System.out.println("3- Sair");
		
		int Escolha = entrada.nextInt();
		
		switch(Escolha) {
		case 1:
			login();
			
			
			break;
			
		case 2:
			cadastrar();
			
			break;
		
		
		case 3:
			System.out.println("Tchau porra");
			break;
			
		 default:
			System.out.println("Opa opa opa, algo deu errado amigo, pare de ser leigo");
			
			 menu(); 
			 break;
		}
	}
	
	public static void login() {
		entrada.nextLine();
		
		System.out.println("Digite o numero do seu cartão");
		int numeroConta = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Digite sua senha");
		String senha = entrada.nextLine();


	}
	
	public static void cadastrar() {
		entrada.nextLine();

		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();

		System.out.println("Digite seu CPF");
		String cpf = entrada.nextLine();
		
		System.out.println("Digite sua idade");
		String idade = entrada.nextLine();

		System.out.println("Digite seu telefone");
		String telefone = entrada.nextLine();
		
		System.out.println("Digite CC, para conta corrente, ou CP para conta poupança.");
		String tipoConta = entrada.nextLine();
		
		System.out.println("Crie uma sua senha");
		String senha = entrada.nextLine();
		
		Usuario usuario = new Usuario(nome, cpf, telefone, idade);
		Conta conta = new Conta(0, tipoConta, 0, usuario, senha);
		
		ListaCliente.add(conta);
		System.out.println("Este é o numero da sua conta " + conta.pegarNumeroCartao());
			menu();

		
	}

}