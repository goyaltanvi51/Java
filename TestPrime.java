public class TestPrime{
    public static void main(String[] args){
    }
    public static boolean isPrime(int n){
        if (n < 2) return false;
        if (n < 4) return true;
        if (n%2 == 0) return false;
        for (int d = 3; d*d <= n ; d += 2)
        {
            System.out.println(n+"%"+d);
            if(n%d == 0) return false;
        }
        return true;
    }
}
