public class DuaBelas {
	public static void main(String[] args) {
		
		//inisialisasi variabel
		int panjang=10;
		int lebar=5;
		//perulangan untuk membuat panjang  
		for (int i=1;i<=panjang;i++) {
		//Untuk membuat tab atau spasi pada baris genap
		 	if (i%2==0) {
		 		System.out.print("  ");
		 	}
		 //perulangan untuk membuat lebar
		 	for (int j=1;j<=lebar;j++) {
		 		System.out.print("#");
		 	}
		 	System.out.println();
		 } 
	}
	
}