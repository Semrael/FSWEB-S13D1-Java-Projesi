import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO call shouldWakeup


        System.out.println("Havlayan Köpek");
        System.out.println("case 1" + shouldWakeUp(true, 1));
        System.out.println("case 2" + shouldWakeUp(false, 2));
        System.out.println("case 3" + shouldWakeUp(true, 8));
        System.out.println("case 4" + shouldWakeUp(true, -1));

        System.out.println("Yaş tespiti");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println("Oyuncu Kedi");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println("Alan Hesaplama");
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println(area(5.0));
        System.out.println(area(-1));

        Scanner scanner=new Scanner(System.in);
        System.out.println("x değerini giriniz;");
        double x=scanner.nextDouble();
        System.out.println("y değerini giriniz;");
        double y=scanner.nextDouble();
        System.out.println("Area of rectengale" +area(x,y));

        System.out.println("yariçap gir");
        double radius=scanner.nextDouble();
        System.out.println("area of circle" +area(radius));

    }

    //Havlayan köpek---------------------------------------------------------------------------


    // public static boolean shouldWakeUp(boolean durum, int saatKac){
    // if(durum && (saatKac<0|| saatKac<23)){
    // return false;// geçersiz saat aralığı
    // }
    // if(durum && (saatKac<8|| saatKac>20)){
    // return true;// Köpek 8 den önce veya 20 den sonra havlıyorsa uyandır
    // }
    // return false;// diğer durumlarda uyandırma
    // }
    public static boolean shouldWakeUp(boolean isBarking, int saat) {
        if (saat < 0 || saat > 23 || !isBarking) return false;

        return saat < 8 || saat > 23;

    }

    // Yaş Tespiti ------------------------------------------------------------------------

    public static boolean hasTeen(int sayi1, int sayi2, int sayi3) {
        return (sayi1 >= 13 && sayi1 <= 19) || (sayi2 >= 13 && sayi2 <= 19) || (sayi3 >= 13 && sayi3 <= 19);
    }

//    public static boolean hasTeen2(int... ages) {
//        if (ages.length != 3) {
//            System.out.println("length 3 olmalı");
//            return false;
//        }
//
//        for (int age : ages) {
//            if (age >= 13 && age <= 19) {
//                return true;
//            }
//        }
//        return false;
//    }


   /* }  public static boolean hasTeen(int sayi1,int sayi2, int sayi3 ){
        if((sayi >= 13 && <= 19 )|| (sayi2 >= 13 && sayi2 <=19)||(sayi3 >= 13 && sayi3<=19)){
            return true;
        }
    }*/


    // oyuncu Kedi ---------------------------------------------------------------
//    public static boolean isCatPlaying(boolean yaz, int sicaklik) {
//        if (yaz) {
//            return sicaklik >= 25 && sicaklik <= 45;
//        }
//
//        return sicaklik >= 25 && sicaklik <= 35;
//
//    }

    public static boolean isCatPlaying(boolean yaz, int sicaklik) {
        int limit=yaz?45:35;
        return sicaklik > 25 && sicaklik <= limit;

    }

    // Alan Hesaplama ---------------------------------------------------------------
    public static double area(double x, double y){
        if(x<0 || y<0) {
            return -1;
        }
        return x*y;
    }

    public static double area(double radius){
        if(radius<0){
            return -1;
        }
        return Math.PI*Math.pow(radius,2);
    }

}