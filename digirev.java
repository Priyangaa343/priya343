import java.util.*;
class digirev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char ch[]=a.toCharArray();
        for(int i=a.length()-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
    }
}
