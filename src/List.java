import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class List
{
    public ArrayList<String> list= new ArrayList<String>(5);

    public void addString(String str)
    {
        list.add(str);
        if(list.size()>5)
        {
            list.remove(0);
        }
    }

    public void removeString(String str)
    {
        list.remove(str);
    }

    public int searchStrings(String str)
    {
        int i=0;
        for (String s : list) {
            if (s.equals(str)) {
                i++;
            }
        }
        return i;
    }

    public static String reverseString(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }

    public ArrayList<String> reverseStrings()
    {
        ArrayList<String> list1 = new ArrayList<String>();
        for (String s : list) {
           list1.add(reverseString(s));
        }
        return list1;
    }

    public String searchSubstring(String str)
    {
        int i=0;
        for (String s : list)
        {
            if(s.contains(str)){ return "Array contains text - " + str; }
        }
     return "Array not contains text - " + str;
    }

    public ArrayList<Integer> length()
    {
        ArrayList<Integer> i=new ArrayList<Integer>();
        for (String s : list)
        {
           i.add(s.length());
        }
        Collections.sort(i);
        return i;
    }

    public void numberOfSymbols()
    {
        Map<Character, Integer> counter = new HashMap<Character, Integer>();
        for(int c = 'a'; c <= 'z'; c++)
        {
            counter.put((char)c, 0);
        }

        for (String s : list) {
            for (int i = 0; i < s.length(); i++)
            {
                if (counter.containsKey(s.charAt(i)))
                    counter.put(s.charAt(i), counter.get(s.charAt(i)) + 1);
            }
        }
        System.out.println(counter.toString());
    }
    public void addString(){}
    private final static String FILE_NAME = "strings.xml";
    {
        try {
            FileOutputStream fos=new FileOutputStream(new File(FILE_NAME));
            XMLEncoder encoder=new XMLEncoder(fos);
            encoder.writeObject(list);
            encoder.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }}

}
