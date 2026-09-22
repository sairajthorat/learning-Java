import java.util.Scanner;

class Matrixaddition
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int row = input.nextInt();
        
        System.out.println("Enter No of coulms");
        int col = input.nextInt();

        int m1[][]=new int[row][col];
        int m2[][]=new int[row][col];
        int sum[][]=new int[row][col];
        int multi[][]=new int[row][col];

        System.out.println("Enter Elements of Matrix 1");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                m1[i][j]=input.nextInt();
            }
        }

        System.out.println("Enter Elements of Matrix 2");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                m2[i][j]=input.nextInt();
            }
        }

        sum=addition(row,col,m1,m2);
        multi=multiplicaton(row,col,m1,m2);

        System.out.println("Addition =");
        for(int i=0;i<row;i++)
        {
            System.out.println();
            for(int j=0;j<col;j++)
            {
                System.out.print(sum[i][j]+"  ");
            }
        }
        System.out.println("Multiplication =");
        for(int i=0;i<row;i++)
        {
            System.out.println();
            for(int j=0;j<col;j++)
            {
                System.out.print(multi[i][j]+"  ");
            }
        }

    }

    public static int[][] addition(int r,int c,int mat1[][],int mat2[][])
    {
        int row=r;
        int col=c;
        int sum[][]=new int[row][col];

        for(int i =0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        return(sum);
    }

    public static int[][] multiplicaton(int r,int c,int mat1[][],int mat2[][])
    {
        int row =r;
        int col=c;
        int mul[][]=new int[row][col];

        for(int i =0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                for(int k=0;k<col;k++)
                {
                    mul[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }

        return(mul);
    }
}