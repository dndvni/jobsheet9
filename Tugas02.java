import java.util.Scanner;

public class Tugas02{
    public static void main(String[] args){
        Scanner input02 = new Scanner(System.in);

        // Input ukuran array dari user
        System.out.print("Masukkan banyaknya elemen dalam array: ");
        int n = input02.nextInt();

        int[] arr = new int[n];
        // Input nilai tiap elemen dari user 
        for (int i = 0; i < n; i++){
            System.out.printf("Masukkan nilai elemen ke-%d:",i+1);
            arr[i] = input02.nextInt();
        }

        // Cari nilai tertinggi, terendah, dan rata-rata
        int tertinggi = arr[0];
        int terendah = arr[0];
        int total = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] > tertinggi){
            }
            if (arr[i] < terendah){
                terendah = arr[i];
            }
            total += arr[i];
        }
        double rata2 = (double) total/n;

        // Output hasil
        System.out.println("Nilai tertinggi adalah "+ tertinggi);
        System.out.println("Nilai terendah adalah "+ terendah);
        System.out.println("Nilai rata-rata adalah "+ rata2);
    }
}