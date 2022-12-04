public class Parallelepiped {
   private int height, length ,width;

    public Parallelepiped(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    public Parallelepiped(){

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void method1(){
        System.out.println(2 * ((height * length) + (length * width) + (height * width)));
    }
    public void method2(){
        System.out.println((length*width*height));
    }
}
