// PRINTING PART IS STILL REMAINING ......


import java.util.Arrays;
class SingleDimensionArray
{
    int arr[] = null;
    
    public SingleDimensionArray(int sizeOfArray)
    {
        arr = new int[sizeOfArray];
        for(int i = 0;i < arr.length;i++)
        {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    
    public void insert(int location, int valueToBeInserted)
    {
        try 
        {
            if(arr[location] == Integer.MIN_VALUE)
            {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            }
            else
            {
                System.out.println("This cell is already occupied");
            }
        } catch(ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Invalid Index to access array");
        }
    }
}
class Insertion In Array
{
    public static void main(String[] args)
    {
        SingleDimensionArray arr = new SingleDimensionArray(10);
        arr.insert(0,0);
        arr.insert(1,5);
        arr.insert(2,7);
        arr.insert(1,3);
        arr.insert(12,50);
        //System.out.println(Arrays.toString(arr));
    }
}
