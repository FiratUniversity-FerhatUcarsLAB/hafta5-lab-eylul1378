/*
 * Ad Soyad: Nihal Eylül İL 
 * Ogrenci No: 250541001
 * Tarih: 07.11.2025
 * Aciklama: Geometrik Sekil Hesaplayici
 */

 public class GeometriHesap{

    // Sabit tanımlandı.
    public static final double PI = 3.14;

    // Kare Alanı
    public static double kareAlanHesaplama(double kenar) {
        return kenar * kenar;
    }

    // Kare Çevresi
    public static double kareCevreHesapla(int kenar) {
        double kenarlari_toplami = kenar * 4;
        return kenarlari_toplami;
    }

    // Daire Alanı
    public static double daireAlanHesapla(double yaricap) {
        return PI * yaricap * yaricap;
    }

    // Daire Çevresi
    public static double daireCevreHesapla(double yaricap) {
        return 2 * PI * yaricap;
    }

    // Üçgen Çevresi
    public static double ucgenCevreHesapla(double a, double b, double c) {
        return a + b + c;
    }

    // Üçgen Alanı
    public static double ucgenAlanHesapla(double base, double height) {
        return base * height / 2;
    }
    
    // Dikdörtgen Alanı
    public static double dikdortgenAlanHesapla(double genislik, double yukseklik) {
        return genislik * yukseklik;
    }

    // Dikdörtgen Çevresi
    public static double dikdortgenCevreHesapla(double genislik, double yukseklik) {
        return 2 * (genislik + yukseklik);
    }
    public static void main(String[] args) {

        //Kare Hesapları
        System.out.println("Kare alanının ve çevresinin hesaplanması:");
        int kenar = 5;
        double alan = kareAlanHesaplama(kenar); // Metot çağrısı
        System.out.printf("Alan: %.2f\n", alan);

        double cevre = kareCevreHesapla(kenar); // Metot çağrısı
        System.out.println("Kare Çevresi: " + cevre);

        //Daire Hesapları
        System.out.println("\nDaire alanının ve çevresinin hesaplanması:");
        double yaricap = 7.0;
        
        double daireAlan = daireAlanHesapla(yaricap); // Metot çağrısı
        System.out.println("Daire Alanı: " + daireAlan);

        double daireCevre = daireCevreHesapla(yaricap); 
        System.out.println("Daire Çevresi: " + daireCevre);

        //Üçgen Hesapları
        System.out.println("\nÜçgen alanının ve çevresinin hesaplanması:");
        double a = 3, c = 5;
        int b = 4;
        
        double ucgenCevre = ucgenCevreHesapla(a, b, c); // Metot çağrısı
        System.out.println("Üçgen Çevresi: " + ucgenCevre);

        double ucgen_taban = 3.5;
        double ucgen_yukseklik = 2;
        
        double ucgenAlan = ucgenAlanHesapla(ucgen_taban, ucgen_yukseklik); // Metot çağrısı
        System.out.println("Üçgen Alanı: " + ucgenAlan);
        
        //Dikdörtgen Hesapları
        System.out.println("\nDikdörtgen alanının ve çevresinin hesaplanması:");
        double genislik = 10.0;
        double yukseklik = 8.0;

        double dikdortgenAlan = dikdortgenAlanHesapla(genislik, yukseklik); // Metot çağrısı
        System.out.println("Dikdörtgen Alanı: " + dikdortgenAlan);

        double dikdortgenCevre = dikdortgenCevreHesapla(genislik, yukseklik); // Metot çağrısı
        System.out.println("Dikdörtgen Çevresi: " + dikdortgenCevre);
    }
}