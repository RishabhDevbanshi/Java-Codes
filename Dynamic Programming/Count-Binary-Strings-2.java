import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int oz = 1;
    int oo = 1;
    int nz=0,no=0;
    for(int i=2;i<=n;i++)
    {
        nz = oo;
        no = oo+oz;
        oo = no;
        oz = nz;
    }
    System.out.println(no+nz);
 }

}
