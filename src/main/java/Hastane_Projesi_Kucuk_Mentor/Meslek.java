package Hastane_Projesi_Kucuk_Mentor;

public class Meslek {

    private String isim;

    private String soyisim;

    private String meslek;


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    @Override
    public String toString() {
        return "Meslek{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", meslek='" + meslek + '\'' +
                '}';
    }
}
