package INFO5100.Excerise3;

import java.io.*;

public class MainTestDesearlization
{
    public static void main(String[] args) {
        Rectangle rectangle= null;
        try {
            FileInputStream fileInputStream = new FileInputStream("rectangle.ser");
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            rectangle = (Rectangle) in.readObject();
            in.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Deserialize the Rectangle ");
        System.out.println("Length "+ rectangle.getLength());
        System.out.println("Width "+rectangle.getWidth());
        System.out.println("Color "+rectangle.getColor());
    }
}
