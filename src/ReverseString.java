import java.util.Scanner;

public class ReverseString {
    public static String reverse(String str)
    {
        String temp = "";
        char[] charArray = str.toCharArray();
        for (int i = charArray.length-1; i >=0 ; i--) {
            temp = temp + charArray[i];
        }
        return temp;

    }
    public static void main(String[] args) {
        String str = "Geeks for Geeks";
        String reverseString = reverse(str);
        System.out.println(reverseString);
    }
}
