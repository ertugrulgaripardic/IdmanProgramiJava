import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("idman programına hoşgeldiniz");
		
		String idmanlar = "Geçerli Hareketler \n" + "Burpee\n" + "Pushup \n" + "Situp\n" + "Squat";
		
		System.out.println(idmanlar);
		
		System.out.println("bir idman oluşturun");
		
		System.out.print("Burpee Sayısı: ");
		int burpee= scanner.nextInt();
		System.out.print("Pushup Sayisi: ");
		int pushup= scanner.nextInt();
		System.out.print("Situp Sayisi: ");
		int situp=scanner.nextInt();
		System.out.print("Squat Sayisi: ");
		int squat = scanner.nextInt();
		
		scanner.nextLine();
		
		Idman idman = new Idman(burpee, pushup, situp, squat);
		
		System.out.println("idman basliyor...");
		
		while (idman.idmanBittiMi() == false) {
			System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat): ");;
			String tur = scanner.nextLine();
			System.out.print("Bu hareketten kaç tane yapacaksınız?:   ");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur, sayi);
			
		}
		System.out.println("İdmanını başarıyla bitirdin");
		
		
		
	}

}
