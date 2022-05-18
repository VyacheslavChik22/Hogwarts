public class Slytherin extends Hogwarts {
    //Слизерин-«Змея» – ВОДА
    private int Cunning;                    // Хитрость
    private int Decisiveness;              // Решительность
    private int Ambitiousness;             // Амбициозность
    private int Resourcefulness;           // Находчивость
    private int ThirstForPower;            // Жажда власти

    public Slytherin(String name, int powerMagic, int transgressionDistance, int cunning, int decisiveness, int ambitiousness, int resourcefulness, int thirstForPower) {
        super(name, powerMagic, transgressionDistance);
        Cunning = (int) Math.round(1 + Math.random() * 100);
        Decisiveness = (int) Math.round(1 + Math.random() * 100);
        Ambitiousness = (int) Math.round(1 + Math.random() * 100);
        Resourcefulness = (int) Math.round(1 + Math.random() * 100);
        ThirstForPower = (int) Math.round(1 + Math.random() * 100);
    }

    public int getCunning() {
        return Cunning;
    }

    public int getDecisiveness() {
        return Decisiveness;
    }

    public int getAmbitiousness() {
        return Ambitiousness;
    }

    public int getResourcefulness() {
        return Resourcefulness;
    }

    public int getThirstForPower() {
        return ThirstForPower;
    }
}
