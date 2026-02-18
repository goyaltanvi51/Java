import java.util.Scanner;
public class Marks{
        public static void main(String[] args){
             Scanner S= new Scanner(System.in);
             String a=S.nextLine();
             int b=S.nextInt();
             if(b>40){
             System.out.println(a +"is Pass");
             }
             else{
             System.out.println(a +"is Fail");
             }
        }
}

