
public class Calc {

    public static void main(String[] args) {
        int d=add(2, 3);
        System.out.println(d);
         Calc A = new Calc();
         Calc B=new Calc();
         B.mul(2,3);
         A.sub(2,3);
         div(2,0);
    }

    public static Integer add(int a, int b) {
        Integer c=a+b;
        return c;
    }

    public void sub(int a, int b) {
        System.out.println(b - a);
    }
    public void mul(int a,int b){
        System.out.println(a*b);
    }
     public static void div(int a,int b){
        if(b!=0){
        System.out.println(a/b);
        }
        else{
            System.out.println("error");
        }
    }
    
}
