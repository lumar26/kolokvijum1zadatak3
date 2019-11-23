package eksponati;

public class Eksponat {
	private String naziv;
	private String autor;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if (naziv == null || naziv.equals("")) {
			System.out.println("Greska");
			return;
		}
		this.naziv = naziv;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		if (autor.length()<5 || autor == null) {
			System.out.println("Greska");
		}
		this.autor = autor;
	}
	
	public String ispisi() {
		return "Naziv eksponata: " + this.naziv + ", autor: " + this.autor;
	}
}
