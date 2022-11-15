import java.util.Scanner;
public class Taksimetre {

    public static void main(String[] args) {
        /*Gerekli olan değişkenleri burada tanımlıyoruz. km fiyatı ile ödenecek tutar ondalıklı
        olacağından double cinsinden, ödenecek minumum tutar açılış fiyatı ve girilen km
        tamsayı olacağından integer cinsinden tanımlıyoruz.
         */

        double kmFiyati = 2.20, odTutar;
        int minTutar=20, acTutar =10, girilenKm;

        /* Kullanıcının gireceği km değerini ekrandan programımıza almayı burada yapıyoruz.
        Bunu yapabilmek için, class dan önce java util scanner kitaplığını projemize import
        ediyoruz. Kullanıcının girmiş olduğu km değerini girilenkm değişkenine atıyoruz.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi km olarak giriniz : ");
        girilenKm = input.nextInt();

        /* Ödeme tutarını bulmak için bizden istenen gerekli hesaplamaları burada yapıyoruz.
        sonrada kullanıcıya ödemesi gereken tutarı ekrana gönderiyoruz.
         */
        odTutar = (girilenKm * kmFiyati) + acTutar;
        odTutar = (odTutar < minTutar) ? minTutar : odTutar;
        System.out.println("Ödenecek tutar                     : " + odTutar +  " tl.");

    }
}
