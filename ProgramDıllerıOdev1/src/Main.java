import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] ozne = {"Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrezzak", "Şehribanu", "Zeynelabidin", "Naki"};
        String[] nesne = {"Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı"};
        String[] yuklem = {"Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek"};

		System.out.println("Cümlenizi Giriniz");
		String Cumle=scan.nextLine();
		Cumle=Cumle.trim();
		String[] Kelime = Cumle.split("\\s+");
		if((Kelime.length==3) && contains(ozne , Kelime[0])&&contains(nesne , Kelime[1])&& contains(yuklem , Kelime[2])) {
			System.out.println("EVET");
		}
		else {
			System.out.println("HAYIR");
		}
	
	}
public static boolean contains(String[] array, String item) {
    for (String element : array) {
        if (element.equals(item)) {
            return true;
        }
    }
    return false;
}
}
