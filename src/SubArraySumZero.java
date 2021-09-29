import java.util.HashSet;

public class SubArraySumZero {
    public static boolean sumZero(int arr[],int n)
    {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i <n; i++) {
            sum = sum + arr[i];
            if(sum == 0 || arr[i] == 0 || set.contains(sum))
            {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,-3,1,6};
        int n = arr.length;
        System.out.println(sumZero(arr,n));
    }

}
