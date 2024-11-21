public class PengunjungCafe14 {
    public static void daftarPengunjung(String... namaPengunjung){
        for (String nama : namaPengunjung){
            System.out.println("- " + nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Aldi", "Budi", "Citra");
    }
}