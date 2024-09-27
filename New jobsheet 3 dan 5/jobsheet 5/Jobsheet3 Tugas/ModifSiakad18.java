import java.util.Scanner;

public class ModifSiakad18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        char nilaiHuruf;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan Absen: ");
        absen = sc.nextByte();
        
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = 'A';
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = 'B'; // B+ diganti B karena di Java char tidak bisa menyimpan '+'
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = 'B';
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = 'C'; // C+ diganti C karena alasan yang sama
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = 'C';
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = 'D';
        } else {
            nilaiHuruf = 'E';
        }

        System.out.println("Nama: " +nama + " NIM:" + nim);
        System.out.println("Kelas: " +kelas + " Absen:" + absen);
        System.out.println("Nilai Akhir" + nilaiAkhir);
        System.out.println("Nilai huruf akhir: " +nilaiHuruf);

    }
}