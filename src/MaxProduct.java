/*
* Algorithm
*
* define max,min and result as first element
*
* Iterate array from index 1
* if any arr[i] == 0 than max=min=1 and skip next process
* tempMax = max*arr[i];
* tempMin = min*arr[i];
* max is maximum between max(current element, temp Max, temp Min)
* min is minimum between min(current element, temp Max, temp Min)
* */
public class MaxProduct {
    public static long maxProduct(int arr[],int n)
    {
        int max = arr[0];
        int min = arr[0];
        int result = arr[0];

        for (int i = 1; i <n ; i++) {
            if(arr[i] == 0)
            {
                max = 1;
                min = 1;
                continue;
            }
            int tempMax = max *arr[i];
            int tempMin = min * arr[i];

            max = Math.max(arr[i], Math.max(tempMax,tempMin));
            min = Math.min(arr[i], Math.min(tempMax,tempMin));
            result = Math.max(max,result);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {6, -3, -10, 0, 2};
        int n = arr.length;
        System.out.println(maxProduct(arr,n));
    }
}
