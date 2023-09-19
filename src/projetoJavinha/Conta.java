package projetoJavinha;

public class Conta {
		private static int NumeroCartao = 0;
	private String TipoConta;
	private int Saldo;
	private Usuario usuario;
	private String senha;
	
	
	
	public Conta(int numeroConta, String tipoConta, int saldo, Usuario usuario, String senha) {
		NumeroCartao =+ 1;
		this.TipoConta = tipoConta;
		this.Saldo = saldo;
		this.usuario=usuario;
		this.senha=senha;
	}


	public int pegarNumeroCartao() {
		return NumeroCartao;
	}

	public void inserirNumeroCartao(int numeroCartao) {
		NumeroCartao = numeroCartao;
	}

	public String pegarTipoConta() {
		return TipoConta;
	}

	public void enviarTipoConta(String tipoConta) {
		TipoConta = tipoConta;
	}

	public int pegarSaldo() {
		return Saldo;
	}

	public void inserirSaldo(int saldo) {
		Saldo = saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	

}