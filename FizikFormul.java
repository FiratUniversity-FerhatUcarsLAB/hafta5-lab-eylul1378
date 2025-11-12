/*
 * Ad Soyad: Nihal Eylül İL
 * Ogrenci No: 250541001
 * Tarih: 07.11.2025
 * Aciklama: Fizik Formulu Asistani
 */

import java.util.Scanner;
import java.lang.Math; 

public class FizikFormul {

    //Sabit tanımlandı.
    public static final double GRAVITY = 9.8; 

    // 1. Hız (v = s / t) 
    public static double hizHesabi(double uzaklik, double zaman) {
        return uzaklik / zaman; 
    }

    // 2. İvme (a = Δv / t) 
    public static double ivmeHesabi(double hizDegisimi, double zaman) {
        return hizDegisimi / zaman;
    }

    // 3. Kuvvet (F = m * a) 
    public static double kuvvetHesabi(double kutle, double ivme) {
        return kutle * ivme;
    }

    // 4. İş (W = F * d) 
    public static double isHesabi(double kuvvet, double uzaklik) {
        return kuvvet * uzaklik;
    }

    // 5. Güç (P = W / t) 
    public static double gucHesabi(double is, double zaman) {
        return is / zaman;
    }

    // 6. Kinetik Enerji (KE = 0.5 * m * v^2) 
    public static double kinetikEnerjiHesabi(double kutle, double hiz) {
        return 0.5 * kutle * Math.pow(hiz, 2); 
    }

    // 7. Potansiyel Enerji (PE = m * g * h) 
    public static double potansiyelEnerjiHesabi(double kutle, double g, double yukseklik) {
        return kutle * g * yukseklik;
    }

    // 8. Momentum (p = m * v)
    public static double momentumHesabi(double kutle, double hiz) {
        return kutle * hiz;
    }
    public static void main(String[] args) {

        //Scanner çağırıldı.
        Scanner input = new Scanner(System.in);
        System.out.println("=== GÖREV 2: FİZİK FORMÜL ASİSTANI ===");
        
        System.out.print("Kütle (kg): ");
        double kutle = input.nextDouble();
        System.out.print("Uzaklık (m): ");
        double uzaklik = input.nextDouble();
        System.out.print("Zaman (s): ");
        double zaman = input.nextDouble();
        System.out.print("Hız değişimi (m/s): ");
        double hizDegisimi = input.nextDouble();
        System.out.print("Yükseklik (m): ");
        double yukseklik = input.nextDouble();

        //Hesaplar yapıldı ve metotlar çağırıldı.

        double hiz = hizHesabi(uzaklik, zaman);
        double ivme = ivmeHesabi(hizDegisimi, zaman);
        double kuvvet = kuvvetHesabi(kutle, ivme);
        double is = isHesabi(kuvvet, uzaklik);
        double guc = gucHesabi(is, zaman);
        double kinetikEnerji = kinetikEnerjiHesabi(kutle, hiz);
        double momentum = momentumHesabi(kutle, hiz);
        double potansiyelEnerji = potansiyelEnerjiHesabi(kutle, GRAVITY, yukseklik);

        //Çıktılar yazdırıldı.

        System.out.println("\n========= HESAPLAMA SONUÇLARI =========");

        System.out.println("--- HIZ VE HAREKET ---");
        System.out.printf("Hız (v = s/t)            : %.2f m/s\n", hiz);
        System.out.printf("İvme (a = Δv/t)          : %.2f m/s²\n", ivme);
        
        System.out.println("\n--- KUVVET VE İŞ ---");
        System.out.printf("Kuvvet (F = m*a)         : %.2f N\n", kuvvet);
        System.out.printf("İş (W = F*d)             : %.2f J\n", is); 
        System.out.printf("Güç (P = W/t)            : %.2f W\n", guc); 

        System.out.println("\n--- ENERJİ VE MOMENTUM ---");
        System.out.printf("Kinetik Enerji (KE)      : %.2f J\n", kinetikEnerji); 
        System.out.printf("Potansiyel Enerji (PE)   : %.2f J\n", potansiyelEnerji);
        System.out.printf("Momentum (p = m*v)       : %.2f kg·m/s\n", momentum);
        System.out.println("=========================================");

        input.close();
    }
}