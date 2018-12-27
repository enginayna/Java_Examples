
public class A0Bilmem_Gerekenler {
public static void main(String[] args) {
	//Ornette - "Crazy" (Nôze remix) [Official]
	/*comments / ve * a basıldıktan sonra enter a basılarak çoğaltılabilir
	 * tek satırlık comment çift slash ile ifade edilir
	 * 
	 * syso yazdıktan sonra control(ctrl)+space+enter ile System.out.println
	 * elde edilir
	 * System.out.println("buraya yazılanlar output da görülür");
	 * ancak sondaki noktalı virgül(;) unutulmamalı
	 * 
	 * fazladan satırları control+d ile silebiliriz
	 * control+s ile kaydedebiliriz
	 * 
	 * public static void main(String[] args)
	 * yazmak yerine main yazıp control+space+enter yapabiliriz
	 * 
	 * shift+home o satırı copy eder ve control+c ile kopyalayıp
	 * control+v ile de paste edebilirsiniz.
	 * 
	 *************************** UNITY 1 **********************************
	 * 
	 * 
	 *
	 * Class isimleri büyük harf ile başlar ve boşluk bırakamazsın
	 * syntax errors söz dizimi hatası
	 * Runtime errors çalışma zamanı hatası
	 * logic errors mantık hatası
	 * Common errors genel hatalar
	 * 
	 * 
	 * 
	 *********************** UNITY 2 ********************************
	 * 
	 * 
	 * 
	 * Scanner input = new Scanner(System.in);
	 * int a =input.nextInt();
	 * kullanıcıdan girdi almaya yarıyan bu kodu çalıştırmak için 
	 * import java.util.Scanner; eklipse kendi kodu başa yazıyor zaten
	 * 
	 * 
	 * değişkenler veriables
	 * int double float long byte short string char boolean
	 * 
	 * final double PI final ile veri tipini değişmez olarak etiketliyoruz
	 * mesela PI gibi değişmeyen tiplerde kullanılabilir
	 * 
	 * 
	 * numaric operators numarik operatörler
	 * + - * /  % 
	 * % bu operatör ile mod alma işlemi yapılır 
	 * bölme işlemlerinde kalanı verir örn 10 % 3 1 sonucunu üretir.
	 * 
	 * 
	 * Math sınıfının pow metodu ile( Math.pow(a, b) ) ile üslü sayıları
	 * belirtiyoruz örn Math.pow(25,3) outputa 25 üzeri 3 olarak işlem yapar
	 * 
	 * 
	 * System.currentTimemillis(); 1 ocak 1970 den bugüne kadar geçen
	 * milisaniyelerin toplamını verir. mili saniye saniyenin 1000 de 1 i dir
	 * bu kodu kullanarak saati saniyeyi ve dakikayı bulabiliriz
	 * 
	 * 
	 * arttırılmış atama operatörleri Augmented Assignment Operators
	 * +=  örn: i = i + 8 işlemini i += 8 olarak kısaltıyor.
	 * +=       Addition assignment          i += 8         i = i + 8
     * -=       Subtraction assignment       i -= 8         i = i – 8
     * *=       Multiplication assignment    i *= 8         i = i * 8
     * /=       Division assignment          i /= 8         i = i / 8
     * % =      Remainder assignment         i % = 8        i = i % 8
     * 
     * 
     * Bir fazladan arttırma operatörü de 
     * i++ = i + 1 demektir
     * 
     * 
     * Numeric Type Conversions Numarik Tür dönüşümleri
     * 
	 * 
	 * 
	 * ************************ UNITY 3 **************************************
	 * 
	 * 
	 * if(){       }
	 * 
	 * Bu kod ile eğer bu şekilde ise bu kodu yaz diyoruz programa
	 * 
	 * else if() {            }
	 * 
	 * else if ile ondan önceki koda giriyor uygun sonuç çıkmıyorsa 
	 * else if içine giriyor bu yüzden de kendinden önceki if yada else iflerle
	 * ortak olmayan kısım kendi blogu içinde var ise yazdırıyor
	 * 
	 * else {                }
	 * 
	 * else ile diğer if yada else ifleri karşılamayan herşeyin sonucu bildirilir.
	 * 
	 *  
	 *  Boolean Data Types 
	 *  
	 *  java oprtr    mat.sembol    name                    example       result
	 *  <                <         less than             radius   < 0     false
     *  <=               ≤  less than or equal to        radius <= 0      false
     *  >                >      greater than             radius > 0       true
     *  >=               ≥  greater than or equal to     radius >= 0      true
     *  ==               =         equal to              radius == 0      false
     *  !=               ≠        not equal to           radius != 0      true
	 * 
	 * Locical Operatoors    Mantıksal operatörler 
	 * 
	 * Operator            Name                  Description
     *    !                 not                logical negation
     *    &&                and                logical conjunction
     *    ||                or                 logical disjunction
     *    ^             exclusive or           logical exclusion
     *    
     *    
     * Math.random(); 
     * Bu kod ile 0 ve 1 arasında rassal bir sayı elde ederiz.
     * 
	 * switch 
	 * sadece eşitlik durumlarında kullanabiliriz 
	 * yazı yada sayı olması farketmez
	 * switch(kullanıcıdan gelen örn : input.charAt(0)) {
	 * case 'e':
	 * bla bla 
	 *     break;
	 * break ile porgramın o kısmından çıkış yapılır.
	 * 
	 * default: else anlamında kullanılır
	 * }
	 * 
	 * 
	 * 
	 * 
	 ************************* UNİTY 4 ***********************************
	 * 
	 * 
	 * Matematiksel İfadeler
	 * 
	 * Math.sgrt(4) 
	 * 4 ün karekökünü verir
	 * 
	 * 
	 * Math.ceil(3,1)
	 * Küsüratlı sayıları her zaman yukarıya yuvarlar.
	 * 3,1 bu durumda 4.0 olur
	 * 
	 * 
	 * Math.floor(3,1)
	 * Küsüratlı sayıları her zaman aşağıya yuvarlar.
	 * 3.1 bu durumda 3.0 olur
	 * 
	 * 
	 * Math.rint(3,1)
	 * Küsüratlı sayıları yakın oldukları sayıya yuvarlar.
	 * 3,1 bu durumda 3.0 olur
	 * 3,5 bu durumda 4.0 olur
	 * 
	 * 
	 * Math.round(3,1)
	 * Küsüratlı sayıları rint gibi yakın oldugu sayıya yuvarlar 
	 * ancak round sonucu int olarak gösterir.
	 * 3,1 bu durumda 3 olur
	 * 
	 * 
	 * Math.min(3,5)
	 * 2 parametreden hangisinin küçük olduğunu gösterir
	 * result 3
	 * 
	 * Math.max(8,4)
	 * 2 parametreden hangisinin büyük oldugunu gösterir
	 * result 8
	 * 
	 * 
	 * Math.abs(-2,1)
	 * içindeki parametreyi pozitife döndürür
	 * result 2,1
	 * 
	 * 
	 * Çift tırnak için de yazı yazabilmek için
	 * /"engin/"
	 * 
	 * 
	 * String Methods String Metotları
	 * 
	 * String yazı = "engin"; olsun
	 * 
	 * yazı.length();
	 * yazı stringinin kaç karakter içerdiğini 0 dan başlarayarak bildirir.
	 * return 4 tür. Çünkü e 0, n 1, g 2, i 3, n 4,
	 * 
	 * 
	 * yazı.charAt(index);
	 * yazı stringinin index karakterini gösterir.
	 * example : yazı.charAt(0);
	 * result = e'dır.
	 * 
	 * 
	 * yazı.toUpperCase();
	 * yazı stringinin bütün harflerini büyük harfe çevirir.
	 * example : yazı.toUpperCase();
	 * result = ENGİN
	 * 
	 * 
	 * yazı.LowerCase();
	 * yazı stringinin bütün harflerini küçük harfe çevirir.
	 * example : yazı.LowerCase();
	 * result : engin
	 * 
	 * 
	 * yazı.trim(),
	 * yazı stringinin başlangıçtan önce ve bitişten sonraki boşluk ifadelerini 
	 * siler.
	 * example : String yazı1 = "Engin   ";
	 * result : Engin
	 * 
	 * 
	 * yazı.concat(yazı1);
	 * yazı stringinin başka bir string ile birleşmesini toplanmasını saglar
	 * example : yazı.concat(yazı1);
	 * result : engin Engin
	 * 
	 * 
	 * yazı.equels(yazı1);
	 * yazı stringi yazı1 stringine eşit mi diye sorgular
	 * result : false
	 * 
	 * 
	 * yazı.equelsIgnoreCase(yazı1);
	 * yazı stringi ile yazı1 strigini büyük küçük harfe dikkat etmeden 
	 * karşılaştırır
	 * result : true
	 * 
	 * 
	 * yazı.compareTo(yazı1);
	 * yazı ile yazı stringinin hangisinin büyük oldugunu karşılaştırır
	 * büyükse 1 eşitse 0 küçükse -1 sonucunu verir.
	 * example : yazı.compareTo(yazı1)>0
	 * result : True 
	 * 
	 * 
	 * yazı.compareToIgrnoreCase(yazı1);
	 * yazı ile yazı1 stringini büyük kücük harf bakmaksızın karşılaştırır
	 * example : yazı.compareTo(yazı1)=0
	 * result : true
	 * 
	 * 
	 * yazı.startWith(prefix);
	 * string belirtilen prefix ile başlıyorsa true değeri döner.
	 * example : yazı.startwith("en");
	 * result : true
	 * 
	 * 
	 * yazı.endWith(suffix);
	 * String belirtilen suffix ile bitiyorsa true değerini döner.
	 * example : yazı.endWith("in");
	 * result : true
	 * 
	 * 
	 * yazı.contains();
	 * String içinde belitilen kelime varsa true değeri döner
	 * example : yazı.contains("ahmet");
	 * result : false
	 * 
	 *  
	 * yazı.substring(begin index);
	 * belirtilen begin index ten sonrasını yazar.
	 * example : yazı.substring(2);
	 * result : in. çünkü eng 0 1 2 olarak ifade edilir 3 ve 4 te in olur.
	 * 
	 *  yazı.substring(begin index, end index);
	 *  belirtilen begin index ile başlar ve belirtilen end index ile biter.
	 *  example : yazı.substring(1, 3);
	 *  result :  g
	 *  
	 *  
	 *  
	 *  yazı.index('a', 'b');
	 *  aratılan karakterin kaçıncı sırada olduğunu gösterir. yanlış giriş -1 dir
	 *  example : yazı.index('n');
	 *  result : 3
	 *  
	 *  
	 *  yazı.indexOf(ch, sayı);
	 *  belirtilen sayı dan sonra belirtilen ch yi kaçıncı karakterde buldugunu
	 *  söyler.
	 *  belirtilen stringin kaçıncı satırda oldugunu söyler
	 *  belirtilen stringi belirtilen sayıdan sonra kaçıncı satırda buldugunu 
	 *  söyler
	 *  example : yazı.indexOf('n', 1);
	 *  example : yazı.indexOf("gin");
	 *  example : yazı.indexOf("gin", 1);
	 *  result : 4
	 *  result : 2
	 *  result : 2
	 *  
	 *  
	 *  yazı.lastIndecOf()
	 *  
	 *   
	 * 
	 ************************** UNITY 5 *************************************
	 * unity 6
	 * unity 7
	 * unity 8
	 * unity 9
	 * unity 10
	 * unity 11
	 * unity 12
	 * unity 13
	 * unity 14
	 * unity 15
	 * unity 16
	 * unity 17
	 * unity 18
	 * unity 19
	 * Kısayollar Shotcuts
	 * 
	 * alt shift r 
	 * bu kombinasyon ile değişken isimlerini tek tek değiştirmek yerine hepsini
	 * aynı anda değiştirebiliriz
	 * 
	 * 
	 * ctrl shift r
	 * kayıtlı classları bu şekilde bulabiliriz
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
}
