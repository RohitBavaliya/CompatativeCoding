import java.util.Scanner;

/*
* Rearrange array in alternate position
* Maintain Order in array  (Do not apply sort algorithm just rearrange position of element)
*
* Algorithm
* i = Search Negative (-ve)  even position
* j = Search Positive (+ve)  odd position
* k = traverse array
*
* if((+ve) element in even position) than
*   put i=k and j=k
*   traverse i find -ve element
*   -ve found than rotate array from k+1
*   assign in Arr[j] = -ve
*
* if((-ve) element in odd position) than
*   put i=k and j=k
*   traverse j find +ve element
*   +ve found than rotate array form k+1
*   assign in arr[i] = +ve
*
* Using Rotation order of element is maintained
*
* */
public class ReArrangeAlternatePosition {
    public static void rotate(int arr[],int start,int end)
    {
        int temp = arr[end];

        for (int i = end-1;i>=start;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[start] = temp;
    }
    public static int[] rearrangeArray(int arr[],int n)
    {
        int i=0, j=0, k=0;

        while (i<n && j<n && k<n)
        {
            // for even position
            // even position store -ve element
            if(k%2 == 0)
            {
                // if +ve is found in even position
                if(arr[k]>=0)
                {
                    i=k; // search for negative element
                    j=k;
                    while(i<n && (arr[i]>=0))
                        i++;
                    if(i>=n)
                        break;
                    else
                        rotate(arr,j,i);
                }
            }
            // for odd position
            // odd position store +ve element
            else
            {
                // if -ve is found odd position
                if(arr[k]<0)
                {
                    i=k;
                    j=k; // search for positive element
                    while(j<n && arr[j]<0)
                        j++;
                    if(j>=n)
                        break;
                    else
                        rotate(arr,i,j);
                }
            }
            k++;
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res[] = rearrangeArray(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i]+" ");
        }

    }


}
