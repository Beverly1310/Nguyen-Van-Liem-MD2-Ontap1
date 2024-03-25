package bai8;
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
        System.out.println(Arrays.toString(arr));
        boolean flag = true;
        int updateIndex;
        int updateValue;
        while (flag) {
        System.out.println("Nhap vi tri can thay doi:");
        updateIndex = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gia tri can thay doi:");
        updateValue = Integer.parseInt(scanner.nextLine());

            if (updateIndex > 0 || updateIndex < size) {
                for (int i = 0; i < arr.length; i++) {
                    if (i == updateIndex) {
                        arr[i] = updateValue;
                        flag=false;
                    }
                }
            } else {
                System.out.println("Khong hop le");
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
