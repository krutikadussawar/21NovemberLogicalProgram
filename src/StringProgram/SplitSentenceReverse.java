package StringProgram;

public class SplitSentenceReverse
{
    public static void main(String[] args)
    {
        String s1 = "my name is krutika";
        String[] ar = s1.split(" ");

        for (int i=ar.length-1;i>=0;i--)
        {
            System.out.println(ar[i]);
        }
    }
}
