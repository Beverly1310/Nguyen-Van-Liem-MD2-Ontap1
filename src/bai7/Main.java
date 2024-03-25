package bai7;
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
        int addIndex=0;
        int addValue=0;
        int[] newArr = new int[size+1];
        boolean flag = true;
        while (flag) {
            System.out.println("Nhap vi tri can chen: ");
             addIndex = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap gia tri can chen: ");
             addValue = Integer.parseInt(scanner.nextLine());
            if (addIndex>0 || addIndex<size){
        for (int i = 0; i < addIndex; i++) {
            newArr[i]=arr[i];
        }
        for (int i = addIndex+1; i <newArr.length; i++) {
            newArr[i]=arr[i-1];
            flag=false;
        }
        }else {

            System.out.println("Khong hop le");
        }
        }
        newArr[addIndex]=addValue;
        System.out.println(Arrays.toString(newArr));
    }
}
