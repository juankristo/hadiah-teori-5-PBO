import java.util.Scanner;
class HitVolBola {
	public static void main(String args[]) {
	Double  hasil;
	int jari;
	
	RumusBola rumus = new RumusBola();
	
	Scanner input = new Scanner(System.in);
		
	System.out.println("Aplikasi polimorphisme dan inheritance untuk mencari volume bola");
	System.out.println();
	System.out.print("Silahkan Masukkan nilai jari-jari / r: ");
	jari = input.nextInt();
	System.out.println();
			
	rumus.radius(jari);
	rumus.tampil();
	rumus.hitung(jari);
		
	}	
}