
public class A9_Methods_Start {

	public static void main(String args[]) {
		Number();
		Number1("buralar� y�k�l�yo");
		Number2(45);
		Number3(2,3);
	}

	public static void Number() {
		String a = "Benim ad�m engin";
		int b =26;
		//Scanner giris = new Scanner(System.in);
		//System.out.println("say�: ");
		//a=giris.nextInt();
		//System.out.println("say�: ");
		//b=giris.nextInt();
		System.out.println("sonuc : "+ a+" ya��m "+b);
	}
	public static void Number1(String a) {
		System.out.println(a);
	}

	public static void Number2(int a) {
		System.out.println(a);
	}
	public static void Number3(int a,int b) {

		System.out.println(a*b);
	}
	}

