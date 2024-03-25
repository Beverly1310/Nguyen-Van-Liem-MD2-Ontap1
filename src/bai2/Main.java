package bai2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cho mang: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        System.out.println("Nhap gia tri cho tung phan tu");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu thu: "+i);
            arr[i] = Integer.parseInt(scanner.nextLine());
            sum += arr[i];
        }
        System.out.println("Trung binh cong cac phan tu cua mang la: "+ sum/size);
    }
}
