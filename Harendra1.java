class Harendra{
    int a,b,c;
    void sum(){
        c=a+b;
        System.out.println("This is the sum of two numbers"+c);
    }
    void minus(){
        c=a-b;
        System.out.println("this is the minus of two numbers"+c);
    }
}
public class Harendra1{
        public static void main(String[] args) {
        Harendra h=new Harendra();
        h.a=10;
        h.b=20;
        h.sum();
        h.minus();
    }
    
}
