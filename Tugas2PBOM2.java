import java.util.Scanner;
public class Tugas2PBOM2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String teks = "'Kalau dilakukan dengan sepenuh hati maaka besi batangan pun " +
                "kalau digosok terus menerus akan menjadi jarum'";
        String kata;
        System.out.println("Kalimat: " + teks);

        while (true){
            System.out.println("Masukkan kata yang anda cari: ");
            kata = keyboard.nextLine();
            if (teks.contains(kata)) {
                System.out.println("Kata '"+kata+"' yang anda cari ada dalam teks.");
                break;
            }else {
                System.out.println("Kata '"+kata+"' tidak ada dalam teks.Silahkan masukkan ulang.");
            }
        }

    }
}
