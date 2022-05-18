public class Gryffindor extends Hogwarts {
    //Грифиндор-«Лев»-ОГОНЬ
    private int nobility;  // Благородство
    private int honour;    // Честь
    private int bravery;   // Храбрость


    public Gryffindor( String name, int powerMagic, int transgressionDistance, int nobility, int honour, int bravery) {
        super(name, powerMagic, transgressionDistance);
        this.nobility = (int) Math.round(1 + Math.random() * 100);
        this.honour = (int) Math.round(1 + Math.random() * 100);
        this.bravery = (int) Math.round(1 + Math.random() * 100);
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

}


