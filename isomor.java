import java.util.*;
class isomor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        char c=' ',d=' ',e=' ',f=' ';
        for(int i=0;i<a.length();i++)
        {
            for(int j=i+1;j<a.length();j++)
            if(ch1[i]==ch1[j])
            {
                c=ch1[i];
                d=ch1[j];
            }
        }
        for(int i=0;i<b.length();i++)
        {
            for(int j=i+1;j<b.length();j++)
            if(ch2[i]==ch2[j])
            {
                e=ch2[i];
                f=ch2[j];
            }
        }
        int w=a.indexOf(c);
        int x=a.indexOf(d);
        int y=b.indexOf(e);
        int z=b.indexOf(f);
        if((w==y)&&(x==z))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        
    }
}
