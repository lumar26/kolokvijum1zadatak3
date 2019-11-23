package izlozba;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import eksponati.Eksponat;
import eksponati.slike.Slika;

public class Izlozba {
	private GregorianCalendar datumOtvaranja;
	private Eksponat[] eksponati;

	public Izlozba(int dan, int mesec, int godina) {
		super();
		eksponati = new Eksponat[50];
		datumOtvaranja = new GregorianCalendar(dan, mesec, godina);
	}

	public void unesiEksponat(Eksponat e) {
		if (e != null && eksponati[eksponati.length - 1] == null)
			for (int i = 0; i < eksponati.length; i++) {
				if (eksponati[i] == null) {
					eksponati[i] = e;
					return;
				}
			}
		else System.out.println("Greska");
	}
	
	public void ispisiSveEksponate(String autor) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
//		System.out.println("Datum otvaranja izlozbe: " + sdf.format(datumOtvaranja));
		System.out.println("Datum otvaranja izlozbe: " + this.datumOtvaranja.get(GregorianCalendar.DATE));
		for (int i = 0; i < eksponati.length; i++) {
			if (eksponati[i] != null && eksponati[i].getAutor().equals(autor)) {
				System.out.println(eksponati[i].ispisi());
			}
		}
	}
	
	public Object[] pronadji(String prezime) {
		ArrayList<Eksponat> nadjeneSlike = new ArrayList<>();
		for (int i = 0; i < eksponati.length; i++) {
			if (eksponati[i] != null && eksponati[i] instanceof Slika 
					&& ((Slika)eksponati[i]).getTehnika().equals("tempera")
					&& eksponati[i].getAutor().matches("(?i).*Marinkovic.*")) {
				nadjeneSlike.add(eksponati[i]);
			}
		}
		Object[] o = nadjeneSlike.toArray();
		return o;
	}
}
