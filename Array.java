package Com.Shakal;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements : ");
        int n = sc.nextInt();
        int flag = 0;
        int[] arr = new int[n];
        System.out.print("Enter some integer numbers : ");
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("["+i+","+j+"]");
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                break;
            }
        }
    }
}
