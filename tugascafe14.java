import java.util.Scanner;
public class tugascafe14 {
    static int[][] penjualan = new int[7][5];
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    public static void inputPenjualan() {
        Scanner scanner = new Scanner(System.in);
        for (int hari = 0; hari < 7; hari++) {
            System.out.println("Masukkan data penjualan untuk hari ke-" + (hari + 1) + ":");
            for (int i = 0; i < menu.length; i++) {
                System.out.print(menu[i] + ": ");
                penjualan[hari][i] = scanner.nextInt();
            }
        }
    }
    public static void tampilkanPenjualan() {
        System.out.println("\nData Penjualan Selama 7 Hari:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Hari", "Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan");
        for (int hari = 0; hari < 7; hari++) {
            System.out.printf("Hari ke-%d: ", (hari + 1));
            for (int i = 0; i < menu.length; i++) {
                System.out.printf("%-10d", penjualan[hari][i]);
            }
            System.out.println();
        }
    }
    public static void menuTertinggi() {
        int[] totalPenjualan = new int[5];
        for (int hari = 0; hari < 7; hari++) {
            for (int i = 0; i < menu.length; i++) {
                totalPenjualan[i] += penjualan[hari][i];
            }
        }
        int indexTertinggi = 0;
        for (int i = 1; i < totalPenjualan.length; i++) {
            if (totalPenjualan[i] > totalPenjualan[indexTertinggi]) {
                indexTertinggi = i;
            }
        }
        System.out.println("Menu dengan penjualan tertinggi: " + menu[indexTertinggi] + " dengan total penjualan " + totalPenjualan[indexTertinggi]);
    }
    public static void rataRataPenjualan() {
        System.out.println("\nRata-rata Penjualan untuk Setiap Menu:");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int hari = 0; hari < 7; hari++) {
                total += penjualan[hari][i];
            }
            double rataRata = total / 7.0;
            System.out.printf("%s: %.2f\n", menu[i], rataRata);
        }
    }
    public static void main(String[] args) {
        inputPenjualan();
        tampilkanPenjualan();
        menuTertinggi();
        rataRataPenjualan();
    }
}