import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner einlesen = new Scanner(System.in);

        do {

            TicTacToe TTT = new TicTacToe();

            System.out.print("1 = Spielregeln \n2 = Spielen \n3 = Beenden \nEingabe: ");
            String choose = einlesen.next();

            switch (choose) {
                case "1":
                    System.out.print("\nDas Ziel des Spieles ist es, 3 von 'x' oder von 'O' zu bekommen (egal ob Waagerecht, Senkrecht oder diagonal), verhindere jedoch dass dein Gegner dies erreicht! \n\n");
                    break;
                    case "2":
                        do {
                            TTT.Print();
                            int Spieler = TTT.getSpieler();

                            System.out.println("\nSpieler " + Spieler + " ist an der Reihe. \nEingabe: ");
                            int eingabe = einlesen.nextInt();

                            if (TTT.EingabeRichtig(eingabe)) {
                                continue;
                            }

                            TTT.Austauschen(eingabe);
                            TTT.SpielerTauschen();

                            int result = TTT.Gewinner();
                            if (result == 1) {
                                TTT.Print();
                                System.out.println("\n Spieler " + Spieler + " hat gewonnen, Gratulation! \n");

                                break;
                            } else if (result == 0) {
                                TTT.Print();
                                System.out.print("\n Unentschieden, es gibt keinen Gewinner!\n");
                                break;
                            }

                        } while (true);
                        break;
                case "3":
                    System.out.println("\n\nProgramm wird beendet. Auf Wiedersehen! \n\n\n\n");
                    return;
            }

        } while (true);
    }
}
