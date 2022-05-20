public class Hufflupuff extends Hogwarts {
    //Пуффендуй – «Барсук» – ЗЕМЛЯ
    private int industriousness; // Трудолюбие
    private int Loyalty;         // Верность
    private int Honesty;         // Честность

    public Hufflupuff(String name, int powerMagic, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, powerMagic, transgressionDistance);
        this.industriousness = (int) Math.round(1 + Math.random() * 100);
        Loyalty = (int) Math.round(1 + Math.random() * 100);
        Honesty = (int) Math.round(1 + Math.random() * 100);
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return Loyalty;
    }

    public int getHonesty() {
        return Honesty;
    }
}
