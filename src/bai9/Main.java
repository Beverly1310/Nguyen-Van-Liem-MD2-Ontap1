package bai9;
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
            System.out.println("Phan tu thu: " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int deleteIndex;
        int[] newArr = new int[size - 1];
        boolean flag = true;
        while (flag) {
            System.out.println("Nhap vi tri can xoa: ");
            deleteIndex = Integer.parseInt(scanner.nextLine());
            if (deleteIndex > 0 || deleteIndex < size) {
                for (int i = 0; i < deleteIndex; i++) {
                    newArr[i] = arr[i];
                }
                for (int i = deleteIndex; i < newArr.length; i++) {
                    newArr[i] = arr[i + 1];
                    flag = false;
                }
            } else {
                System.out.println("Khong hop le");
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
