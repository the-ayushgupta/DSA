import java.util.Arrays;
public class Accessing_Elements_In_Array
{
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 5;
		System.out.println(Arrays.toString(arr));
		System.out.println("Accessing elements....");
		System.out.println("Fifth element is "+arr[4]);
		System.out.println("First element is "+arr[0]);
	}
}
