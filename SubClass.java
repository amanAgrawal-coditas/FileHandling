package Week_5.Assignment;

import java.io.*;

class ByteArray
 {

    void byteArray()
    {
        byte words[] = "I love coding".getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(words);
        byteArrayInputStream.read();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (byte b : words)
        {
            byteArrayOutputStream.write(b);
            System.out.print((char) b);
        }

    }
 }

class Input
 {
    void Input() throws IOException
    {

        File file = new File("Docs.txt");
        System.out.println(file.getAbsolutePath());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeDouble(76.98);
        dataOutputStream.writeInt(456);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeChar('K');

        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        double d = dataInputStream.readDouble();
        int i = dataInputStream.readInt();
        boolean bool = dataInputStream.readBoolean();
        char ch = dataInputStream.readChar();
        System.out.println(d);
        System.out.println(i);
        System.out.println(bool);
        System.out.println(ch);
    }

 }

public class SubClass
 {
    public static void main(String[] args) throws IOException
    {

        ByteArray b = new ByteArray();
        b.byteArray();

        Input input = new Input();
        input.Input();

    }


 }

 //Output
// I love codingC:\Users\coditas\IdeaProjects\hello in\Docs.txt
//        76.98
//        456
//        true
//        K