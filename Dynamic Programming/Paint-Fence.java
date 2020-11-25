import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int ii = k, ij = k*(k-1);
        int total = ii + ij;
        for(int i=3;i<=n;i++)
        {
            int nii = ij;
            int nij = total*(k-1);
            ii = nii;
            ij = nij;
            total = ii + ij;
        }
        System.out.println(total);
    }
}
