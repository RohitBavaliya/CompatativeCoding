import java.util.ArrayList;
import java.util.Scanner;

/*
* Find common element between three sorted array
*
* first we compare first two array
* if matched element is found in first two array than check third array
* avoid duplicate element if previous element is same as current element in array
*
* algorithm
*
* define three index i,j and k for three array
* take loop until any one of the array not exceed length
* compare first two array element if they matched than compare with third array
*
* */
public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of A:");
        int n1 = sc.nextInt();
        int A[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Size of B:");
        int n2 = sc.nextInt();
        int B[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }
        System.out.println("Size of C:");
        int n3 = sc.nextInt();
        int C[] = new int[n3];
        for (int i = 0; i < n3; i++) {
            C[i] = sc.nextInt();
        }

        ArrayList<Integer> res =  getCommon(A,B,C,n1,n2,n3);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i)+" ");
        }
    }

    public static ArrayList<Integer> getCommon(int A[],int B[],int C[],int n1,int n2,int n3)
    {
        // ArrayList that store result
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j =0, k = 0;

        // if any one array is exceed length than go out of the loop
        while (i<n1 && j<n2 && k<n3)
        {
            if(A[i]<B[j])
                i++;
            else if(B[j]<A[i])
                j++;
            else {
                //check element is repeated than skip it
                if(i<n1 && (A[i] == A[i-1]))
                {
                    i++;
                    continue;
                }

                // check element present in third array
                while (k<n3 && C[k]<B[j])
                    k++;
                if(k<n3 && (B[j] == C[k]))
                {
                    list.add(C[k]);
                }
                i++;
                j++;
            }
        }

        return  list;
    }

}
