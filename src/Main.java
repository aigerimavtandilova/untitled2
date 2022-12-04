import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Parallelepiped parallelepiped=new Parallelepiped();
            parallelepiped.setHeight(scanner.nextInt());
            parallelepiped.setLength(scanner.nextInt());
            parallelepiped.setWidth(scanner.nextInt());
            parallelepiped.method1();
            parallelepiped.method2();
            if (parallelepiped.getHeight()>20 || parallelepiped.getLength()>20 || parallelepiped.getWidth()>20){
                throw new MyException1();
            }if (parallelepiped.getWidth()<0 || parallelepiped.getLength()<0 || parallelepiped.getHeight()<0) {
                throw new MyException2();
            }
            }catch (InputMismatchException e){
            System.out.println("Wrong input!");
        }catch (ArithmeticException e){
            System.out.println("ters san bolboit!");
        } catch (MyException1 e) {
            System.out.println("берилген сандар 20 дан чон bolboshu kerek!");
        } catch (MyException2 e) {
            System.out.println("берилген маалымат терс сан bolboshu kerek!");
        }
    }
}