package schoolAdministration;

public interface IIslemler {

         //bir şablona sahip olmak için interface kullanırız
        /*
        ============= İŞLEMLER =============
             1-EKLEME
             2-ARAMA
             3-LİSTELEME
             4-SİLME
             Q-ÇIKIŞ
         */
         //interface içindeki methodları oluştururken methodların blokları olmaz, boş methodlar oluşturulur

        public void ekleme();
        public void arama();
        public void listeleme();
        public void silme();
        public void cikis();

        //oluşturulan bu methodlar öğretmen ve öğrenci alanlarında kullanılacak

}
