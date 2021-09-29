import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
    public static void merge(int arr1[],int arr2[],int n,int m)
    {
        int i =0, j=0, k=n-1;

        while(i<=k && j<m)
        {
            if(arr1[i]>arr2[j])
            {
                int temp = arr1[k];
                arr1[k] = arr2[j];
                arr2[j] = temp;
                k--;
                j++;
            }
            else
            {
                i++;
                continue;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        int m = 5;
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};

        merge(arr1, arr2, n, m);
        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k]+" ");
        }
        System.out.println();
        for (int p = 0; p < arr2.length; p++) {
            System.out.print(arr2[p]+" ");
        }
    }
}
