import java.util.Scanner;

public class ModifKafe18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = sc.nextInt();
        
        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        double nominalBayar;
        
        if (keanggotaan) {
            nominalBayar = totalHarga - (diskon * totalHarga);
            System.out.print("Anda mendapatkan diskon 10% sebagai benefit keanggotaan anda");
        } else {
            nominalBayar = totalHarga;
        }

        System.out.println("Keanggotan pelanggan: " +keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Total tagihan sebelum diskon: " +totalHarga);
        System.out.println("Total tagihan anda: " +nominalBayar);
    }
}