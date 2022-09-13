import java.util.Scanner;
public class TugasPBOM2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a;
        System.out.println("masukkan nomor 0-10: ");
        a = keyboard.nextInt();

        if (a > 10) {
            System.out.println("nomor yang anda masukkan salah");
            System.out.println("Silahkan masukkan nomor 0-10: ");
            a = keyboard.nextInt();
        }
        else
            System.out.println("Anda memasukkan nomor: " + a);

    }
}