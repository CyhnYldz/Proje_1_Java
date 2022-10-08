package bankAccount;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class KefilEkle {

    // 5. Adım
//       String tipinde tamAd ve yas adında iki adet değişken oluşturun.

        private String tamAd;
        private String yas;

//----------------------------------------------------------------------------------------------------------------------

    // 6. Adım
//    --- Parametresi iki adet String tamAd ve yas olan KefilEkle classından constructor oluşturun.
//        Constructor da classın ve parametrenin değişkenlerini eşitleyin.
//
//        Eğer yas ı 18 e eşit veya büyük ise  class değişkenindeki yas eşittir  parametredeki yas a.(KefilYasKontrol() methodunu kullan)
//        Eğer yas 18 den küçük ise class değişkenindeki yas eşittir "0" olmalıdır.
    public KefilEkle(String tamAd, String  yas){
        setTamAd(tamAd);
        setYas(yas);
    }

    public String getTamAd() {
        return tamAd;
    }

    public void setTamAd(String tamAd) {
        this.tamAd = tamAd;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        if (kefilYasKontrol(yas)) {
            this.yas = yas;
        }else this.yas="0";
    }

    //----------------------------------------------------------------------------------------------------------------------

    // 7. Adım
//       --- Parametresi String kefilYas ve return tipi boolean olan
//           KefilYasKontrol()  methodunu oluşturun
//       --- Eğer kefilYas 18 den büyük veya eşit ise "true" return et.
//           18 den küçük ise "false" return et
//           (Musteriler classından yasKontrol() methodunu kullanın)

    boolean kefilYasKontrol(String kefilYas){
        if(Musteriler.yasKontrol(kefilYas).equalsIgnoreCase("Kredi kartı alabilirsiniz")){
            return true;
        }

        else System.out.println("kefil yaşı 18 yaşından büyük olmalıdır");return false;
    }



//----------------------------------------------------------------------------------------------------------------------

}
