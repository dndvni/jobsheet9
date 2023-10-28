import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args){
        Scanner input02 = new Scanner(System.in);

        System.out.println("Masukkan jumlah Mahasiswa :");
        int jmlMhs = input02.nextInt();

        int[] nialiMhs = new int[jmlMhs];
        int totalLulus = 0;
        double totalNilaiLulus = 0;
        double totalNilaiTidakLulus = 0;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nialiMhs[i] = input02.nextInt();

            if (nialiMhs[i] > 70) {
                totalLulus++;
                totalNilaiLulus += nialiMhs[i];
            } else {
                totalNilaiTidakLulus += nialiMhs[i];
            }
        }

        double rataLulus = totalNilaiLulus / totalLulus;
        double rataTidakLulus = totalLulus == 0 ? 0 : totalNilaiTidakLulus / (jmlMhs - totalLulus);

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}