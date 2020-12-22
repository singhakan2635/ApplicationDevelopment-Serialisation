package INFO5100.Excerise3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainTestSerialization
{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(5);
        rectangle.setColor("Black");

        FileOutputStream fileOutputStream;

        {
            try {
                fileOutputStream = new FileOutputStream("rectangle.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
                out.writeObject(rectangle);
                out.close();
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
