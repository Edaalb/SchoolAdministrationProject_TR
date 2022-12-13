package schoolManagement;

public class Ogretmen extends Kisi{

         //Öğretmen class’ını kişi class’ına extend ederiz
        private String bolum; //öğretmen’de ekstradan olan değişkenleri ekleriz. Ortak olanlar kişi class’ında
        private int sicilNo; //generate + getter/setter ile aşağıda methodları otomatik olarak oluşturduk


        public Ogretmen() {
        }


        public Ogretmen(String isim, String soyIsim, String tcNo, int yas, String bolum, int sicilNo) {
            //constructor’ı oluşturduk
            super(isim, soyIsim, tcNo, yas);
            //otomatik olarak super geldi. Super extend ettiğimiz class’a gider, oradaki değişkenleri bize gösterir.
            // Bunun içindeki değişkenleri buradan isteyebiliriz böylece
            this.bolum = bolum;
            this.sicilNo = sicilNo;
        }


        public String getBolum() {
            return bolum;
        }


        public void setBolum(String bolum) {
            this.bolum = bolum;
        }


        public int getSicilNo() {
            return sicilNo;
        }


        public void setSicilNo(int sicilNo) {
            this.sicilNo = sicilNo;
        }


        @Override
        public String toString() { //generate+toString ile oluşturduk
            return super.toString() +
                    "bolum='" + bolum + '\'' +
                    ", sicilNo=" + sicilNo ;
        }
    }
