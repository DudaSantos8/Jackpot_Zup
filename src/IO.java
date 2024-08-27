import java.util.Scanner;

public class IO {

    public static int menu (){
        String builder = "Vamos ver como está a sua sorte hoje, puxe a alavanca para começar: (Numero + enter para selecionar)" +
                "\nAperte 1 para puxar a alavanca no nivel fácil: " +
                "\nAperte 2 para puxar a alavanca no nivel dificil se tiver coragem: " +
                "\nAperte 3 para puxar a alavanca no nivel extremo se você é louco e compulsivo: ";
        System.out.println(builder);
        return new Scanner(System.in).nextInt();
    }
}
