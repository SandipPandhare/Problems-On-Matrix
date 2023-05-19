import java.util.*;
class program1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no of rows : ");
        int rows=sobj.nextInt();

        System.out.println("Enter the no of columns : ");
        int columns=sobj.nextInt();

        int Arr[][] = new int[rows][columns];

        System.out.println("Entrer the elements : ");
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }
        System.out.println("Entered element is : ");
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
               System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}