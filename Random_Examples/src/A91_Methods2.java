import java.util.Scanner;

public class A91_Methods2 {
public static void main(String[] args) {
	Giris();
	Ad_Sifre();
	Maas(1500, 2000);
	Hesapla(50, 60.6);
	Yaz�("beyfendi");
	long c=say�sal(475,58);
	long d=c*545;
	System.out.println(d);
	double k=kelime(57.54 ,24.32);
	k=k*3.14;
	System.out.println(k);

}
public static void Giris() {
	Scanner giris= new Scanner(System.in);
	System.out.println("Kullan�c� ad�n nedir: ");
	String isim ;
	isim=giris.nextLine();
	System.out.println();
	System.out.println("Ho�geldin "+isim);
}
public static void Ad_Sifre() {
	Scanner giris= new Scanner(System.in);
	long sifre;
	System.out.println();
	System.out.println("Yeni �ifre Gir ve sadece say�lardan olu�sun : ");
	sifre=giris.nextLong();
	//sifre=new Scanner(System.in).nextLong();
	System.out.println();
	System.out.println("Yeni �ifren bu mu? : "+sifre);
	
}
public static void Maas(int a, int b) {
	System.out.println();
	System.out.println("Sana �nerilen tutarlar : "+a+" tl ile "+b+" tl aras�nda");
}
public static void Hesapla(int a, double b) {
	Scanner giris= new Scanner(System.in);
	int say�;
	System.out.println();
	System.out.println("ortalama g�nl�k kazanc�n ne olmal� :");
	say�=giris.nextInt();
	System.out.println();
	System.out.println("�stedi�in tutar : "+say�+" tl ancak");
	System.out.println();
	System.out.println("bizim �nerdi�imiz g�nl�k "+a+" tl ile "+b+" tl aras�ndad�r.");
}
public static void Yaz�(String isim) {
	System.out.println(isim);
}
public static long say�sal(long x, long y){
	long finish=x/y;
	return finish;

}
public static double kelime(double c, double p) {
	double g= c/p;
	return g;
}

}