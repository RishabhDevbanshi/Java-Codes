import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int r1 = scn.nextInt();
    int c1 = scn.nextInt();
    int[][] a = new int[r1][c1];
    for(int i=0;i<r1;i++)
    {
        for(int j=0;j<c1;j++)
        {
            a[i][j] = scn.nextInt();
        }
    }
    
    int r2 = scn.nextInt();
    int c2 = scn.nextInt();
    int[][] b = new int[r2][c2];
    for(int i=0;i<r2;i++)
    {
        for(int j=0;j<c2;j++)
        {
            b[i][j] = scn.nextInt();
        }
    }
    
    if(c1 != r2)
    {
        System.out.println("Invalid input");
        return;
    }
    
    int[][] product = new int[r1][c2];
    
    for(int i=0;i<product.length;i++)
    {
        for(int j=0;j<product[0].length;j++)
        {
            for(int k=0;k<c1;k++)
            {
                product[i][j] += a[i][k] * b[k][j];
            }
        }
    }
    
    for(int i=0;i<product.length;i++)
    {
        for(int j=0;j<product[0].length;j++)
        {
            System.out.print(product[i][j] + " ");
        }
        System.out.println();
    }
 }

}
