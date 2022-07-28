package entidade;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Pruu {
		
		private int id = ThreadLocalRandom.current().nextInt(25);
		private String texto;
		private Date data;
		private int quantidadeLike;
		private boolean bloquear;
	
		
		//Construtores//
		public Pruu() {
			super();
			
		}
		public Pruu(String texto) {
			super();
			if((texto.length() > 300) || (texto.trim().length() < 1)) {
				System.out.println("Texto excede o limite de caracter");
			}		
			this.texto = texto;	
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
		public void setQuantidadeLike(int quantidadeLike) {
			this.quantidadeLike = quantidadeLike;
		}
		public boolean isBloquear() {
			return bloquear;
		}
		public void setBloquear(boolean bloquear) {
			this.bloquear = bloquear;
		}
	
		@Override
		public String toString() {
			return "Pruu [id=" + id + ", texto=" + texto + ", data=" + data + ", quantidadeLike=" + quantidadeLike
					+ "]";
		}


	
		
		
		
	
	
}
