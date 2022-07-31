package entidade;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String cpf;
	private String email;
	private ArrayList <Pruu> pruus;
	
	
	public Usuario() {
		super();
	}

	public Usuario(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		}

	public void darLike(Pruu like) {
		like.somarLike();

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Pruu> getPruus() {
		return pruus;
	}

	public void setPruus(ArrayList<Pruu> pruus) {
		this.pruus = pruus;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", pruus=" + pruus + "]";
	}
	
	
	
	
}
