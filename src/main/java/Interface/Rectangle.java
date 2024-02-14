package Interface;
/*
Write a Java program to create an interface Resizable with methods resizeWidth(int width)
and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that
 implements the Resizable interface and implements the resize methods.
 */
public class Rectangle implements Resizable {
    public static void main(String[] args) {
        Rectangle myRectangle= new Rectangle();
        myRectangle.resizeWidth(15);
        myRectangle.resizeHeight(88);
        System.out.println(variabila);
    }

    @Override
    public void resizeWidth(int width) {
        System.out.println("The width is resized to: "+ width);
    }

    @Override
    public void resizeHeight(int hight) {
        System.out.println("The hight is resized to: "+ hight);
    }
}
