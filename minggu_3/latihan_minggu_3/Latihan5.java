import java.util.Scanner;

public class Latihan5 {
    public static void main(String args[]) {
        String lampu;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan warna lampu : ");
        lampu = sc.nextLine().toLowerCase();

        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, Berhenti!");
                break;
            case "kuning":
                System.out.println("lampu kuning, harap hati-hati");
                break;
            case "hijau":
                System.out.println("Lampu hijau, Jalan!");
                break;
            default:
                System.out.println("Input salah");
        }
    }
}
