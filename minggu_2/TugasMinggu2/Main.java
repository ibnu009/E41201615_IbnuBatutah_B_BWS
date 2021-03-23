import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {

            System.out.println(StringUtils.rightPad("+", 20, "-") + "+");
            System.out.println(StringUtils.center("Available Menus :", 20));
            System.out.println("A. Simple Array Name");
            System.out.println("B. Random Array");
            System.out.println("C. Array 2 Dimensions");
            System.out.println("D. Kharisma Agung Plaza");
            System.out.println("E. Cafe Ceria");
            System.out.println(StringUtils.rightPad("-", 20, "-"));

            System.out.println("Please enter the task code : ");
            String kode = scan.nextLine().toLowerCase();

            switch (kode) {
                case "a":
                    TugasA tugas1 = new TugasA();
                    tugas1.outputTugasAArraySederhana();
                    break;
                case "b":
                    TugasB tugas2 = new TugasB();
                    tugas2.outputTugasBArrayBebas();
                    break;
                case "c":
                    TugasC tugas3 = new TugasC();
                    tugas3.outputTugasCArray2Dimensi();
                    break;
                case "d":
                    TugasD tugas4 = new TugasD();
                    tugas4.outputTugasDTampilan();
                    break;
                case "e":
                    TugasE tugas5 = new TugasE();
                    tugas5.outputTugasESwitchCase();
                    break;
            }

            System.out.println("Would you like to continue? (yes or no)");
            String s = scan.nextLine().toLowerCase();
            if (s.equals("no") || s.equals("n") ) {
                stop = true;
            } else {
                if (!s.equals("yes") && !s.equals("y")) {
                    System.out.println("Please answer with yes or no");
                }
            }
        }
    }
}




