import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DateArray {

    public static void main(String[] args) {
        String data[][] = {
                {"1","5/22/2022"},
                {"3","11/22/2022"},
                {"2","4/22/2022"}
        };
        Arrays.sort(data);

        System.out.println("Sorted String Array= " + Arrays.toString(data));
    }
}
