import java.util.Scanner;

public class PemilihanBilangan18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        if (angka % 2 ==  0);
        {
            System.out.println("Angka " + angka + "termasuk bilangan genap");
        }
         
        {
            System.out.println("Angka" + angka + "termasuk bilangan ganjil");
        }
        
 }
}