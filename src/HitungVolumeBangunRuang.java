
import java.util.Scanner;

public class HitungVolumeBangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("Pilih bangun ruang yang ingin dihitung volume:");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.println("5. Bola");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungVolumeKubus(input);
                    break;
                case 2:
                    hitungVolumeBalok(input);
                    break;
                case 3:
                    hitungVolumeTabung(input);
                    break;
                case 4:
                    hitungVolumeKerucut(input);
                    break;
                case 5:
                    hitungVolumeBola(input);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        input.close();
    }


    /**
     *
     * @param input
     */
    public static void hitungVolumeKubus(Scanner input) {
        // ..
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();
        double volume = sisi * sisi * sisi;
        System.out.println("Volume kubus adalah: " + volume);
    }


    public static void hitungVolumeBalok(Scanner input) {
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok adalah: " + volume);
    }


    public static void hitungVolumeTabung(Scanner input) {
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = input.nextDouble();
        double volume = Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume tabung adalah: " + volume);
    }



    public static void hitungVolumeKerucut(Scanner input) {
        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        double tinggi = input.nextDouble();
        double volume = (1.0 / 3) * Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume kerucut adalah: " + volume);
    }


    public static void hitungVolumeBola(Scanner input) {
        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = input.nextDouble();
        double volume = (4.0 / 3) * Math.PI * jariJari * jariJari * jariJari;
        System.out.println("Volume bola adalah: " + volume);
    }
}


