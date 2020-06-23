/* WAP to insert an element at any index
    position in an array.
    This program is written by Nirbhay Kaushik.
    http://www.youtube.com/techfully  */

    import java.util.Scanner;
public class insert_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("How many elements, do you want : ");
        int n=sc.nextInt();

        // Array declaration with one more size
        int[] arr=new int[n+1];

        // getting input from the user
        System.out.print("Enter the elements :");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }

        // getting position & element
        System.out.print("Enter the position : ");
        int position=sc.nextInt();
        System.out.print("Enter the new element : ");
        int element=sc.nextInt();
        sc.close();

        // shift the element to the right & LOGIC
        for(int i=(n-1);i>=position-1;i--)
        {
          arr[i+1]=arr[i];
        }

        // Assign the element
        arr[position-1]=element;
    
        // Final output
        System.out.print("Final Output : ");
        for(int i=0;i<arr.length;i++)
        {
          System.out.print(" "+arr[i]);
        }
      }
}