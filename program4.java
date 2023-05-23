import java.util.*;
class program3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no of rows : ");
        int rows=sobj.nextInt();

        System.out.println("Enter the no of columns : ");
        int columns=sobj.nextInt();

        Matrix mobj = new Matrix(rows,columns);
        mobj.Accept();
        mobj.Display();
    }    
}
class Matrix
{
    public int Arr[][];

    public Matrix(int rows,int column)
    {
        Arr=new int[rows][column];
    }

    // protected void finalize()
    // {
    //     Arr=null;
    // }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Entrer the elements : ");
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }
    }

    public void Display()
    {
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
    public void Targetedpublic()
    {
        int iMax=0,row=0,col=0,iSum=0;

        for(int i=1;i<Arr.length-1;i++)
        {
            for(int j=1;j<Arr[i].length;j++)
            {
                if(Arr[i][j]==Arr[i-1][j-1]+Arr[i-1][j]+Arr[i-1][j+1]+Arr[i][j-1]+Arr[i][j+1]+Arr[i+1][j-1]+Arr[i+1][j]+Arr[i+1][j+1]);

                if(iSum > iMax)
                {
                    iMax=iSum;
                    row=i;
                    col=j;
                }
                iSum=0;
            }
        }
        System.out.println("");
    }
}