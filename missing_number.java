// WAP to find the missing number in an array.
// Program is written by Nirbhay Kaushik

class missing_number
{
  public static void main(String[] args)
  {
    // int[] arr=new int[]{1,2,4,3,6,5,8,10,11,7,12,9};
    // missing number is 9.
    int[] arr=new int[]{1,2,4,3,6,5,8,10,11,7,12};
    int sum=0,total=0;
    // n*(n+1)/2
    total=((arr.length+1)*(arr.length+1+1))/2;
    
    for(int i=0;i<arr.length;i++)
    {
      sum+=arr[i];
    }
    System.out.println(total-sum);
  }
}
