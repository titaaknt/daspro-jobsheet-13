public class Kubus01 {
    public double hitungVolume(double sisi) {
        return Math.pow(sisi, 3); 
    }
    public double hitungLuasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }
    public static void main(String[] args) {
        Kubus01 kubus = new Kubus01();
        double sisi = 5.0;
        double volume = kubus.hitungVolume(sisi);
        System.out.println("Volume kubus dengan sisi " + sisi + " adalah: " + volume);
        double luasPermukaan = kubus.hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus dengan sisi " + sisi + " adalah: " + luasPermukaan);
    }
}