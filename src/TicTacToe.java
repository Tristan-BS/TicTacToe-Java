public class TicTacToe {
    private char[] SpielBrett;
    private int Spieler;

    public TicTacToe() {
        this.SpielBrett = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        this.Spieler = 1;
    }

    public void Print() {
        System.out.print("\n");
        System.out.println("|  " + SpielBrett[1] + "  |  " + SpielBrett[2] + "  |  " + SpielBrett[3] + "  |");
        System.out.println("| " + "---" + " | " + "---" + " | " + "---" + " |");
        System.out.println("|  " + SpielBrett[4] + "  |  " + SpielBrett[5] + "  |  " + SpielBrett[6] + "  |");
        System.out.println("| " + "---" + " | " + "---" + " | " + "---" + " |");
        System.out.println("|  " + SpielBrett[7] + "  |  " + SpielBrett[8] + "  |  " + SpielBrett[9] + "  |");
    }

    public int getSpieler() {
        return Spieler;
    }

    public void SpielerTauschen() {
        Spieler = (Spieler % 2) + 1;
    }

    public void Austauschen(int eingabe) {
        char Symbol;
        if (Spieler == 1) {
            Symbol = 'X';
        } else {
            Symbol = 'O';
        }
        SpielBrett[eingabe] = Symbol;
    }

    public boolean EingabeRichtig(int eingabe) {
        if (eingabe < 1 || eingabe > 9) {
            System.out.println("\nUngültige Position! Bitte wähle eine Zahl zwischen 1 und 9.");
            return true;
        }

        // Bereits belegt?
        if (SpielBrett[eingabe] == 'X' || SpielBrett[eingabe] == 'O') {
            System.out.println("\nDiese Position ist bereits belegt oder ungültig. Bitte wähle eine andere.");
            return true;
        } else {
            return false; // Die Position ist frei
        }
    }

    public int Gewinner() {
        if (SpielBrett[1] == SpielBrett[2] && SpielBrett[2] == SpielBrett[3]) return 1;
        else if (SpielBrett[4] == SpielBrett[5] && SpielBrett[5] == SpielBrett[6]) return 1;
        else if (SpielBrett[7] == SpielBrett[8] && SpielBrett[8] == SpielBrett[9]) return 1;
        else if (SpielBrett[1] == SpielBrett[4] && SpielBrett[4] == SpielBrett[7]) return 1;
        else if (SpielBrett[2] == SpielBrett[5] && SpielBrett[5] == SpielBrett[8]) return 1;
        else if (SpielBrett[3] == SpielBrett[6] && SpielBrett[6] == SpielBrett[9]) return 1;
        else if (SpielBrett[1] == SpielBrett[5] && SpielBrett[5] == SpielBrett[9]) return 1;
        else if (SpielBrett[3] == SpielBrett[5] && SpielBrett[5] == SpielBrett[7]) return 1;
        else if (SpielBrett[1] != '1' && SpielBrett[2] != '2' && SpielBrett[3] != '3'
                && SpielBrett[4] != '4' && SpielBrett[5] != '5' && SpielBrett[6] != '6'
                && SpielBrett[7] != '7' && SpielBrett[8] != '8' && SpielBrett[9] != '9') return 0;
        else return -1;
    }
}

