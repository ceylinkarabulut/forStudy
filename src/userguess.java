import java.util.Scanner;
import java.util.Random;
public class PCTutarKullaniciBilir{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int sayi = rand.nextInt(100) + 1;
        int tahmin;
        int deneme = 0;
        System.out.println("Bilgisayar 1 ile 100 arasında bir sayı tuttu. Tahmin etmeye çalış!");
        do{
            System.out.print("Tahminin: ");
            tahmin = scanner.nextInt();
            deneme++;
            if (tahmin < sayi){
                System.out.println("Daha büyük bir sayı dene.");
            }
            else if (tahmin > sayi){
                System.out.println("Daha küçük bir sayı dene.");
            }
        }
        while (tahmin != sayi);
        System.out.println("Tebrikler! " + deneme + " denemede bildin.");
    }
}
