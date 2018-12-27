import javax.swing.*;
public class Operators{
public static void main(String arg[]){
/*String yas = JOptionPane.showInputDialog(null, "Yasinizi giriniz: ");

int sonuc = Integer.parseInt(yas) * 3;
JOptionPane.showMessageDialog(null, "Hesap sonucu: "+sonuc);
*/
int a = 25;
int b = a; //a deðerini b ye atar aktarýr

b = ++a;  //++ soldan saða doðru iþlem yapýldýðý için önce ++ ile topladý
//sonra ise toplanan sayýyýyý b ye aktardý.

System.out.println(b);

b=a++;  //++ iþlemi saðda kaldýðý için önce a yý aktarýr sonra ise ++ iþlemi ile
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

