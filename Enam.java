public class Enam{
	public static void main(String[] args) {
		//inisialisasi untuk menentukan batas
		int angka1=1; //batas awal
		int angka2=10; //batas akhir
		int jumlah=0; //inisialisasi nilai jumlah mula-mula nol
		/*perulangan untuk menjumlahkan satu per satu angka  secara berurutan dari batas
		angka awal sampai batas angka akhir*/
		for (int i=angka1;i<=angka2;i++) {
			jumlah=jumlah+i;
		}
		//menampilkan hasil penjumlahan 
			System.out.println(jumlah);
		
	}
}