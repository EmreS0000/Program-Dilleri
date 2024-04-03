import java.io.*;
import java.util.Scanner;

public class Main {
    int x;
    int y;

    public Main(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) throws IOException {
        Main[] Dizi = new Main[100];
        int adres = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Dosya adınızı giriniz");
        String DosyaAdi = scan.nextLine();
        File file = new File(DosyaAdi);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fr = new FileReader(DosyaAdi);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            int veri = Integer.parseInt(line);
            Main yeni = new Main(veri, adres);
            Dizi[adres] = yeni;
            adres++;
        }

        System.out.println("Verinin İlk Hali:");
        for (int j = 0; j < adres; j++) {
            if (Dizi[j] != null) {
                System.out.println("Veri: " + Dizi[j].x + ", Adres: " + Dizi[j].y);
            }
        }

        // Veriye göre sıralama
        for (int i1 = 0; i1 < adres - 1; i1++) {
            for (int j = i1 + 1; j < adres; j++) {
                if (Dizi[i1] == null || Dizi[j] == null) {
                    continue;
                }
                if (Dizi[j].x < Dizi[i1].x) {
                    Main gecici = Dizi[i1];
                    Dizi[i1] = Dizi[j];
                    Dizi[j] = gecici;
                }
            }
        }

        System.out.println("\nVeriye Göre Sıralanmış Veri:");
        for (int j = 0; j < adres; j++) {
            if (Dizi[j] != null) {
                System.out.println("Veri: " + Dizi[j].x + ", Adres: " + Dizi[j].y);
            }
        }
    }
}
