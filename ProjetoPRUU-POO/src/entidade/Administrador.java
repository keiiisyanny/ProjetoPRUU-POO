package entidade;

public class Administrador extends Usuario{
	
	//Construtores//
	
	public Administrador() {
		super();
	}
	
	public Administrador(String nome, String cpf, String email) {
		super(nome, cpf, email);
	}
	
	public void bloquearPruu(Pruu pruuBloquear) {
		pruuBloquear.setBloquear(true);
	}
	
	public void desbloquearPruu(Pruu pruuDesbloquear) {
		pruuDesbloquear.setBloquear(false);
	}
}
