package StringProgram;

public class CountDigitLetterWhiteSpacs
{
    public static void main(String[] args)
    {
        String str = "krutika12345    #@";

        int Digit = 0;
        int Letter=0;
        int ws=0;
        int SS=0;

        for (int i=0;i<=str.length()-1;i++)
        {
            char s1 = str.charAt(i);

            if (Character.isDigit(s1))
            {
                Digit++;
            } else if (Character.isLetter(s1))
            {
                Letter++;
            } else if (Character.isWhitespace(s1))
            {
                ws++;
            }
            else
            {
                SS++;
            }
        }

        System.out.println(Digit);
        System.out.println(Letter);
        System.out.println(ws);
        System.out.println(SS);
    }
}
