package Week_5.Assignment;
import java.io.*;
import java.util.Scanner;

class CharArray{

    void charArray() throws IOException {
        File file=new File("C:\\Users\\coditas\\IdeaProjects\\hello in\\ijk.txt");
        Scanner sc =new Scanner(new FileReader(file));
        String st=" ";

        while(sc.hasNext())
        {
            st=st+sc.next()+" ";
        }

        char[] words=st.toCharArray();
        CharArrayReader charArrayReader=new CharArrayReader(words);
        for(char ch:words)
        {
            char ch1=(char)charArrayReader.read();
            System.out.print(ch1);
        }

    }
}


class Strings
{
    void stringReader() throws IOException {
        System.out.println();
        String message="Welcome all";
        StringReader stringReader=new StringReader(message);
        int i=0;
        while((i=stringReader.read())!=-1){
            System.out.print((char)i);
        }

        String text="how are you?";
        StringWriter stringWriter=new StringWriter();
        stringWriter.write(text);

        System.out.println(" "+stringWriter);
    }

}

public class SubClassChar
 {
    public static void main(String[] args)throws IOException
    {
        CharArray obj=new CharArray();
        obj.charArray();
        Strings st=new Strings();
        st.stringReader();
    }
 }


//OUTPUT
//Hello I am aman
//Welcome all how are you?