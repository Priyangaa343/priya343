import java.util.*;
class abc
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char c = s.next(".").charAt(0);
        if(Character.isLetter(c))
        {
            System.out.print("true");
        }
        else
            {
            System.out.print("false");
            }
    }
}
