package schoolManagement;
import java.util.ArrayList;
import java.util.Scanner;

            /*
                ============= İŞLEMLER =============
                     1-EKLEME
                     2-ARAMA
                     3-LİSTELEME
                     4-SİLME
                     Q-ÇIKIŞ

	                  SEÇİMİNİZ:
                                                            */

    public class OgrenciMenu implements IIslemler{

        //bunu oluşturduğumuzda önce uyarı verir, tanımladığı tüm methodları
        // bu class’ta kullanmak zorundayız.Sağ click Implements method diyerek hepsini seçeriz, override eder


        ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
        // öğrenci veri tipinde değişkenleri tutacak, öğrenci tipinde datalar.
        // Bunu öğrenci class’ında bir object oluşturduktan sonra oluşturduk
        Scanner scan = new Scanner(System.in); //class seviyesinde tanımlarız


        public void ogrMenu() {
            System.out.print("============= İŞLEMLER =============\n" +
                    "1-EKLEME\n" +
                    "2-ARAMA\n" +
                    "3-LİSTELEME\n" +
                    "4-SİLME\n" +
                    "Q-ÇIKIŞ\n" +
                    "SEÇİMİNİZ:");


            while (true) {
                char secim = scan.next().toUpperCase().charAt(0);
                switch (secim) {
                    case '1': {
                        ekleme(); //ekleme methodunu çağırıp ekleme işlemini yaparız
                    }
                    case '2': {
                        arama();
                    }
                    case '3': {
                        listeleme();
                    }
                    case '4': {
                        silme();
                    }
                    case 'Q': {
                        cikis();
                    }
                }
            }
        }


        @Override
        public void ekleme() {
            System.out.print("İsim giriniz: ");
            scan.nextLine(); //hata vermemesi için araya break işlevi gören bu kodu gireriz
            String isim = scan.nextLine();
            System.out.print("Soyisim giriniz: ");
            String soyIsim = scan.nextLine();
            System.out.print("TC No giriniz: ");
            String tcNo = scan.next();
            System.out.print("Yas giriniz: ");
            int yas = scan.nextInt();
            System.out.print("Sınıf giriniz: ");
            String sinif = scan.next();
            System.out.print("Ogrenci No giriniz: ");
            int ogrNo = scan.nextInt();

            //aldığımız değişkenleri işleme tabii tutarız
            //parametreli constructor kullanarak öğrenci class’ından bir object üretiriz
            Ogrenci ogrenci = new Ogrenci(isim, soyIsim, tcNo, yas, sinif, ogrNo);

            //öğrenci class’ından bir object oluşturduk.
            // Bu object’i kaydetmek için bir ArrayList oluştururuz ve bunu onun içine atarız.

            //burada oluşturduğumuz öğrenci’yi yukarıda oluşturduğumuz list’e atalım
            ogrenciList.add(ogrenci);
            //ekleme methodu oluşturduk ve ogrenciList’ine oluşturduğumuz object’i attık.
            // Artık ogrenciList’inde oluşturulmuş bir yapı var
            ogrMenu(); //işlemler bitince öğrenci Menüsüne geri döner
        }


        @Override
        public void arama() { //kimlik no ile arama ve silme işlemleri yapılacak
            if (!ogrenciList.isEmpty()) { //list’in dolu olup olmadığına bakar, boş değilse işlemleri yapar, boşsa liste boş diyerek geri döner
                System.out.print("Aranacak TC No giriniz: ");
                String aranacakTcNo = scan.next();
                //ogrenciList’teki tüm elemanları gezecek ve bu listteki her elemanın içindeki tc no ile aramak istediğimiz tc nolarını karşılaştıracak
                for (int i = 0; i < ogrenciList.size(); i++) {
                    if(ogrenciList.get(i).getTcNo().equals(aranacakTcNo)) {
                        System.out.println(ogrenciList.get(i)); //eşleştiğinde tc no’ya ait bilgileri ekrana gönderir
                    }
                }
                ogrMenu();
            } else { //boşsa
                System.out.println("Ogrenci Listesi boş");
                ogrMenu(); //geri döner
            }


        }

        @Override
        public void listeleme() { //arrayList’e eklenen dataları ekranda görüntüleriz
            if (!ogrenciList.isEmpty()) { //eğer liste boş değilse
                for (Ogrenci each : ogrenciList) {
                    System.out.println(each.toString());
                }

                ogrMenu();
            } else {
                System.out.println("Ogrenci Listesi boş");
                ogrMenu();
            }
        }


        @Override
        public void silme() { //girilen tc’ye göre silme işlemi yapılır
            if (!ogrenciList.isEmpty()) {
                System.out.print("Silme yapılacak Tc no giriniz: ");
                String aranacakTc = scan.nextLine();
                for (int i = 0; i < ogrenciList.size(); i++) { //öğrenci listesinin size’ı kadar döner
                    //öğrenci list’ine gider, get ile tc no ister
                    //aranacakTC no burada ayrı bir scope’ta başka yerde ayrı bir scope’ta
                    if (aranacakTc.equals(ogrenciList.get(i).getTcNo())) {
                        //öğrenci list’inin içinde öğrenci class’ından oluşturulan objectler bulunur.
                        // Öğrenci class’ının içindeki objectlere okuma yapmak için get method’unu kullanarak ulaşabiliriz.
                        // İ indexini veririz ve çağır deriz. İ index’inde tc no getirir
                        ogrenciList.remove(i); //yukarıdaki şartlar sağlanırsa öğrenciyi listeden remove eder
                        System.out.println("Tcno lu öğrenci silindi");
                        ogrMenu();
                    }
                }
                ogrMenu();
            } else {
                System.out.println("Ogrenci Listesi boş");
                ogrMenu();
            }


        }

        @Override
        public void cikis() { //çıkış işlemi yapınca ana menüye gider
            AnaMenu anaMenu = new AnaMenu(); //ana menü class’ından bir object oluştururuz.
                                     // AnaMenu class’ındaki variable ve methodlara ulaşmak için oluştururuz

            anaMenu.anaMenu(); //noktadan önceki AnaMenu class’ından oluşturulan bir object,
                                // noktadan sonraki ise AnaMenu class’ının içindeki anaMenu methodu’dur
        }
    }
