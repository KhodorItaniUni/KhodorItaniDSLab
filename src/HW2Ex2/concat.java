package HW2Ex2;
import java.util.Arrays; // Here we use the Array Library
public class concat {

    public static void main(String[] args) {
        int[] A1 = {41, 6, 91}; //Array1  //Last exercise Array
        int[] A2 = {24, 54, 78};//Array2

        int a = A1.length;
        int b = A2.length;
               int[] c = new int[a + b]; //NewArray "c" = Array1+Array2

               System.arraycopy(A1, 0, c, 0, a); //We start from Index 0
               System.arraycopy(A2, 0, c, a, b);
               System.out.println(Arrays.toString(c));

    }
    
}
