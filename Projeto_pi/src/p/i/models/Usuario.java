package p.i.models;

public class Usuario {
	private int cpf;
	private String nome;
	private String email;
	
	public Usuario(int cpf,String nome,  String email){
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	public int getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

