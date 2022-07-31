package principal;

import java.util.ArrayList;
import java.util.Iterator;

import entidade.Usuario;
import entidade.Administrador;
import entidade.Pruu;

public class Principal {
	
	public static void main(String[] args) {
		
		Administrador Adm = new Administrador ("Administrador", "adm_@gmail.com", "123546884-51");
		Usuario Keisy = new Usuario("Keisy Anny", "keisy.amorim@gmail.com", "084545209-61");
		Usuario Lucia = new Usuario ("Lucia Andrea", "luciasfig2@gmail.com", "094891548-06");
		
		ArrayList <Pruu> pruuAdministrador =  new ArrayList<Pruu>();
		Adm.setPruus(pruuAdministrador);
		Pruu pruuAdministrador1 = new Pruu("Hoje o dia parece ótimo para um passeio a praia com os amigos!");
		Pruu pruuAdministrador2 = new Pruu("Bora Trilhar hoje!!");
		pruuAdministrador.add(pruuAdministrador1);
		pruuAdministrador.add(pruuAdministrador2);
		
		ArrayList <Pruu> pruuKeisy =  new ArrayList<Pruu>();
		Keisy.setPruus(pruuKeisy);
		Pruu pruuKeisy1 = new Pruu("Vamos Festar");
		Pruu pruuKeisy2 = new Pruu("Bora Trilhar hoje!!");
		pruuKeisy.add(pruuKeisy1);
		pruuKeisy.add(pruuKeisy2);
		
		ArrayList <Pruu> pruuLucia =  new ArrayList<Pruu>();
		Lucia.setPruus(pruuLucia);
		Pruu pruuLucia1 = new Pruu("Vamos Festar");
		Pruu pruuLucia2 = new Pruu("Bora Trilhar hoje!!");
		pruuLucia.add(pruuLucia1);
		pruuLucia.add(pruuLucia2);
		
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		listaUsuarios.add(Adm);
		listaUsuarios.add(Keisy);
		listaUsuarios.add(Lucia);
		
		listarPruus(listaUsuarios);
		System.out.println("******* PRUUS DA LUCIA *******");
		int quantidadePruusLucia = Lucia.getPruus().size();
		System.out.print("Nome: " + Lucia.getNome());
		for (int i = 0; i < quantidadePruusLucia; i++) {
			System.out.println(Lucia.getPruus().get(i).toString());
		}
		
		Keisy.darLike(pruuLucia1);
		Lucia.darLike(pruuAdministrador2);
		Adm.bloquearPruu(pruuKeisy2);
		listarPruus(listaUsuarios);
	}

	private static void listarPruus(ArrayList<Usuario> listaUsuarios) {
		System.out.println("******* LISTA DE PRUUS *******");
		for (int i = 0; i < listaUsuarios.size(); i++) {
			int quantidadePruus = listaUsuarios.get(i).getPruus().size();
			System.out.print("Nome: " + listaUsuarios.get(i).getNome());
			for (int j = 0; j < quantidadePruus; j++) {
			System.out.println(listaUsuarios.get(i).getPruus().get(j).toString());	
			}
			System.out.println("---------------------------------------------");
		}
	}

}
