package methods;

public class Main {

	public static void main(String[] args) {
		SayiBulmaca();
        SayiBulmaca();
        SayiBulmaca();
        SayiBulmaca();

    }

    public static void  SayiBulmaca(){
        int[] sayilar = {1,2,3,4,5,6,7,8,9,10};
        int arananSayi = 5;
        boolean varMi = false;
        for(int sayi : sayilar){
            if(sayi == arananSayi){
                varMi = true;
                break;
            }
        }
        String mesaj = "";
        if(varMi){
            mesaj = "Sayi bulundu : " + arananSayi;
            mesajVer(mesaj);
        }else{
            mesaj = "Sayi bulunamad─▒ : " + arananSayi;
            mesajVer(mesaj);
        }
    }

    public static  void mesajVer(String mesaj){
        System.out.println(mesaj);
	}
	}
