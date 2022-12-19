import java.util.*;
class Table
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a,b values for tables");
int a=s.nextInt();
int b=s.nextInt();
for(int i=1;i<=a;i++)
{
for(int j=1;j<=b;j++)
{
System.out.println("Table is : "+i+"*"+j+"="+(i*j));
}
}
}
}
