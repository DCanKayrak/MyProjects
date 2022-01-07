public class Main {

    public static void main(String[] args) {
	    //220-284 birer arkadaş sayıdır.
        int number1 = 222;
        int number2 = 284;
        int Toplam1 = 0;
        int Toplam2 = 0;
        for(int i=1;i < number1;i++){
            if(number1 % i ==0){
                Toplam1 = Toplam1 + i;
            }
        }
        System.out.println(Toplam1);
        for(int i=1;i < number2;i++){
            if(number2 % i ==0){
                Toplam2 = Toplam2 + i;
            }
        }System.out.println(Toplam2);
        if(Toplam1 == number2 && Toplam2 == number1){
            System.out.println("Verilen Sayılar Arkadaş Sayıdırlar.");
        }else
            System.out.println("Verilen Sayılar Arkadaş Sayı Değildir.");
    }
}
