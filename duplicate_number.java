/* WAP to find the duplicate elements in an array.
    elements must be repeat once.
    This program is written by Nirbhay Kaushik.
    http://www.youtube.com/techfully  */

import java.util.Scanner;
class duplicate_number
{
    public static void main(String[] args) {
        //Array Declaration
        int[] arr=new int[8];

        // Scanner input object creation
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter total "+arr.length+" elements-->");
        System.out.print("Enter Element : ");

        // getting elements from the user
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        // find duplicate element -- Logic
        for(int i=0;i<arr.length;i++)
        {
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i]==arr[j])
               {
                   System.out.println("Duplicate : "+arr[i]);
                   break;
               }
           }
        }
    }
}