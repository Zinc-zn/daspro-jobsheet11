import java.util.Scanner;

public class hitungTotalHarga {
    private static final int[] HARGA_MENU = {15000, 20000, 22000, 12000, 10000, 18000};

    public static void tampilkanMenu() {
        System.out.println("1. Rp 15.000");
        System.out.println("2. Rp 20.000");
        System.out.println("3. Rp 22.000");
        System.out.println("4. Rp 12.000");
        System.out.println("5. Rp 10.000");
        System.out.println("6. Rp 18.000");
    }

    public static int hitungTotalHarga(int[] pesanan, String kodePromo) {
        int totalHarga = 0;

        for (int i = 0; i < pesanan.length; i++) {
            if (pesanan[i] > 0) {
                totalHarga += HARGA_MENU[i] * pesanan[i];
            }
        }

        switch (kodePromo) {
            case "DISKON50":
                System.out.println("Diskon 50%");
                totalHarga /= 2;
                break;
            case "DISKON30":
                System.out.println("Diskon 30%");
                totalHarga = (totalHarga * 7) / 10;
                break;
            default:
                System.out.println("Diskon Invalid.");
        }

        return totalHarga;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] pesanan = new int[6];

        tampilkanMenu();

        while (true) {
            System.out.print("\nPilih nomor menu (1-6, 0 untuk keluar): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) break;

            if (pilihan < 1 || pilihan > 6) {
                System.out.println("Pilihan menu tidak valid!");
                continue;
            }

            System.out.print("Masukkan jumlah: ");
            int jumlah = scanner.nextInt();

            pesanan[pilihan - 1] += jumlah;
        }

        System.out.print("Masukkan kode promo: ");
        String kodePromo = scanner.next();

        int totalHarga = hitungTotalHarga(pesanan, kodePromo);

        System.out.println("\nDetail");
        for (int i = 0; i < pesanan.length; i++) {
            if (pesanan[i] > 0) {
                System.out.printf("%d x Menu %d = Rp %d%n", 
                    pesanan[i], i + 1, pesanan[i] * HARGA_MENU[i]);
            }
        }
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}