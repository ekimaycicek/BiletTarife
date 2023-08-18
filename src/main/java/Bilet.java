import java.util.Scanner;

public class Bilet {

     /*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
*/



    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to ekoAirlines \nB C D choose one of the routes: ");
        String route = sc.nextLine().toUpperCase();

        System.out.println("for airplane direction \none direction -> 0\ndouble direction -> 1\n choose");
        int flightDirection = sc.nextInt();

        System.out.println("please enter your age: ");
        int age = sc.nextInt();

        double priceB = 500 * 0.10;//a dan b ye ucus fiyati
        double priceC = 700 * 0.10;//a dan c ye ucus fiyati
        double priceD = 900 * 0.10;//a dan d ye ucus fiyati

        if (route.equals("B") || route.equals("C") || route.equals("D")) {// rota kontrolu yapildi
            if (age > 65) {
                if (route.equals("B")) {
                    if (flightDirection == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("Your total price of double-way ticket to B city over 65 years old: " + (priceB * 0.7 * 0.8 * 2) + "$");
                    } else if (flightDirection == 0) {
                        System.out.println("Your total price of one-way ticket to B city over 65 years old: " + (priceB * 0.7) + "$");

                    } else System.out.println("please indicate your direction");


                } else if (route.equals("C")) {
                    if (flightDirection == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("Your total price of double-way ticket to C city over 65 years old: " + (priceC * 0.7 * 0.8 * 2) + "$");
                    } else if (flightDirection == 0) {
                        System.out.println("65 yas üstü C sehrine tek yon bilet toplam fiyatınız: " + (priceC * 0.7) + "$");

                    } else System.out.println("agam hala yonün belli değil");

                } else if (route.equals("D")) {
                    if (flightDirection == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("65 yas üstü D sehrine çift yon bilet toplam fiyatınız: " + (priceD * 0.7 * 0.8 * 2) + "$");
                    } else if (flightDirection == 0) {
                        System.out.println("65 yas üstü D sehrine tek yon bilet toplam fiyatınız: " + (priceD * 0.7) + "$");

                    } else System.out.println("agam hala yönün belli değil");

                } else System.out.println("hatalı girdin agacım");

            } else if (age < 24 && age >= 12) {
                if (route.equals("B")) {
                    if (flightDirection == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("12/24 yas  B sehrine çift yon bilet toplam fiyatınız: " + (priceB * 0.9 * 0.8 * 2) + "$");
                    } else if (flightDirection == 0) {
                        System.out.println("12/24 yas  B sehrine tek yon bilet toplam fiyatınız: " + (priceB * 0.9) + "$");

                    } else System.out.println("agam hala yonün belli değil");


                } else if (route.equals("C")) {
                    if (flightDirection == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("12/24 yas  C sehrine çift yon bilet toplam fiyatınız: " + (priceC * 0.9 * 0.8 * 2) + "$");
                    } else if (flightDirection == 0) {
                        System.out.println("12/24 yas  C sehrine tek yon bilet toplam fiyatınız: " + (priceC * 0.9) + "$");

                    } else System.out.println("agam hala yönün belli değil");

                } else if (route.equals("D")) {
                    if (flightDirection == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("12/24 yas  D sehrine çift yon bilet toplam fiyatınız: " + (priceD * 0.9 * 0.8 * 2) + "$");
                    } else if (flightDirection == 0) {
                        System.out.println("12/24 yas  D sehrine tek yon bilet toplam fiyatınız: " + (priceD * 0.9) + "$");

                    } else System.out.println("agam hala yönün belli değil");

                }
            }else if (age < 12) {
                if (route.equals("B")) {
                    if (flightDirection == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("12 yas altı B sehrine çift yon bilet toplam fiyatınız: " + (priceB * 0.5 * 0.8 * 2) + "$");
                    } else if (flightDirection == 0) {
                        System.out.println("12 yas altı  B sehrine tek yon bilet toplam fiyatınız: " + (priceB * 0.5) + "$");

                    } else System.out.println("agam hala yönün belli değil");


                } else if (route.equals("C")) {
                    if (flightDirection == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("12 yas altı C sehrine çift yon bilet toplam fiyatınız: " + (priceC * 0.5 * 0.8 * 2) + "$");
                    } else if (flightDirection == 0) {
                        System.out.println("12 yas altı C sehrine tek yon bilet toplam fiyatınız: " + (priceC * 0.5) + "$");

                    } else System.out.println("agam hala yönün belli değil");

                } else if (route.equals("D")) {
                    if (flightDirection == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("12 yas altı D sehrine çift yon bilet toplam fiyatınız: " + (priceD * 0.5 * 0.8 * 2) + "$");
                    } else if (flightDirection == 0) {
                        System.out.println("12 yas altı D sehrine tek yon bilet toplam fiyatınız: " + (priceD * 0.5) + "$");

                    } else System.out.println("agam hala yönün belli değil");
                }

            } else {
                if (route.equals("B")) {
                    if (flightDirection == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("24/65 B sehrine çift yon bilet toplam fiyatınız: " + (priceB * 0.8 * 2) + "$");
                    } else if (flightDirection == 0) {
                        System.out.println("24/65  B sehrine tek yon bilet toplam fiyatınız: " + (priceB) + "$");

                    } else System.out.println("agam hala yönün belli değil");


                } else if (route.equals("C")) {
                    if (flightDirection == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("24/65 C sehrine çift yon bilet toplam fiyatınız: " + (priceC * 0.8 * 2) + "$");
                    } else if (flightDirection == 0) {
                        System.out.println("24/65 C sehrine tek yon bilet toplam fiyatınız: " + (priceC) + "$");

                    } else System.out.println("agam hala yönün belli değil");

                } else if (route.equals("D")) {
                    if (flightDirection == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("24/65 D sehrine çift yon bilet toplam fiyatınız: " + (priceD * 0.8 * 2) + "$");
                    } else if (flightDirection == 0) {
                        System.out.println("24/65 altı D sehrine tek yon bilet toplam fiyatınız: " + (priceD) + "$");

                    } else System.out.println("agam hala yönün belli değil");
                    System.out.println("indirimsiz ucus");
                }


            }
        }


    }
}
