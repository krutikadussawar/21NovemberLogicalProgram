package StringProgram;

public class StringPalidrom
{
    public static void main(String[] args) {
        String str="abcd";
        String str1="";

        for (int i=str.length()-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }
        System.out.println(str1);
        if (str.equals(str1))
        {
            System.out.println("given string is palidrom");
        }
        else
        {
            System.out.println("given string is not palidrom");
        }
    }
}
