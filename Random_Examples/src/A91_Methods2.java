import java.util.Scanner;

public class A91_Methods2 {
public static void main(String[] args) {
	Giris();
	Ad_Sifre();
	Maas(1500, 2000);
	Hesapla(50, 60.6);
	Yazý("beyfendi");
	long c=sayýsal(475,58);
	long d=c*545;
	System.out.println(d);
	double k=kelime(57.54 ,24.32);
	k=k*3.14;
	System.out.println(k);

}
public static void Giris() {
	Scanner giris= new Scanner(System.in);
	System.out.println("Kullanýcý adýn nedir: ");
	String isim ;
	isim=giris.nextLine();
	System.out.println();
	System.out.println("Hoþgeldin "+isim);
}
public static void Ad_Sifre() {
	Scanner giris= new Scanner(System.in);
	long sifre;
	System.out.println();
	System.out.println("Yeni þifre Gir ve sadece sayýlardan oluþsun : ");
	sifre=giris.nextLong();
	//sifre=new Scanner(System.in).nextLong();
	System.out.println();
	System.out.println("Yeni þifren bu mu? : "+sifre);
	
}
public static void Maas(int a, int b) {
	System.out.println();
	System.out.println("Sana önerilen tutarlar : "+a+" tl ile "+b+" tl arasýnda");
}
public static void Hesapla(int a, double b) {
	Scanner giris= new Scanner(System.in);
	int sayý;
	System.out.println();
	System.out.println("ortalama günlük kazancýn ne olmalý :");
	sayý=giris.nextInt();
	System.out.println();
	System.out.println("Ýstediðin tutar : "+sayý+" tl ancak");
	System.out.println();
	System.out.println("bizim önerdiðimiz günlük "+a+" tl ile "+b+" tl arasýndadýr.");
}
public static void Yazý(String isim) {
	System.out.println(isim);
}
public static long sayýsal(long x, long y){
	long finish=x/y;
	return finish;

}
public static double kelime(double c, double p) {
	double g= c/p;
	return g;
}

}