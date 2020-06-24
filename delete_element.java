/* WAP to delete an element in an array.
    This program is written by Nirbhay Kaushik.
    http://www.youtube.com/techfully  */

import java.util.Scanner;
public class delete_element
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many elements, do you want : ");
        // Variable declaration
        int flag=0,loc=0,len=sc.nextInt();
        int[] arr=new int[len];

        // Getting input from the user
        System.out.print("Enter the elements : \n");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }

        // Getting delete element from the user
        System.out.print("Which element, do you want to delete : ");
        int del_ele=sc.nextInt();

        // get the location of the element
        for(int i=0;i<len;i++)
        {
            if(arr[i]==del_ele)
            {
                flag=1;
                loc=i;
            }
        }

        // logic for left shift of the elements
        if(flag==1)
        {
            for(int i=loc+1;i<len;i++)
            {
                arr[i-1]=arr[i];
            }
            System.out.print("After Deleting :\n");
            for(int i=0;i<len-2;i++)
            {
                System.out.print(arr[i]+",");
            }
            arr[len-1]=0;
            System.out.print(arr[len-2]);
        }
        else
        {
            System.out.print("Delete operation is not possible !");
        }
    }
}