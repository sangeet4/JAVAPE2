public class Factorial {
    public long calcFactorial(int num){
        if(num == 0)
            return 1;

        if(num>20)
            return -1;

        long  i;
        long fact=1;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;

    }
}
