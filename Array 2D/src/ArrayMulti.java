// Program Java Pengunaan Array Dua Dimensi

public class ArrayMulti {
    public static void main(String[] args) throws Exception {
        String[][] mhs = { { "123", "Budi Susanto", "Jakarta" }, { "124", "Geni Bandayani", "Surabaya" } };
        // get value of elements
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(mhs[1][j]);
            }
            System.out.println();
        }
    }
}
