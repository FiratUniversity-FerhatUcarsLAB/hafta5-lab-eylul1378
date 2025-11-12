/*
 * Ad Soyad: Nihal Eylül İL
 * Ogrenci No: 250541001
 * Tarih: 07.11.2025
 * Aciklama: Fizik Formulu Asistani
 */

 import java.util.Scanner;

public class SepetHesap{

    //Sabitler tanımlandı.
    final static double VAT_RATE = 0.18;  // KDV Oranı
    final static double SHIPPING_FEE = 29.99;  // Kargo Ücreti

    //Ürün Toplamı (Fiyat * Adet)
    public static double calculateItemTotal(double price, int quantity) {
        return price * quantity;
    }

    //Ara Toplam (3 ürünün toplamı)
    public static double calculateSubtotal(double total1, double total2, double total3) {
        return total1 + total2 + total3;
    }

    //İndirim Tutarı (Ara toplam * %) [cite: 142]
    public static double calculateDiscountAmount(double subtotal, double percentage) {
        // PDF kuralı: %10 ise 10.0 / 100.0 = 0.10
        return subtotal * (percentage / 100.0);
    }

    //İndirimli Toplam (Ara Toplam - İndirim) 
    public static double calculateDiscountedTotal(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    //KDV Tutarı (İndirimli Toplam üzerinden) 
    public static double calculateVatAmount(double discountedTotal) {
        return discountedTotal * VAT_RATE;
    }

    //Genel Toplam (İndirimli + KDV + Kargo) 
    public static double calculateGrandTotal(double discountedTotal, double vatAmount) {
        return discountedTotal + vatAmount + SHIPPING_FEE;
    }
    public static void main(String[] args) {

        //Scanner tanımlandı.
        Scanner input = new Scanner(System.in);

        System.out.println("=== GÖREV 3: E-TİCARET SEPET HESAPLAYICI ===");

        //Gerekli bilgiler kullanıcıdan istendi.
        System.out.print("Ürün 1 Fiyatı (TL): ");
        double fiyat1 = input.nextDouble();
        System.out.print("Ürün 1 Adedi: ");
        int adet1 = input.nextInt();

        System.out.print("Ürün 2 Fiyatı (TL): ");
        double fiyat2 = input.nextDouble();
        System.out.print("Ürün 2 Adedi: ");
        int adet2 = input.nextInt();

        System.out.print("Ürün 3 Fiyatı (TL): ");
        double fiyat3 = input.nextDouble();
        System.out.print("Ürün 3 Adedi: ");
        int adet3 = input.nextInt();


        System.out.print("Uygulanacak indirim kuponu yüzdesi: ");
        double indirimYuzdesi = input.nextDouble();


        //Hesaplamalar yapıldı.
        double urun1Toplam = calculateItemTotal(fiyat1, adet1);
        double urun2Toplam = calculateItemTotal(fiyat2, adet2);
        double urun3Toplam = calculateItemTotal(fiyat3, adet3);
        double araToplam = calculateSubtotal(urun1Toplam, urun2Toplam, urun3Toplam);
        double indirimTutari = calculateDiscountAmount(araToplam, indirimYuzdesi);
        double indirimliToplam = calculateDiscountedTotal(araToplam, indirimTutari); 
        double kdvTutari = calculateVatAmount(indirimliToplam);
        double genelToplam = calculateGrandTotal(indirimliToplam, kdvTutari);

        //Çıktılar yazdırıldı.
        System.out.println("\n========= SEPET ÖZETİ =========");
        System.out.printf("Ürün 1 Toplamı   : %.2f TL\n", urun1Toplam);
        System.out.printf("Ürün 2 Toplamı   : %.2f TL\n", urun2Toplam);
        System.out.printf("Ürün 3 Toplamı   : %.2f TL\n", urun3Toplam);
        System.out.println("---------------------------------");
        System.out.printf("Ara Toplam       : %.2f TL\n", araToplam);
        System.out.printf("İndirim Tutarı (%%%.0f): -%.2f TL\n", indirimYuzdesi, indirimTutari);
        System.out.printf("İndirimli Toplam : %.2f TL\n", indirimliToplam);
        System.out.println("---------------------------------");
        System.out.printf("KDV Tutarı (%%18) : +%.2f TL\n", kdvTutari);
        System.out.printf("Kargo Ücreti     : +%.2f TL\n", SHIPPING_FEE);
        System.out.println("=================================");
        System.out.printf("GENEL TOPLAM     : %.2f TL\n", genelToplam);

        input.close();
    }
}