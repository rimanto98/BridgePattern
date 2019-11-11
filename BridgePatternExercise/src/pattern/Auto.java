package pattern;

import java.awt.Image;

public abstract class Auto{
	
	private ImpAutoDisegna impDisegno;
	
	String tipo = "ND";
	
	private Image img;
	
	public Image getImg() {
		return img;
	}


	public void setImg(Image img) {
		this.img = img;
	}


	public Auto() {
		impDisegno = new ImpAutoDisegna();
	}
	
	
	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public void carica() {
		impDisegno.caricaImmagine(this);
	};

}
