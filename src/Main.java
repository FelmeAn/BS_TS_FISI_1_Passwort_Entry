import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = null, pw;
        int i =0;

        do {
            if(i>=1) {
                System.out.println("Der eingegebene Benutzername (" + name + ") war falsch!");
            }
            System.out.print("Gebe deinen Benutzernamen ein: ");
            name = input.nextLine();
            i++;
        } while(!name.equalsIgnoreCase("fisi"));

        i=0;
        do{
            i++;
            if(i>1)
                System.out.println("Das eingegebene Passwort war falsch!");
            System.out.print("Gebe dein Passwort ein: ");
            pw = input.nextLine();
        } while(!pw.equals("MPCiu3005"));

        System.out.println("Dein Benutzername und Passwort ist korrekt.");
    }
}