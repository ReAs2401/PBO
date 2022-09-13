import java.util.Random;
import java.util.Scanner;

public class Tugas3PBOM2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"j", "t", "k"};
            String komputer = rps[new Random().nextInt(rps.length)];

            String pilihankita;

            while (true) {
                System.out.println("Silahkan masukkan pilihan (j/t/k)");
                pilihankita = scanner.nextLine();
                if (pilihankita.equals("j") || pilihankita.equals("t") || pilihankita.equals("k")) {
                    break;
                }
                System.out.println(pilihankita + " Maaf pilihan yang anda masukan salah.");
            }

            System.out.println("Komputer memilih: " + komputer);

            if (pilihankita.equals(komputer)) {
                System.out.println("seri");
            } else if (pilihankita.equals("j")) {
                if (komputer.equals("k")) {
                    System.out.println("NT broo :(");

                } else if (komputer.equals("t")) {
                    System.out.println("Wellplayed broo.. :)");
                }
            } else if (pilihankita.equals("t")) {
                if (komputer.equals("k")) {
                    System.out.println("Wellplayed broo.. :)");

                } else if (komputer.equals("j")) {
                    System.out.println("NT broo :(");
                }
            } else if (pilihankita.equals("k")) {
                if (komputer.equals("j")) {
                    System.out.println("Wellplayed broo.. :)");

                } else if (komputer.equals("t")) {
                    System.out.println("NT broo :(");
                }
            }

            System.out.println("Masih Mau Main?? (y/g)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {
                break;
            }
        }
        scanner.close();
    }
}
