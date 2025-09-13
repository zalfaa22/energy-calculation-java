import java.util.Scanner;

public class HitungEnergi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double massa, kecepatan, ketinggian, energiPotensial, energiKinetik, energiMekanik;

        System.out.print("Masukkan massa : ");
        massa = input.nextDouble();
        System.out.print("Masukkan kecepatan : ");
        kecepatan = input.nextDouble();
        System.out.print("Masukkan ketinggian : ");
        ketinggian = input.nextDouble();

        energiPotensial = massa * 10 * ketinggian;
        energiKinetik = (int) (0.5 * massa * kecepatan * kecepatan);
        energiMekanik = energiPotensial + energiKinetik;

        System.out.printf("%nMassa = %s, Kecepatan = %s, dan Ketinggian = %s%n",
                formatHasil(massa),
                formatHasil(kecepatan),
                formatHasil(ketinggian));
        System.out.printf("%-17s = %s%n", "Energi potensial", formatHasil(energiPotensial));
        System.out.printf("%-17s = %s%n", "Energi kinetik", formatHasil(energiKinetik));
        System.out.printf("%-17s = %s%n", "Energi mekanik", formatHasil(energiMekanik));

    }

    private static String formatHasil(double angka) {
        if (angka % 1 == 0) {
            return String.valueOf((int) angka);
        } else {
            return String.format("%.2f", angka);
        }
    }
}
