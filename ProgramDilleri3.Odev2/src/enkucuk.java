
public class enkucuk {
	static Stack CagirmaOncesiParametre = new Stack();
    static Stack CagirmaSonrasiParametre = new Stack();
	
		static void enkucukBul(int[] dizi, int min,int next) {
			CagirmaOncesiParametre.push(min);
			CagirmaOncesiParametre.push(next);
			
			if(next<=dizi.length-1) {
				if(dizi[min]<dizi[next]) {					
					next++;
					CagirmaSonrasiParametre.push(min);
					CagirmaSonrasiParametre.push(next);
					enkucukBul(dizi, min, next);
				}
				else if(dizi[min]>dizi[next]) {
					min=next;
					next++;
					CagirmaSonrasiParametre.push(min);
					CagirmaSonrasiParametre.push(next);
					enkucukBul(dizi, min, next);
				}
			}
			else {
				System.out.println("\nEn kucuk Eleman "+" indeks "+min+" degeri "+dizi[min]);
				CagirmaOncesiParametre.printStack();
				CagirmaSonrasiParametre.printStack();
				return;
			}
		}
	public static void main(String[] args) {
		int [] Dizi= {15,7,94,57,29,4,90,1,37,79};
		int min=0;
		int next=1;
		System.out.print("Dizi:");
		for(int i=0;i<Dizi.length;i++) {
			System.out.print(" "+Dizi[i]);
		}
		enkucukBul(Dizi,min,next);
	}

}
