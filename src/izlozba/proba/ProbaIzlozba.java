package izlozba.proba;

import eksponati.Eksponat;
import eksponati.slike.Slika;
import izlozba.Izlozba;

public class ProbaIzlozba {

	public static void main(String[] args) {
		Izlozba izlozba = new Izlozba(23, 11, 2019);
		Slika s1 = new Slika();
		s1.setAutor("Yoko Ono");
		s1.setNaziv("John Lennon");
		s1.setTehnika("aquarell");
		
		Slika s2 = new Slika();
		s2.setAutor("Luka Marinkovic");
		s2.setNaziv("Jesen u mom sokaku");
		s2.setTehnika("tempera");
		Eksponat e1 = s1;
		Eksponat e2 = s2;
		izlozba.unesiEksponat(e1);
		izlozba.unesiEksponat(e2);
		izlozba.ispisiSveEksponate("Luka Marinkovic");
//		Object[10] = izlozba.pronadji("Marinkovic");
	}

}
