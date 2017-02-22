/**
 * Created by raj on 22/02/2017.
 */

import java.util.regex.*;
import java.io.*;
public class datevalidation
{
    public static void main(String args[])throws IOException
    {
        int c;
        String s1="";
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the date in the format DAY/MONTH/YEAR");
        String s=in.readLine();
        c=datevalid(s);
        if(c==1)
            System.out.println("Date is legal ");
        else
            System.out.println("Date is illeagal");



    }

    public static int datevalid(String s1)
    {
        String patt="^(0[1-9]|[1-2][0-9]||3[0-1])/(0[1-9]|1[0-2])/(19|20)\\d\\d$";
        Pattern pat=Pattern.compile(patt);
        Matcher date=pat.matcher(s1);
        if(date.find()==true)
            return 1;
        else
            return 0;

    }



}

