import java.util.Scanner;

public class tataSusunan1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] Markah = new double[5];
        double Purata = 0;
        double ppr;

        System.out.print("Peperiksaan / ujian kali ke (1/2/3): ");
        ppr = input.nextDouble();

        System.out.println("Sila masukkan 5 markah:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Markah " + (i + 1) + ": ");
            Markah[i] = input.nextDouble();
            Purata += Markah[i];
        }

        Purata /= 5;

        System.out.println("\nMarkah yang dimasukkan ialah:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + Markah[i]);
        }

        double hasilTambah = 0;
        for (int i = 0; i < 5; i++) {
            hasilTambah += Markah[i];
        }
        System.out.println("\nHasil tambah 5 Markah: " + hasilTambah);

        System.out.println("Purata: " + Purata);

        int markahpurata = 0;
        for (int i = 0; i < 5; i++) {
            if (Markah[i] > Purata) {
                markahpurata++;
            }
        }
        System.out.println("Bilangan Markah melebihi Purata: " + markahpurata);
    }
}
