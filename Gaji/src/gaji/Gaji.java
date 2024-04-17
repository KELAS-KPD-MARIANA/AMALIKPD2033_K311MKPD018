package gaji;
import java.util.Scanner;

public class Gaji {

    public static void main(String[] args) {
        double baki;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.next();

        int gajiSeharian = 160;

        int hari;
        System.out.print("Masukkan bilangan hari bekerja: ");
        do {
            hari = input.nextInt();

            if (hari > 31) {
                System.out.print("Masukkan semula bilangan hari kerja: ");
            }
        } while (hari > 31); 

        baki = hari * gajiSeharian;

        System.out.println("Rumusan gaji bulanan bagi " + nama);
        System.out.println("Jumlah hari bekerja " + hari);
        System.out.println("GAJI SEBULAN ADALAH " + baki);
    }
}
