import java.util.Scanner;
public class switchcase {	
	public static  void main (String[] args) {
		int day ;
		System.out.println ("Masukan Angka 1-7") ;
		Scanner masukan = new Scanner (System.in);
		day = masukan.nextInt  ();
		switch (day) {
		case 1 :
			System.out.println ("Senin");
			break ;
		case 2 :
			System.out.println ("Selasa");
			break ;
		case 3 :
			System.out.println ("Rabu");
			break ;
		case 4 :
			System.out.println ("Kamis");
			break ;
		case 5 :
			System.out.println ("Jumat");
			break ;
		case 6 :
			System.out.println ("Sabtu");
			break ;
		case 7:
			System.out.println ("Minggu");
			break ;
		default : 
			System.out.println ("Tidak ada hari");
		}
	}
}
