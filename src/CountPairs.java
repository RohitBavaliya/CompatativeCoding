import java.util.HashMap;
import java.util.Scanner;

public class CountPairs {
    public static int count(int arr[],int n,int sum)
    {
        int counter  = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        // Iterate array
        for (int i = 0; i < n; i++) {
            // check element are lesser than sum
            if(arr[i]<sum)
            {
                int key = sum - arr[i];
                if(map.containsKey(key))
                {
                    counter += map.get(key);
                }

                // if element is not present in map than add default value 0
                if(map.get(arr[i]) == null)
                {
                    map.put(arr[i], 0);
                }
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(count(arr, n, sum));
    }
}
