package bai6;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cho mang: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        int sum = 0;
        System.out.println("Nhap gia tri cho tung phan tu");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu thu: "+i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhap gia tri can tim:");
        int findNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Vi tri cac phan tu trung voi gia tri can tim");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==findNumber){
                System.out.print(i+"\t");
                sum+=arr[i];
            }
        }
        System.out.println("\nTong gia tri cua cac phan tu trung voi gia tri can tim la: "+sum);
    }
}
