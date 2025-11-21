package StringProgram;

public class SpiteEachWord
{
    public static void main(String[] args)
    {
        String s1 = "my name is sonu";
        String[] ar = s1.split(" ");

        for (int i=0;i<=ar.length-1;i++)
        {
            String org = ar[i];

            String revValue = reverseString(org);
            System.out.println(revValue);
        }
    }

    public static String reverseString(String org)
    {
        String rev = "";

        for (int j=org.length()-1;j>=0;j--)
        {
            rev=rev+org.charAt(j);
        }

        return rev;
    }
}
