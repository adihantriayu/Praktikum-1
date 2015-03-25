public class Empat {
	public static void main(String[] args) {
		//Memberi nilai pada variabel
		int angka=6;
		//Menggunakan Switch untuk mengecek angka
		//Bila sesuai maka akan measuk ke Case case yang ada
		switch (angka) { 
			case 1:
					System.out.println("Satu");
				break;
				
			case 2:
					System.out.println("Dua");
				break;
				
			case 3:	
					System.out.println("Tiga");
				break;
				
			case 4:				
					System.out.println("Empat");
				break;
				
			case 5:				
					System.out.println("Lima");
				break;
				
			case 6:				
					System.out.println("Enam");
				break;
				
			case 7:				
					System.out.println("Tujuh");
				break;
				
			case 8:				
					System.out.println("Delapan");
				break;
				
			case 9:				
					System.out.println("Sembilan");
				break;
				
				//default ini optional , akan dijalankan apabila masukan tidak sesuai dengan satupun case yang tersedia
			default: System.out.println("Error: Masukkanlah angka antara 1 sampai 8");


		}

	}
	
}