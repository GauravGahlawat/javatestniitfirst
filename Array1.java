import java.util.Scanner;

public class Array1 {
	public static void main(String args[])
	{
		
		int biggest, smallest, size, i;
	   
		int arr[] = new int[50];
		
        Scanner scan = new Scanner(System.in); 
	   
        System.out.print("Enter Size Of An Array : ");
        size = scan.nextInt();
	   
	    System.out.println();
	   
		System.out.print("Enter Elements In An Array : ");
        for(i=0;i<size;i++)
        {
			arr[i] = scan.nextInt();
        }
		
		biggest = arr[0];
		
		smallest = arr[0];
		
		for(i=0;i<size;i++)
		{
			if(arr[i]>biggest) // for largest element
			{
				biggest=arr[i];
			}
			if(arr[i]<smallest) // for samllest element
			{
				smallest=arr[i];
			}
		}
		System.out.println("Largest element in an array :" + biggest);
		System.out.println("Smallest element in an array :" + smallest);
	}

}
