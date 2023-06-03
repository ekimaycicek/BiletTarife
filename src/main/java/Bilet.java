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

        System.out.println("Welcome to ekoAirlines \nB C D rotasından birini seciniz: ");
        String rota = sc.nextLine().toUpperCase();

        System.out.println("ucak yönü için \ntek yon -> 0\ncift yon -> 1\n seciniz");
        int ucusYonu = sc.nextInt();

        System.out.println("agam yasını gir: ");
        int yas = sc.nextInt();

        double fiyatB = 500 * 0.10;//a dan b ye ucus fiyatı
        double fiyatC = 700 * 0.10;//a dan c ye ucus fiyatı
        double fiyatD = 900 * 0.10;//a dan d ye ucus fiyatı

        if (rota.equals("B") || rota.equals("C") || rota.equals("D")) {// rota kontrolü yapıldı
            if (yas > 65) {
                if (rota.equals("B")) {
                    if (ucusYonu == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("65 yas üstü B sehrine çift yon bilet toplam fiyatınız: " + (fiyatB * 0.7 * 0.8 * 2) + "$");
                    } else if (ucusYonu == 0) {
                        System.out.println("65 yas üstü B sehrine tek yon bilet toplam fiyatınız: " + (fiyatB * 0.7) + "$");

                    } else System.out.println("agam hala yönün belli değil");


                } else if (rota.equals("C")) {
                    if (ucusYonu == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("65 yas üstü C sehrine çift yon bilet toplam fiyatınız: " + (fiyatC * 0.7 * 0.8 * 2) + "$");
                    } else if (ucusYonu == 0) {
                        System.out.println("65 yas üstü C sehrine tek yon bilet toplam fiyatınız: " + (fiyatC * 0.7) + "$");

                    } else System.out.println("agam hala yonün belli değil");

                } else if (rota.equals("D")) {
                    if (ucusYonu == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("65 yas üstü D sehrine çift yon bilet toplam fiyatınız: " + (fiyatD * 0.7 * 0.8 * 2) + "$");
                    } else if (ucusYonu == 0) {
                        System.out.println("65 yas üstü D sehrine tek yon bilet toplam fiyatınız: " + (fiyatD * 0.7) + "$");

                    } else System.out.println("agam hala yönün belli değil");

                } else System.out.println("hatalı girdin agacım");

            } else if (yas < 24 && yas >= 12) {
                if (rota.equals("B")) {
                    if (ucusYonu == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("12/24 yas  B sehrine çift yon bilet toplam fiyatınız: " + (fiyatB * 0.9 * 0.8 * 2) + "$");
                    } else if (ucusYonu == 0) {
                        System.out.println("12/24 yas  B sehrine tek yon bilet toplam fiyatınız: " + (fiyatB * 0.9) + "$");

                    } else System.out.println("agam hala yonün belli değil");


                } else if (rota.equals("C")) {
                    if (ucusYonu == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("12/24 yas  C sehrine çift yon bilet toplam fiyatınız: " + (fiyatC * 0.9 * 0.8 * 2) + "$");
                    } else if (ucusYonu == 0) {
                        System.out.println("12/24 yas  C sehrine tek yon bilet toplam fiyatınız: " + (fiyatC * 0.9) + "$");

                    } else System.out.println("agam hala yönün belli değil");

                } else if (rota.equals("D")) {
                    if (ucusYonu == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("12/24 yas  D sehrine çift yon bilet toplam fiyatınız: " + (fiyatD * 0.9 * 0.8 * 2) + "$");
                    } else if (ucusYonu == 0) {
                        System.out.println("12/24 yas  D sehrine tek yon bilet toplam fiyatınız: " + (fiyatD * 0.9) + "$");

                    } else System.out.println("agam hala yönün belli değil");

                }
            }else if (yas < 12) {
                if (rota.equals("B")) {
                    if (ucusYonu == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("12 yas altı B sehrine çift yon bilet toplam fiyatınız: " + (fiyatB * 0.5 * 0.8 * 2) + "$");
                    } else if (ucusYonu == 0) {
                        System.out.println("12 yas altı  B sehrine tek yon bilet toplam fiyatınız: " + (fiyatB * 0.5) + "$");

                    } else System.out.println("agam hala yönün belli değil");


                } else if (rota.equals("C")) {
                    if (ucusYonu == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("12 yas altı C sehrine çift yon bilet toplam fiyatınız: " + (fiyatC * 0.5 * 0.8 * 2) + "$");
                    } else if (ucusYonu == 0) {
                        System.out.println("12 yas altı C sehrine tek yon bilet toplam fiyatınız: " + (fiyatC * 0.5) + "$");

                    } else System.out.println("agam hala yönün belli değil");

                } else if (rota.equals("D")) {
                    if (ucusYonu == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("12 yas altı D sehrine çift yon bilet toplam fiyatınız: " + (fiyatD * 0.5 * 0.8 * 2) + "$");
                    } else if (ucusYonu == 0) {
                        System.out.println("12 yas altı D sehrine tek yon bilet toplam fiyatınız: " + (fiyatD * 0.5) + "$");

                    } else System.out.println("agam hala yönün belli değil");
                }

            } else {
                if (rota.equals("B")) {
                    if (ucusYonu == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("24/65 B sehrine çift yon bilet toplam fiyatınız: " + (fiyatB * 0.8 * 2) + "$");
                    } else if (ucusYonu == 0) {
                        System.out.println("24/65  B sehrine tek yon bilet toplam fiyatınız: " + (fiyatB) + "$");

                    } else System.out.println("agam hala yönün belli değil");


                } else if (rota.equals("C")) {
                    if (ucusYonu == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("24/65 C sehrine çift yon bilet toplam fiyatınız: " + (fiyatC * 0.8 * 2) + "$");
                    } else if (ucusYonu == 0) {
                        System.out.println("24/65 C sehrine tek yon bilet toplam fiyatınız: " + (fiyatC) + "$");

                    } else System.out.println("agam hala yönün belli değil");

                } else if (rota.equals("D")) {
                    if (ucusYonu == 1) {//tek yon ucus kontrol
                        System.out.println(" *** ");
                        System.out.println("24/65 D sehrine çift yon bilet toplam fiyatınız: " + (fiyatD * 0.8 * 2) + "$");
                    } else if (ucusYonu == 0) {
                        System.out.println("24/65 altı D sehrine tek yon bilet toplam fiyatınız: " + (fiyatD) + "$");

                    } else System.out.println("agam hala yönün belli değil");
                    System.out.println("indirimsiz ucus");
                }


            }
        }


    }
}
