public class Hogwarts {
    private String name;
    private int powerMagic;
    private int transgressionDistance;


    public Hogwarts(String name, int powerMagic, int transgressionDistance) {
        this.name = name;
        // Сила магии героя
        this.powerMagic = (int) Math.round(1 + Math.random() * 100);
        // Расстояние трансгресии (перемещение героя)
        this.transgressionDistance = (int) Math.round(1 + Math.random() * 100);

    }

    public String getName() {
        return name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

}

