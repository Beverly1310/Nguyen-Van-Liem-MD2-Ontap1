package bai4;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cho mang: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        System.out.println("Nhap gia tri cho tung phan tu");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu vi tri thu: "+i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        System.out.println("Gia tri lon nhat la: "+arr[arr.length-1]);
        System.out.println("Gia tri nho nhat la: "+arr[0]);
    }
}
