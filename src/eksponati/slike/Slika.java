package eksponati.slike;

import eksponati.Eksponat;

public class Slika extends Eksponat{
	private String tehnika;

	public String getTehnika() {
		return tehnika;
	}

	public void setTehnika(String tehnika) {
		this.tehnika = tehnika;
	}
	
	@Override
	public String ispisi() {
		// TODO Auto-generated method stub
		return super.ispisi() + ", tehnika: " + this.tehnika;
	}
	
}
