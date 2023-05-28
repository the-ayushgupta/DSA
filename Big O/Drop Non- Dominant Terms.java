public class Main
{
    public static void printNumbers(int n)
    {
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)                              //O(N^2)
            {
                System.out.println(i+" "+j);
            }
        }
        for(int k = 0;k < n;k++)
        {
            System.out.println(k);                                //O(N)
        }
    }
	public static void main(String[] args) 
	{
	    printNumbers(10);                                           //O(N^2 + N) == O(N^2)
	}                                                               //because for bigger numbers "N^2" is DOMINANT TERM and "N" is NON-DOMINANT TERM
}                                                                 //So we will neglect NON-DOMINANT TERM i.e., N. 
