import java.util.Scanner;
public class HitungTotalHarga01 {
    public static int hitungTotalHarga13(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.println("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga13(pilihanMenu, banyakItem);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}