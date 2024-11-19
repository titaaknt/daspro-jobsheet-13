import java.util.Scanner;

public class ModifPer3no3_01 {
    public static int hitungTotalHarga(int hargaTotal, String kodePromo) {
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7;
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan.");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hargaItems = {15000, 20000, 22000, 10000, 18000};
        String[] namaMenu = {"Nasi Goreng", "Mie Ayam", "Seblak", "Sate", "Soto"};
        int[] jumlahPesanan = new int[hargaItems.length];
        System.out.println("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();
        boolean selesai = false;
        while (!selesai) {
            System.out.println("\nDaftar Menu:");
            for (int i = 0; i < namaMenu.length; i++) {
                System.out.println((i + 1) + ". " + namaMenu[i] + " - Rp" + hargaItems[i]);
            }
            System.out.println("Masukkan nomor menu yang ingin Anda pesan (1-5): ");
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu < 1 || pilihanMenu > 5) {
                System.out.println("Menu tidak valid. Silakan masukkan nomor menu antara 1-5.");
                continue;
            }
            System.out.println("Masukkan jumlah item untuk menu ini: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
            jumlahPesanan[pilihanMenu - 1] += banyakItem;
            System.out.println("Apakah Anda ingin memesan menu lain? (y/n): ");
            String lanjut = sc.nextLine();
            if (lanjut.equalsIgnoreCase("n")) {
                selesai = true;
            }
        }
        int totalHargaKeseluruhan = 0;
        System.out.println("\nDetail Pesanan:");
        for (int i = 0; i < jumlahPesanan.length; i++) {
            if (jumlahPesanan[i] > 0) {
                int totalHargaMenu = jumlahPesanan[i] * hargaItems[i];
                System.out.println(namaMenu[i] + " - " + jumlahPesanan[i] + " porsi - Rp" + totalHargaMenu);
                totalHargaKeseluruhan += totalHargaMenu;
            }
        }
        totalHargaKeseluruhan = hitungTotalHarga(totalHargaKeseluruhan, kodePromo);
        System.out.println("Total Harga Keseluruhan: Rp" + totalHargaKeseluruhan);

        sc.close();
    }
}