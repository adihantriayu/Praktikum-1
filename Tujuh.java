public class Tujuh{
	public static void main(String[] args) {
		//inisialisasi variabel serta tipe data batas awal dan batas akhir 
		int angka1=1; 
		int angka2=10; 
		float jumlah=0;
		int i;
		/*perulangan untuk menjumlah angka
		 dari awal sampai batas angka akhir*/
		for (i=angka1;i<=angka2;i++) {
			jumlah=jumlah+i;
		}
		//Membagi penjumlahan dengan angka batas akhir
		jumlah=jumlah/+angka2;
			System.out.println(jumlah);
		
	}
}