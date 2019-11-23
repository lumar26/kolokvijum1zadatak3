package ekponati.fotografije;

import eksponati.Eksponat;

public class Fotografija extends Eksponat{
	@Override
	public String ispisi() {
		
		return super.ispisi() + ", tip - fotografija";
	}
}
