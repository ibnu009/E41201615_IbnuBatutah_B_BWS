public class Latihan3 {
    public static void main(String args[]) {
        int[][] angka = {
                {5, 6, 1, 7},
                {8, 1, 2, 9},
                {5, 4, 7, 1},
        };
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 4; kolom++) {
                System.out.println(angka[baris][kolom] + " ");
            }
            System.out.println();
        }
    }
}
