import java.util.Scanner;

public class Percobaan614 {
    static int hitungLuas (int pjg, int lb){
        int Luas = pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinngi, int a, int b){
        int volume = hitungLuas(a, b)*tinngi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;
        System.out.println("Masukkan panjang");
        p=input.nextInt();
        System.out.println("Masukkan lebar");
        l=input.nextInt();
        System.out.println("Masukkan tinggi");
        t=input.nextInt();
        L=hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah "+L);
        vol=hitungVolume(t, p, l);
        System.out.println("Volume balok adalah "+vol);
    }
}
