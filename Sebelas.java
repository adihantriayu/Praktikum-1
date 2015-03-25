public class Sebelas {
	public static void main(String[] args) {
		
		//inisialisasi vvariabel
		int sisi=5;
		//perulangan untuk membuat baris
		for (int i=1;i<=sisi;i++) {
		 	if (i%2==0) {
		 		System.out.print("  ");
		 	}
		 	for (int j=1;j<=sisi;j++) {
		 		System.out.print("#");
		 	}
		 	System.out.println();
		 } 
	}
	
}