public class Sembilan {
	public static void main(String[] args) {
		//inisialisasi variabel
		int i=1;
		int hasil;
		//perulangan untuk memunculkan angka 1 sampai 110
		while (i<=110){
		//perulangan untuk memunculkan keluaran perbaris 11 angka
			for(int j=1;j<=11;j++) {
		//Menyeleksi untuk kelipatan 5 akan diubah dengan JONI
				hasil=i%5;
				if (hasil==0) {
		//jika benar akan muncul JONI
					System.out.print("JONI");
				}
		//Jika salah akan muncul angka lanjutan
				else {
					System.out.print(i+" ");
				}
			
			i++;
			}
		//Untuk mengganti baris		
				System.out.println();
				
		}
				
				
		
	}
	
}
