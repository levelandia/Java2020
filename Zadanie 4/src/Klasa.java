
public class Klasa extends Szkola
{
	int klasa;
	
	public void UstawKlase (int klasa)
	{
		this.klasa = klasa;
	}
	
	public String toString() 
	{ 
	    return String.format(Imie + " " + Nazwisko + " (" + Pesel + "), klasa " + klasa);
	}
}
