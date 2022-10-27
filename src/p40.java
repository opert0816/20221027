import java.lang.reflect.Array;

import static java.lang.reflect.Array.newInstance;

public class p40 {
    public static void main (String[] args){
        int[] intArray = (int[]Array.newInstance(int.class,3));

        Array.set(intArray,0,123);
        Array.set(intArray,0,456);
        Array.set(intArray,0,789);

        System.out.println("intArray[0]="+Array.get(intArray,0));
        System.out.println("intArray[0]="+Array.get(intArray,1));
        System.out.println("intArray[0]="+Array.get(intArray,2));
    }
}
