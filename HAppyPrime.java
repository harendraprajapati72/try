import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;

class Test1{
    Scanner sc=new Scanner(System.in);
    
    void prime(){
        System.out.println("please enter number that you want to check");
        int num= sc.nextInt();
        int temp=0;
        for(int i=2;i<=num-1;i++)
        {
            if(num%i==0)
            {
                temp=temp+1;
            }
        }
        if (temp==0) 
        {
            System.out.println(num+"is prime");
            
        } else {
            System.out.println(num+"is not prime");   
        }

    }
}
public class HappyPrime{
public static void main(String[] args) {
    Test1 x=new Test1();
    x.prime();
    
}
    
}
