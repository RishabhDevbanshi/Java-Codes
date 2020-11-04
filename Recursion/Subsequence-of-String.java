import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> arr = new ArrayList<>();
        arr = gss(str);
        System.out.println(arr);
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length() == 0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> gbr = gss(ros);
        
        ArrayList<String> mySubSeq = new ArrayList<>();
        for(String s : gbr)
        {
            mySubSeq.add("" + s);
            mySubSeq.add(ch + s);
        }
        return mySubSeq;
    }

}
