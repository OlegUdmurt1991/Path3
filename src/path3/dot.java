package path3;
// Подсчет пробелов
public class dot {
    public static void main(String[]args)
        throws java.io.IOException {

        char choice;
        int h=0;

        System.out.println("Введите текст");
        do{

            choice = (char) System.in.read();


            if (choice==' ')  h++;

        } while (choice!='.');


                System.out.println("Успех епти");


        System.out.print("Количество пробелов " + h);
    }
}
