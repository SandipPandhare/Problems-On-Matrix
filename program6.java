import java.util.*;
class program6 
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sobj.nextLine();

        String ch[]=str.split(" ");

        System.out.println("No of words is : "+ch.length);
    }
}
