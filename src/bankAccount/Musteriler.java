package bankAccount;

import java.sql.Date;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Musteriler {

  // 8. Adım
//    -- String tipinde "ad" ,"sifre", "dogumTarihi", "medeniHali", "kefilTamAd", "kefilYasi", değişkenlerini oluşturun.
//    -- int tipinde hesapNo1, hesapBakiye1 , hesapNo2 , hesapBakiye2   değişkenlerini oluşturun.
//    -- hepsi public olmalıdır.
       public String ad,sifre,dogumTarihi,medeniHali,kefilTamAd,kefilYasi;
       public int hesapNo1, hesapBakiye1 , hesapNo2 , hesapBakiye2;


//----------------------------------------------------------------------------------------------------------------------

  // 9. Adım
//   -- Parametreleri String ad , sifre , dogumTarihi , medeniHali ve
//      Int hesapBakiye1 , hesapBakiye2 bir olan constructor oluşturun
//   -- Class ad parametre ad a eşitle.
//   -- Class sifre parametre sifre ye eşitle.
//   -- Class hesapBakiye1 parametre hesapBakiye1 e eşitle.
//   -- Class hesapBakiye2 parametre hesapBakiye2 ye eşitle.
//   -- Class hesapNo1 randomHesapNoOlustur() methoduna eşitle ve değerini oradan almalı.
//   -- Class hesapNo2 randomHesapNoOlustur() methoduna eşitle ve değerini oradan almalı.
//   -- Class medeniHali medeniHalKontrol() methoduna eşitlenmeli ve metod parametresi medeniHali parametresini almalı.
//   -- Class dogumTarihi yasKontrol() methoduna eşitlenmeli ve metod parametresi dogumTarihi parametresini almalı.

    public Musteriler(String ad, String sifre, String dogumTarihi, String medeniHali, int hesapBakiye1, int hesapBakiye2) {
        this.ad = ad;
        this.sifre = sifre;
        this.dogumTarihi = dogumTarihi;
        this.medeniHali = medeniHali;
        this.hesapBakiye1 = hesapBakiye1;
        this.hesapBakiye2 = hesapBakiye2;
    }
    public void randomHesapNoOlustur(){
        this.hesapNo1=(int)((Math.random()+1)*10000000);
        this.hesapNo2=(int)((Math.random()+1)*10000000);

    }
    public String  medeniHalKontrol(String medeniHali) {
        Scanner scan = new Scanner(System.in);
        String cevap;
        if (medeniHali.equalsIgnoreCase("evli")) {
            System.out.println("Kefil Eklemek İstiyormusunuz ?");
            cevap = scan.nextLine();
            if (cevap.equalsIgnoreCase("evet")) {
                System.out.println("Kefil tam adı: ");
                kefilTamAd = scan.nextLine();
                System.out.println("Kefil doğum tarihi: ");
                kefilYasi = scan.nextLine();
                KefilEkle kefil = new KefilEkle(kefilTamAd, kefilYasi);

                if (kefil.kefilYasKontrol(kefilYasi)) {
                    this.medeniHali="İşlem Başarılı";
                    return "İşlem Başarılı";
                } else {
                    kefilYasi = "Kefil 18 yaşından büyük olmalıdır.";
                   return medeniHali="Kefil 18 yaşından büyük olmalıdır.";

                }
            }else return this.medeniHali=null;


        }
        return null;}




//----------------------------------------------------------------------------------------------------------------------

    // 10. Adım
//    -- Parametresi String medeniHali ve return tipi String olan medeniHalKontrol() methodunu oluşturun
//    -- Eğer medeni hali "Evli" ise
//       - Kullanıcıya sor ( scanner class kullanın)
//       "Kefil eklemek istiyor musunuz ? : "
//       - Kullanıcı "Evet" derse kullanıcıya sor
//       "Kefilin adı ? : "
//       - Kullanıcıya sor
//       "Kefilin doğum tarihi ? : "
//       Sonra KefilEkle(kefilTamAdi, kefilDogumTarihi) ekleyin (Classın nesnesini oluşturun yani classı new leyin)
//       kefilTamAd değişkeni KefilEkle classındaki tamAd a eşitleyin.
//       kefilYasi değişkeni KefilEkle classındaki yas a eşitleyin.//
//    -- Eğer kefilYasi "0" a eşit ise
//       kefilTamAd i "Kefil 18 yaşından büyük olmalıdır." ile değiştir(Yani kefilin yaşı tutmadığı için adına bu mesajı yazın)
//       kefilYasi "Kefil 18 yaşından büyük olmalıdır." ile değiştir(Yani kefilin yaşı tutmadığı için adına bu mesajı yazın)
//       returnü de "Kefil 18 yaşından büyük olmalıdır." mesajını göndermeli.
//    -- Eğer kefilYasi "0" a eşit değilse
//       return "İşlem başarılı" mesajını döndürmeli.
//
//    -- Eğer kullanıcı Hayır derse hiçbirşey eklemeye gerek yok.
//       return null olmalıdır.



//----------------------------------------------------------------------------------------------------------------------
    public static String  yasKontrol(String dogumTarihi){
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate tarih=LocalDate.parse(dogumTarihi,f);
        LocalDate today=LocalDate.now();
        int fark=Period.between(tarih,today).getYears();
        if (fark>=18){
            return "Kredi kartı alabilirsiniz";
        }else return "Kredi kartı alabilmek için en az 18 yaşında olmalısınız.";

}
  // 11. Adım
//     -- Parametresi String dogumTarihi ve return  tipi String olan yasKontrol adında static methodunu oluşturun
//     -- güncel yılı (buYil) dogumTarihi ile karşılaştırın.
//     -- Eğer çıkan sonuç 18 e eşit ve büyük ise "Kredi kartı alabilirsiniz." mesajını return edin.
//     -- Eğer çıkan sonuç 18 den küçük ise "Kredi kartı alabilmek için en az 18 yaşında olmalısınız."
//        mesajını return edin.

//        Örnek buYil 10/05/2022 ise
//        Eğer dogumTarihi  09/05/2000 ise
//        return "Kredi kartı alabilirsiniz." olmalı
//        Eğer   myDOB  11/05/2005  ise
//        return "Kredi kartı alabilmek için en az 18 yaşında olmalısınız." olmalı



//----------------------------------------------------------------------------------------------------------------------

    // 11. Adım
//      -- 8 basamak sayı döndüren Random sayı metodu oluşturun.
//         Bu sayı  10000000 - 99999999 arasında olamalı.



//----------------------------------------------------------------------------------------------------------------------
    public void transfer(Musteriler object1,Musteriler object2){


        Scanner scan=new Scanner(System.in);
        Scanner intscan=new Scanner(System.in);
        medeniHalKontrol(medeniHali);
        randomHesapNoOlustur();
//        KefilEkle kefil=new KefilEkle(kefilTamAd,kefilYasi);
//        this.kefilYasi=kefil.getYas();
        String cevap;
        int miktar;
        System.out.println("Hesaplarınız arasında mı yoksa farklı bir kullanıcı arasında mı transfer yapmak istiyorsunuz? : ");
        cevap=scan.nextLine();
        if (cevap.equalsIgnoreCase("kendi")){
            System.out.println("Transfer etmek istediğiniz miktarı giriniz : ");
            miktar=intscan.nextInt();
            Hesap.virman(object1,miktar);

        }else {
            System.out.println("Transfer etmek istediğiniz miktarı giriniz : ");
            miktar=intscan.nextInt();
            Hesap.baskaHesabaHavale(object1,object2,miktar);
            object1.randomHesapNoOlustur();
            object2.randomHesapNoOlustur();
        }
    }
    // 12. Adım
//    -- Parametresi iki tane Musteriler object1 ve object2 olan return tipi void olan transfer adında method oluşturun.
//    -- Bu method içinden önce kullanıcıya sor
//      "Hesaplarınız arasında mı yoksa farklı bir kullanıcı arasında mı transfer yapmak istiyorsunuz? : "(scanner class kullan)
//       - Eğer cevap "Kendi" ise
//        "Transfer etmek istediğiniz miktarı giriniz : " mesajını gönderiniz (scanner class kullan)
//       Hesap classı içinde virman methodunu çağırın.
//      - Eğer cevap farklı ise
//        "Transfer etmek istediğiniz miktarı giriniz : " mesajını gönderiniz (scanner class kullan)
//       Hesap class içinde baskaHesabaHavale methodunu çağırın.



//----------------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {




        return  "Musterinin adı          :"+ad+"\n"+
                "Musterinin şifresi      :"+sifre+"\n"+
                "Musterinin dogum tarihi :"+yasKontrol(dogumTarihi)+"\n"+
                "Musterinin medeni hali  :"+medeniHali+"\n"+
                "Hesap No-1              :"+hesapNo1+"\n"+
                "Hesap Bakiyesi-1        :"+hesapBakiye1+"\n"+
                "Hesap No-2              :"+hesapNo2+"\n"+
                "Hesap Bakiyesi-2        :"+hesapBakiye2+"\n"+
                "Kefilin tam adı         :"+ kefilTamAd +"\n"+
                "Kefilin yaşı            :"+kefilYasi;
    }

    // 13. Adım
//       toString methodunu kullanarak objecti yazdırın.
//      Örnek :
//    public String toString() {
//        return {"\n Musterinin adı          : " + ad +
//                "\n Musterinin şifresi      : " + sifre +
//                "\n Musterinin dogum tarihi : " + dogumTarihi
//                .
//                .
//                .
//                  }; gibi



//----------------------------------------------------------------------------------------------------------------------

// ***Videodaki süsleme işlemlerinden fikir edinerek sizlerde benzer veya daha farklı durumlar hazırlayabilirsiniz.***

//----------------------------------------------------------------------------------------------------------------------
}
