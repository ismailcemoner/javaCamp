package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
        dortIslem.Topla(2,3);
        dortIslem.Cikar(2,3);
        dortIslem.Carp(2,3);
        dortIslem.Bol(2,3);
        
        int sonuc = dortIslem.Topla(2, 8);
        	System.out.println(sonuc);
	}

}
