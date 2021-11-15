class  Test{
    int a=10,b=20,c;
    void sum(){
        c=a+b;
        System.out.println("the sum of two numbers is"+c);
}
void minus(){
    c=a-b;
    System.out.println("the minus of two numbers is "+c);
}

}
public class Summinus {
    public static void main(String[] args) {
    Test x = new Test();
    x.sum();
    x.minus();
 }
    
}
