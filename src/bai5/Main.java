package bai5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Nhap gia tri cho phan tu [%d][%d] ",i,j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0) {
                    System.out.printf("%-5s",arr[i][j]);
                    sum += arr[i][j];
                }
                else {
                    System.out.printf("%-5s","");
                }
            }
            System.out.println("");
        }
        System.out.println("Tong cua cac so chan la: "+sum);
    }
}
