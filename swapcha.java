import java.util.*;
class swapcha
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        char a=' ',b=' ',c=' ',d=' ';
        if(s.length()%2==0)
        {
        for(int i=0;i<s.length();i=i+2)
        {
            a=ch[i+1];
            b=ch[i];
        
        System.out.print(a);
        System.out.print(b);
        }
        }
        else
        {
            for(int i=0;i<s.length()-1;i=i+2)
            {
                c=ch[i+1];
            d=ch[i];
            
        System.out.print(c);
        System.out.print(d);
            }
        System.out.print(ch[s.length()-1]);
            
        }
    }
}

