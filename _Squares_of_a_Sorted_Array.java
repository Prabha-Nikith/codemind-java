import java.util.*;
public class square
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            a[i]=a[i]*a[i];
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}