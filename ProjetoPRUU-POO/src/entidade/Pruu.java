package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pruu {
		
		private int id;
		private static int contador = 1;
		private String texto;
		private Date data;
		private int quantidadeLike;
		private boolean bloquear;
		private String dataformatada;
	
		
		//Construtores//
		public Pruu() {
			super();
		}
		public Pruu(String texto) {
			super();
			if((texto.length() > 300) || (texto.trim().length() < 1)) {
				System.out.println("Texto excede o limite de caracter");
			}		
			this.id = contador++;
			this.texto = texto;	
			this.data = new Date();
			SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
			String dataformatada = formatador.format(data);
			this.dataformatada = dataformatada;
			this.quantidadeLike = 0;
			this.bloquear = false;
		}
		
		public void somarLike () {
			this.quantidadeLike++;
		}
		
		//Getters e Setters//
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
		public Date getData() {
			return data;
		}
		public int getQuantidadeLike() {
			return quantidadeLike;
		}
		public boolean isBloquear() {
			return bloquear;
		}
		public void setBloquear(boolean bloquear) {
			this.bloquear = bloquear;
		}
	
		@Override
		public String toString() {
			if (isBloquear()) {
				return "Pruu" + "\nid: " + this.id + "\nBloqueado";
			}
			return "\nPruu" + "\nid: " + this.id + "\nTexto: " + this.texto + "\nQuantidade de likes: " + this.quantidadeLike
					+ "\nData de criação: " + this.dataformatada;
		}


	
		
		
		
	
	
}
