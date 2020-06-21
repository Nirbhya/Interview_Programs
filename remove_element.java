/* WAP to remove an element fron an array
   at any index */

// Program is written by Nirbhay Kaushik

/* For C/Java Hindi Tutorials, you can visit 
http://youtube.com/techfully */

import java.util.Scanner;
public class remove_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Initial Array
        int arr[]={1,2,3,4,5,6};
        System.out.print("Enter the index : ");
        //Getting index value from the user
        int index=sc.nextInt();
        sc.close(); 
        // conditions
        if(index>arr.length||index<0)
        {
            System.out.println("Not Possible !");
        }
        else
        {
            for(int i=index;i<arr.length-1;i++)
            {
                // element swap
                arr[i]=arr[i+1];
            }
        }
        // Final Output
        for(int j=0;j<arr.length-1;j++)
            {
                System.out.println(arr[j]);
            }
    }
}