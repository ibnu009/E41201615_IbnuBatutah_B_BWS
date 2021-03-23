public class TugasC {

    public void outputTugasCArray2Dimensi() {

        System.out.println("This is Task C :");
        System.out.println();

        int[][] angka = {
                {5, 6, 1, 7},
                {8, 1, 2, 9},
                {5, 4, 7, 1},
                {8, 3, 7, 5}
        };

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(angka[i][j] + " ");
            }
            System.out.println();
        }
    }

}
