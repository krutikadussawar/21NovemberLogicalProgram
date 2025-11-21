package Number;

public class ArmtrongNumber {
    public static void main(String[] args)
    {
       int orgNum=127;
       int sum= 0;
       for (int i=orgNum;i>0;i++)
       {
           int rem=i%10;
           sum=sum+(rem*rem*rem);
       }
       if (orgNum==sum)
       {
           System.out.println("armtrong");
       }
       else
       {
           System.out.println("not");
       }
    }
}
