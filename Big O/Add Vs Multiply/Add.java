public class Main
{
    public static void printNumbers(int a,int b)
    {
        for(int i = 0;i < a;i++)
        {                                                 //O(a)
            System.out.println(i);
        }
        for(int j = 0;j < b;j++)
        {                                                 //O(b)
            System.out.println(j);
        }
    }
	public static void main(String[] args) 
	{
		printNumbers(5,4);                                    //O(a+b)
	}                                                       //There will be "NO DROPING OF CONSTANTS" because a and b are two different variables.
}
                                                          //O(a) + O(b) = O(a+b)
