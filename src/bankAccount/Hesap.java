package bankAccount;

public class Hesap {

//    1. Adım
//    --- Parametresi iki int olan  (int hesapBakiyesi , int tutar) ve return tipi int olan
//         yatirma isminde bir static method oluşturun.
//    --- işlem olarak hesapBakiyesi ne  tutar ekleyin.

    public static int yatirma(int hesapBakiyesi, int tutar){

        return hesapBakiyesi+=tutar;
    }



//----------------------------------------------------------------------------------------------------------------------

    //    2. Adım
//    --- Parametresi iki int olan  (int hesapBakiyesi , int tutar) ve return tipi int olan
//         paraCekme isminde bir static method oluşturun.
//    --- işlem olarak hesapBakiyesi den  tutar ı çıkarın.

    public static int paraCekme(int hesapBakiyesi, int tutar){

        return hesapBakiyesi-=tutar;
    }



//----------------------------------------------------------------------------------------------------------------------

    //    3. Adım
//      ---  Parametresi iki tane Musteriler(gonderen , alici) ve bir tane int (tutar)
//          olan baskaHesabaHavale isminde bir static methodu oluşturun.
//      --- Eğer tutar büyükse gonderen.hesapBakiye1 değişkeninden
//          "Hesap bakiyeniz yetersiz." mesajını gönderin.

//      --- Eğer  tutar küçükse  gonderen.hesapBakiye1 değişkeninden
//           - tutar dan 2% komisyon kesilsin.
//           - gonderen.hesapBakiye1  den tutar ı cıkartın
//           - alici.hesapBakiye1 e tutar ı ekleyin.
//           - ve, "İşlem başarıyla gerçekleştirilmiştir." mesajını gönderin.
//           (Bu işlem ile gönderen hesabtan gönderilen tutar düşülecek %2 komisyon tutardan
//              kesilip kalan miktar alıcı hesaba eklenecektir.)
//
//
//               Örnek:
//            gonderen.hesapBakiye1  1000 dolar var
//            alici.hesapBakiye1  200 dolar var
//
//            tutar 100 dolar
//            İşlemden sonra gonderen.hesapBakiye1  900 dolar olmalı.
//            İşlemden sonra alici.hesapBakiye1  298 dolar olmalı.
    public static void baskaHesabaHavale(Musteriler gonderen,Musteriler alici,int tutar){
        if (gonderen.hesapBakiye1>tutar){
            gonderen.hesapBakiye1-=tutar;
            tutar-=(tutar/100*2);
            alici.hesapBakiye1+=tutar;
            System.out.println("İlem Başarıyla Gerçekleştirilmiştir");
        }else System.out.println("Hesap bakiyeniz yetersiz !");
    }



//----------------------------------------------------------------------------------------------------------------------

    //    4. Adım
//         --- Parametresi bir tane Musteriler musteriHesap ve bir tane int tutar olan
//             virman isminde bir static method oluşturun.
//         --- Eğer tutar büyükse musteriHesap.hesapBakiye1 den
//             "Hesap bakiyeniz yetersiz." mesajını gönderin.
//         --- Eğer tutar küçükse musteriHesap.hesapBakiye1 den
//            - tutar dan 2% komisyon kesilsin.
//            - musteriHesap.hesapBakiye1 den tutar ı çıkarın.
//            - musteriHesap.hesapBakiye2 ye tutar ı ekle
//            - ve, "İşlem başarıyla gerçekleştirilmiştir." mesajını gönderin.
//            (Bu işlem ile gönderen hesabından gönderilen tutar düşülecek %1 komisyon tutardan
//              kesilip kalan miktar alan hesabına eklenecektir.)
//
//
//               Örnek:
//            musteriHesap.hesapBakiye1  1000 dolar var
//            musteriHesap.hesapBakiye2  200 dolar var
//
//            tutar 100 dolar
//            İşlemden sonra musteriHesap.hesapBakiye1  900 dolar olmalı.
//            İşlemden sonra musteriHesap.hesapBakiye1  299 dolar olmalı.

    public static void virman(Musteriler musteriHesap,int tutar){
        if (musteriHesap.hesapBakiye1>tutar){
            musteriHesap.hesapBakiye1-=tutar;
            tutar-=(tutar/100*1);
            musteriHesap.hesapBakiye2+=tutar;
            System.out.println("İlem Başarıyla Gerçekleştirilmiştir");
        }else System.out.println("Hesap bakiyeniz yetersiz !");

    }



//----------------------------------------------------------------------------------------------------------------------

}












