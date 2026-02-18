import java.util.Scanner;
public class CalUsingFn{
     public static void Add(int a,int b){
           System.out.println(a+b);
}
     public static void Sub(int a,int b){
           System.out.println(b-a);
}
     public static void Mul(int a,int b){
           System.out.println(a*b);
}
     public static void Divide(int a,int b){
           System.out.println(a/b);
}
public static void main(String[] args){
      Scanner S=new Scanner(System.in);
      int a=S.nextInt();
      int b=S.nextInt();
      Add(a,b);
      Sub(a,b);
      Mul(a,b);
      Divide(a,b);
}
}