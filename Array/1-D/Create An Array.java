import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int[] intArray;                                                 //O(1)
		intArray = new int[3];                                          //O(1)
		intArray[0] = 1;                                                //O(1)---------|
		intArray[1] = 2;                                                //O(1)---------|--O(N)
		intArray[2] = 3;                                                //O(1)---------|
		System.out.println(Arrays.toString(intArray));                  
		
    
    // ALL TOGETHER (5,6,7,8,9 IN 1 STEP)
    
    
		String[] sArray = {"a","b","c"};                                //O(1)
		System.out.println(Arrays.toString(sArray));
	}
}
