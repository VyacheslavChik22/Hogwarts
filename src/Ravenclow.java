public class Ravenclow extends Hogwarts {
    //Когтевран – «Ворон» – ВОЗДУХ
    private int Mind;            // Ум
    private int Wisdom;          // Мудрость
    private int Wit;             // Остроумие
    private int Creation;        // Творчество

    public Ravenclow(String name, int powerMagic, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(name, powerMagic, transgressionDistance);
        Mind = (int) Math.round(1 + Math.random() * 100);
        Wisdom = (int) Math.round(1 + Math.random() * 100);
        Wit = (int) Math.round(1 + Math.random() * 100);
        Creation = (int) Math.round(1 + Math.random() * 100);
    }

    public int getMind() {
        return Mind;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public int getWit() {
        return Wit;
    }

    public int getCreation() {
        return Creation;
    }
}
