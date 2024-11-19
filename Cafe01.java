import java.util.Scanner;
public class Cafe01 {
    static int[][] salesData = {
        {20, 20, 25, 20, 10, 60, 10}, //kopi
        {30, 80, 40, 10, 15, 20, 25}, //Teh
        {5, 9, 8, 20, 25, 10, 45},    // ES Degan
        {50, 8, 17, 18, 10, 30, 6},   //Roti Bakar
        {15, 10, 16, 15, 10, 10, 55}  //Gorengan 
    };
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPilih menu:");
            System.out.println("1. Input data penjualan");
            System.out.println("2. Tampilkan seluruh data penjualan");
            System.out.println("3. Tampilkan menu dengan penjualan tertinggi");
            System.out.println("4. Tampilkan rata-rata penjualan untuk setiap menu");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputPenjualan(scanner);
                    break;
                case 2:
                    tampilkanDataPenjualan();
                    break;
                case 3:
                    tampilkanMenuTertinggi();
                    break;
                case 4:
                    tampilkanRataRataPenjualan(); 
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 5); 
        scanner.close();
    }
    public static void inputPenjualan(Scanner scanner) {
        System.out.println("\nMasukkan data penjualan untuk setiap menu (7 hari):");
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Masukkan penjualan untuk " + menu[i] + ": ");
            for (int j = 0; j < salesData[i].length; j++) {
                salesData[i][j] = scanner.nextInt();
            }
        }
    }
    public static void tampilkanDataPenjualan() {
        System.out.println("\nData Penjualan per Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < salesData[i].length; j++) {
                System.out.print(salesData[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void tampilkanMenuTertinggi() {
        int maxSales = 0;
        String bestMenu = "";
        for (int i = 0; i < menu.length; i++) {
            int totalSales = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                totalSales += salesData[i][j];
            }
            if (totalSales > maxSales) {
                maxSales = totalSales;
                bestMenu = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi adalah " + bestMenu + " dengan total penjualan " + maxSales);
    }

    public static void tampilkanRataRataPenjualan() {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < menu.length; i++) {
            int totalSales = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                totalSales += salesData[i][j];
            }
            double avgSales = totalSales / (double) salesData[i].length;
            System.out.println(menu[i] + ": " + avgSales);
        }
    }
}