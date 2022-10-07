package TestClasses;

import bankAccount.Musteriler;

public class FarkliHesabaTransfer {

    public static void main(String[] args) {

        // Bu kısmda müşteri bilgileri hazır girilir.
        Musteriler u1 = new Musteriler("Kuzey", "kzy123", "02/09/2000", "Evli", 1000, 2000);

        // Bu kısmda müşteri bilgileri hazır girilir.
        Musteriler u2 = new Musteriler("Eva", "evaBjk1903", "11/12/1998", "bekar", 3000, 2000);

        u1.transfer(u1, u2);

        System.out.println(u1.toString());

        System.out.println(u2.toString());

//         Kefil eklemek istiyor musunuz ?              TODO----CEVAP = Evet / Hayır
//         Kefilin adı ?                                TODO----CEVAP = Bilal
//         Kefilin doğum tarihi ?                       TODO----CEVAP = 02/09/2000
//         Hesaplarınız arasında mı yoksa farklı bir kullanıcı
//         arasında mı transfer yapmak istiyorsunuz?    TODO----CEVAP = Farklı / Kendi
//         Transfer istediğiniz para miktarını girin    TODO----CEVAP = 200

//   ***  İSTENİLEN RAPOR ÖRNEĞİ ŞÖYLE OLMALIDIR  ***
//        Musterinin adı          :  Kuzey
//        Musterinin şifresi      :  kzy123
//        Musterinin dogum tarihi :  Kredi kartı alabilirsiniz.
//        Musterinin medeni hali  :  İşlem başarılı
//        Hesap No-1              :  72837464
//        Hesap Bakiyesi-1        :  800
//        Hesap No-2              :  53034684
//        Hesap Bakiyesi-2        :  2000
//        Kefilin tam adı         :  Bilal
//        Kefilin yaşı            :  02/09/2000

//   ***  İSTENİLEN RAPOR ÖRNEĞİ ŞÖYLE OLMALIDIR  ***
//        Musterinin adı          :  Eva
//        Musterinin şifresi      :  evaBjk1903
//        Musterinin dogum tarihi :  Kredi kartı alabilirsiniz.
//        Musterinin medeni hali  :  null
//        Hesap No-1              :  72837464
//        Hesap Bakiyesi-1        :  3196
//        Hesap No-2              :  53034684
//        Hesap Bakiyesi-2        :  2000
//        Kefilin tam adı         :  null
//        Kefilin yaşı            :  null

    }
}
