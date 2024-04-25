import java.util.Scanner;

public class İkiliArama {
	static Stack CagirmaOncesiParametre = new Stack();
    static Stack CagirmaSonrasiParametre = new Stack();
    private static void BinarySearch(int[] sayilar, int low, int high, int aranan) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            CagirmaOncesiParametre.push(low);
            CagirmaOncesiParametre.push(high);
            CagirmaOncesiParametre.push(mid);

            if (sayilar[mid] == aranan) {
                CagirmaSonrasiParametre.push(low);
                CagirmaSonrasiParametre.push(high);
                CagirmaSonrasiParametre.push(mid);
                return;
            } else if (sayilar[mid] > aranan) {
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }

            CagirmaSonrasiParametre.push(low);
            CagirmaSonrasiParametre.push(high);
            CagirmaSonrasiParametre.push(mid);

            BinarySearch(sayilar, low, high, aranan);
        } else {
            System.out.println("Aranan Sayi Bulunamadi");
        }
    }



	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        int[] Sayilar = { 1, 5, 8, 13, 18, 29, 43, 52 };
	        int low=0;
	        int high=Sayilar.length-1;
	     //   int mid=0;
	    	System.out.print("Dizi:");
			for(int i=0;i<Sayilar.length;i++) {
				System.out.print(" "+Sayilar[i]);
			}
			System.out.println("\nAranacak Sayiyi Gir");
			int aranan=scan.nextInt();
			
			BinarySearch(Sayilar,low,high,aranan);
			CagirmaOncesiParametre.printStack();
			CagirmaSonrasiParametre.printStack();
	}

	
}
