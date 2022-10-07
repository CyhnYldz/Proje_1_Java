package TestClasses;

import bankAccount.Musteriler;

public class KendiHesaplariArasiTransfer {

    public static void main(String[] args){

        // Bu kısmda müşteri bilgileri hazır girilir.
        Musteriler u1 = new Musteriler("Kuzey", "Kk44_n", "10/02/2000", "Evli", 1000, 2000);

        u1.transfer(u1, u1);

         System.out.println(u1.toString());


//         Kefil eklemek istiyor musunuz ?      TODO----CEVAP = Evet
//         Kefilin adı ?                        TODO----CEVAP = Esra
//         Kefilin doğum tarihi ?               TODO----CEVAP = 11/11/2002
//         Hesaplarınız arasında mı yoksa farklı bir kullanıcı
//         arasında mı transfer yapmak istiyorsunuz?    TODO----CEVAP = Kendi
//         Transfer istediğiniz para miktarını girin    TODO----CEVAP = 100


//   ***  İSTENİLEN RAPOR ÖRNEĞİ ŞÖYLE OLMALIDIR  ***
//        Musterinin adı          :  Kuzey
//        Musterinin şifresi      :  Kk44_n
//        Musterinin dogum tarihi :  Kredi kartı alabilirsiniz.
//        Musterinin medeni hali  :  İşlem başarılı
//        Hesap No-1              :  90672595
//        Hesap Bakiyesi-1        :  900
//        Hesap No-2              :  95023323
//        Hesap Bakiyesi-2        :  2099
//        Kefilin tam adı         :  Esra
//        Kefilin yaşı            :  11/11/2002


    }

}
