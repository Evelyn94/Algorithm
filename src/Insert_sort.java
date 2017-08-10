import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by linhonggu on 11/8/17.
 *
 ******************************************************Insert_sort*****************************************************
 * Intuition: Poker sort
 * Divide the whole list into three part:The sorted part R1, the sorting part R2=key and the to be sorted part R3
 *
 * Best case:O(n)
 * Worse case:O(n^2)
 * Average case: O(n^2)
 *
 */


public class Insert_sort {

    public static void main(String[] args) {
        //input the number of element in the to be sorted list and then enter the element of the list in order
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int in[] = new int[num];
        for(int i=0;i<num;i++){
            in[i]=scanner.nextInt();
        }
        System.out.println("Input array is:"+ Arrays.toString(in));
        System.out.print("Output array is:"+Arrays.toString(sort(in)));
    }

    public static int[] sort(int[] in){
        for(int i=1;i<in.length;i++){
            int key = in[i];
            int j = i-1;
            while (j>=0 && in[j]>key){
                in[j+1]=in[j];
                j--;
            }
            in[j+1]=key;
        }
        return in;
    }
}
