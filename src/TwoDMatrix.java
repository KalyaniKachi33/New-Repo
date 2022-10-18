import java.util.Iterator;
import java.util.LinkedList;

public class TwoDMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0,1,0},
                {0, 1,2,1},
                {2, 0,0,1}
        };
        int count=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(" Matrix = " + matrix[i][j]);
                if(matrix[i][j]==0)
                    count++;
            }
        }
        System.out.println("Count of 0 = "+count);
    }
}
