
public class Main {

	public static void main(String[] args) 
	{
        Klasa uczen = new Klasa();
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Imiê ucznia:");
        uczen.UstawImie(sc.nextLine());
        System.out.println("Nazwisko ucznia:");
        uczen.UstawNazwisko(sc.nextLine());
        System.out.println("PESEL ucznia:");
        uczen.UstawPesel(sc.nextLine());
        System.out.println("Klasa ucznia:");
        uczen.UstawKlase(sc.nextInt());
        
        System.out.println(uczen);
        sc.close();

	}

}
