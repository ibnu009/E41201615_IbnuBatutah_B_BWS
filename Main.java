import java.util.Scanner;

/**
 *
 */
public class Main {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nama Depan :");
        String firstName = sc.nextLine();
        System.out.println("Masukkan Nama Belakang :");
        String lastName = sc.nextLine();
        System.out.println("Masukkan NIM :");
        String studentNim = sc.nextLine();
        System.out.println("Masukkan Status :");
        String studentStatus = sc.nextLine();

        Person p1 = new Person(firstName, lastName, studentNim, studentStatus.toLowerCase());

        if (p1.getStuStatus().equals("active")) {
            System.out.println(p1.getfName() + " " + p1.getlName() + " Adalah mahasiswa Aktif");
        } else if (p1.getStuStatus().equals("inactive") || p1.getStuStatus().equals("not active") || p1.getStuStatus().equals("unactivated")) {
            System.out.println(p1.getfName() + " " + p1.getlName() + " Adalah mahasiswa tidak Aktif");
        } else {
            System.out.println("Status : " + "\""+ p1.getStuStatus() + "\"" + " bukanlah status yang valid");
        }
    }

}
