import org.apache.commons.lang3.StringUtils;

public class TugasB {

    public void outputTugasBMinggu4(){

        System.out.println("This is task B :");
        System.out.println();

        int angkaAwal = 1, angkaWhile = 1;

        System.out.println(StringUtils.center("\"For\" Loop:", 30));
        System.out.println("Bilangan kelipatan 2 (1 - 100) ");
        System.out.println(StringUtils.rightPad( "=", 30, "="));
        int newResult = 0;
            for (int i = angkaAwal; newResult < 100; i++) {
                newResult = angkaAwal  * 2;
                if (newResult < 100){
                    System.out.print(newResult + " ");
                }
                angkaAwal = newResult;
            }


        System.out.println();
        System.out.println();

        System.out.println(StringUtils.center("\"DO WHILE\" Loop :", 30));
        System.out.println("Bilangan kelipatan 2 (1 - 100) ");
        System.out.println(StringUtils.rightPad( "=", 30, "="));

        do {
            int newResults = angkaWhile * 2;
            if (newResults < 100){
                System.out.print(newResults + " ");
            }
            angkaWhile = newResults;
        } while (angkaWhile < 100);
    }

}
