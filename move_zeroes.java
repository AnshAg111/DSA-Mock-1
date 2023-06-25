import java.util.*;
public class move_zeroes {
    public void moveZeros(int[] nums) {
        int i=0, j=0, n=nums.length;
        while(i<n && j<n){
            while(i<n && nums[i]!=0) i++;
            while(j<n && nums[j]==0) j++;
            if(i>=n || j>=n) break;
            if(j>i){
                nums[i]=nums[j];
                nums[j]=0;
            }
            else{
                j++;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        new move_zeroes().moveZeros(arr);
        for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
        sc.close();
    }
}
