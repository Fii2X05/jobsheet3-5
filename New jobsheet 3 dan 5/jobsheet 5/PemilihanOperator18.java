import java.util.Scanner;

public class PemilihanOperator18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = sc.next().charAt(0);

        // Struktur if-else untuk operasi matematika
        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Kesalahan: Pembagian dengan nol!");
                sc.close();
                return; // Menghentikan program jika pembagian dengan nol
            }
        } else {
            System.out.println("Operator yang Anda masukkan tidak sesuai.");
            sc.close();
            return; // Menghentikan program jika operator tidak valid
        }

        // Menampilkan hasil
        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
        sc.close(); // Menutup scanner
    }
}
