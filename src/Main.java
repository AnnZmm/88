import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main
{
    public static void main(String []args)
    {
        List list = new List();
        list.addString("Hello");
        list.addString("Hello");
        list.addString("Hi");
        list.addString("Hello my friend");
        list.addString("Good morning");
        list.addString("Good evening");

        list.removeString("Hi");

        System.out.println(list.list);
        System.out.println(list.reverseStrings());
        System.out.println(list.searchSubstring("morning"));
        System.out.println(list.length());
        System.out.println(list.searchStrings("Hello"));
        list.numberOfSymbols();
        list.addString();
    }
}
