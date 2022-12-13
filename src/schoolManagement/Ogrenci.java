package schoolManagement;

public class Ogrenci extends Kisi{

        //encupsulation ile değişkeni privite yaptık, get ile diğer methodlardan
        // variable içindeki değeri alırız, set ile variable’a veri göndeririz
        private String sinif; //öğrenci’ye özel variable’ları ekleriz
        private int ogrNo; //generate + getter/setter


        public Ogrenci() {//boş constructor ekleriz ihtiyaç olabilir diye, select none ile
        }


        public Ogrenci(String isim, String soyIsim, String tcNo, int yas, String sinif, int ogrNo) {
            //extend ettiğimiz sınıftaki değişkenleri getirir
            super(isim, soyIsim, tcNo, yas);
            this.sinif = sinif;
            this.ogrNo = ogrNo;
        }


        public String getSinif() {
            return sinif;
        }


        public void setSinif(String sinif) {
            this.sinif = sinif;
        }


        public int getOgrNo() {
            return ogrNo;
        }


        public void setOgrNo(int ogrNo) {
            this.ogrNo = ogrNo;
        }

        //encupsilation kullandığımızda bunları ekranda görmek istediğimizde
        // Generate+toString methodunu kullanırız. Bu ekrana erişimimizi sağlar
        @Override
        public String toString() { //ToString private şekilde oluşturduğumuz verileri ekrana yazdırır
            return super.toString() +
                    "sinif='" + sinif + '\'' +
                    ", ogrNo=" + ogrNo ;
        }
}
