package schoolManagement;

public class Kisi {

    // bu class’ta hem öğrenci hem de öğretmen alanında ortak olan değişkenleri oluştururuz
    //encupsulation kullanırız, privite kullanarak ulaşmayı zorlaştırırız

    private String isim;
    private String soyIsim;
    private String tcNo;
    private int yas;

    //bunların getter-setter’ını oluşturmak için sağa tıklayıp generate + getter-setter seçiyoruz.
    // Otomatik olarak aşağıda oluşturuyor

    public Kisi() { //parametresiz constructor oluştururuz
    }


    public Kisi(String isim, String soyIsim, String tcNo, int yas) {
        // generate + constructor ile parametreli constructor oluştururuz
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }


    public void setIsim(String isim) {
        this.isim = isim;
    }


    public String getSoyIsim() {
        return soyIsim;
    }




        public void setSoyIsim(String soyIsim) {
            this.soyIsim = soyIsim;
        }


        public String getTcNo() {
            return tcNo;
        }


        public void setTcNo(String tcNo) {
            this.tcNo = tcNo;
        }


        public int getYas() {
            return yas;
        }


        public void setYas(int yas) {
            this.yas = yas;
        }
        //bunlar encupsilation yöntemi ile oluşturulduğu için ekrana görüntülenmesi için
        // toString methodunu oluştururuz generate + toString

        @Override
        public String toString() {
            return
                    "isim='" + isim + '\'' +
                            ", soyIsim='" + soyIsim + '\'' +
                            ", tcNo='" + tcNo + '\'' +
                            ", yas=" + yas ;
        }

}

