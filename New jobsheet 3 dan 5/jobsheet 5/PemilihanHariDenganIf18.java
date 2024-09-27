import java.util.Scanner;

public class PemilihanHariDenganIf18 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); {
            int dayNumber;
            System.out.print("Masukkan angka (1-7): ");
            dayNumber = sc.nextInt();
            if (dayNumber >= 1 && dayNumber <= 5) {
                System.out.println("Weekday");
            } else if (dayNumber == 6 || dayNumber == 7) {
                System.out.println("Weekend");
            } else {
                System.out.println("Invalid Number");
            }
            
        }
    }
}
