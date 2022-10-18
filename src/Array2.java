import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        String str[] = new String[5], S1, S2, search = "Mom";
        str[0] = "kal";
        str[1] = "pri";
        str[2] = "mok";
        S1 = "Mom";
        S2 = "Dad";
        str[3] = S1;
        str[4] = S2;
        for (int i = 0; i < str.length; i++) {
            if (search.equals(str[i])) {
                System.out.println("String found at index= " + i);
                break;
            } else
                continue;
        }
        System.out.println("Full String= " + Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("Sorted String Array= " + Arrays.toString(str));
    }
}
