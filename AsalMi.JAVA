import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in); // Scanner Açılışımızı Yaptık.
        int asal = gir.nextInt(); // Kullanıcıdan Girişimizi Alıyoruz.
        boolean asalMi = true; // Kontrol Değerimiz.

        for (int i = 2; i < asal; i++) { // For döngüsü ile sayıdan küçük olan sayıların hepsini sayıya bölüyoruz.(Tam Tersi :D )
            if (asal % i == 0) {
                asalMi = false; // Eğer Bölünürse Asal Değildir.

            }
        }
        if(asalMi==true){
            System.out.println("Sayınız Asal.");
        }else {
            System.out.println("Sayınız Asal Değil.");
        }
    }
}
