import javax.swing.*;
public class Operators{
public static void main(String arg[]){
/*String yas = JOptionPane.showInputDialog(null, "Yasinizi giriniz: ");

int sonuc = Integer.parseInt(yas) * 3;
JOptionPane.showMessageDialog(null, "Hesap sonucu: "+sonuc);
*/
int a = 25;
int b = a; //a de�erini b ye atar aktar�r

b = ++a;  //++ soldan sa�a do�ru i�lem yap�ld��� i�in �nce ++ ile toplad�
//sonra ise toplanan say�y�y� b ye aktard�.

System.out.println(b);

b=a++;  //++ i�lemi sa�da kald��� i�in �nce a y� aktar�r sonra ise ++ i�lemi ile
//a 1 artar.
System.out.println(b);
System.out.println(a);

int x =50;
int y= 21;
int bolumunden_kalan= x % y;
System.out.println(bolumunden_kalan);
double g=4.5;
int j= (int)g;
System.out.println(j);
}
}

