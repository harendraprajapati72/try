public class Prime 
{
    public static void main(String[] args) 
    {
       int i,num=4;
       int temp=0;
       for(i=2;i<=num-1;i++)
       {
           if(num%i==0)
           {
            temp=temp+1;
           }

       }
       if(temp==0)
       {
           System.out.println(num+" is prime");
       }
       else{
        System.out.println(num+" is not prime");
       }
    }
    
    
}
