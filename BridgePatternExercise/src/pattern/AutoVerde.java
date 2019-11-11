package pattern;

public class AutoVerde extends Auto{
	
	public AutoVerde() {
		super();
		super.setTipo("verde");
		
	}
	
	@Override
	public String getTipo() {
		return super.getTipo();
	}
	
	@Override
	public void setTipo(String tipo) {
		super.setTipo(tipo);
	}
	
	@Override
	public void carica() {
		super.carica();
		
		
	}

}
