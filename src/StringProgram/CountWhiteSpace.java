package StringProgram;

public class CountWhiteSpace
{
    public static void main(String[] args) {
        String str = "kr  uti ka";
        int count = 0;
        for (int i=0;i<=str.length()-1;i++)
        {
            char s1 = str.charAt(i);
            if (s1==' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
