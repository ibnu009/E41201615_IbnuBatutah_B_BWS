import java.util.Scanner;

public class TugasB {

    public void outputTugasBArrayBebas(){

        System.out.println("This is task B :");
        System.out.println();

        System.out.println("Masukkan berapa banyak random number yang ingin anda munculkan :");
        Scanner sc = new Scanner(System.in);
        int jumlah = sc.nextInt();

        int[] ar1 = new int[jumlah];

        for(int i = 0; i <  ar1.length; i++) {
            ar1[i] = (int)(Math.random()  * 100);
            System.out.print(ar1[i] + "  ");
        }
        System.out.println();
    }
}
