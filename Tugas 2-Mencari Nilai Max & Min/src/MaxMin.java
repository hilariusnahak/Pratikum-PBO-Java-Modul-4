// Program Java untuk mencari nilai maksimum dan minimum dari sejumlah bilangan bulat (N) yang dimasukkan pengguna

import javax.swing.JOptionPane;

public class MaxMin {
    public static void main(String[] args) throws Exception {
        int[] nilai = new int[5];
        int max, min;
        int i;

        // Membuat perulangan dari inputan user, dimana peulangan
        // akan menampilkan output untuk menginputkan angka sebanyak 10 kali
        for (i = 0; i < 5; i++)
        {
        String bilangan = JOptionPane.showInputDialog("Masukkan Nilai: ");
        nilai[i] = Integer.parseInt(bilangan);
        System.out.println("Input Angka: " + bilangan);
        }

        // Inisialisasi variabel min dan max dengan membuat kedua variable
        // tersebut memiliki nilai array dari angka
        min = nilai[0];
        max = nilai[0];
        // Menghitung nilai max dan nilai min
        for (i = 0; i < 5; i++)
        {
        if (nilai[i] > max) {
            max = nilai[i];
        } else if (nilai[i] < min) {
            min = nilai[i];
        }
        }
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("Nilai Max = " + max);
        System.out.println("Nilai Min = "+ min);
    }
}
