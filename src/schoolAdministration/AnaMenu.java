package schoolAdministration;

import java.util.Scanner;
public class AnaMenu {
                    /*
                 ====================================
                      ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
                     ====================================
                      1- ÖĞRENCİ İŞLEMLERİ
                      2- ÖĞRETMEN İŞLEMLERİ
                      Q- ÇIKIŞ
                  */

    void anaMenu(){
        System.out.print("====================================\n" +
                "ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "====================================\n" +
                "1- ÖĞRENCİ İŞLEMLERİ\n" +
                "2- ÖĞRETMEN İŞLEMLERİ\n" +
                "Q- ÇIKIŞ\n" +
                "SECİMİNİZ: ");
        Scanner scan = new Scanner(System.in);


        while(true){ //doğru değer girilinceye kadar döndürecek

            char secim=scan.next().toUpperCase().charAt(0); //küçük q’ya basarsa da çıkabilir
            switch (secim){
                case '1':{ //öğrenci işlemleri
                    OgrenciMenu ogrMenu=new OgrenciMenu();
                    ogrMenu.ogrMenu();

                }
                case '2':{
                    OgretmenMenu ogrtMenu=new OgretmenMenu();
                    ogrtMenu.ogretmenMenu();

                }
                case 'Q':{
                    System.out.println("GÜLE GÜLE");
                    System.exit(0);
                }
                default:{
                    System.out.println("Gecerli deger giriniz");
                    anaMenu();
                }
            }
        }
    }

}

