import java.util.Scanner;

public class NextPermitution {
    public static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[],int i,int j)
    {
        while(i<j)
        {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void nextPerm(int arr[])
    {
        int n = arr.length;
        int i = n-2;
        int j = 0;

        while(i>=0 && arr[i]>=arr[i+1])
        {
            i--;
        }

        if(i>=0)
        {
            j = n-1;
            while(arr[i]>=arr[j])
            {
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i+1, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        nextPerm(arr);
        // next permition

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
