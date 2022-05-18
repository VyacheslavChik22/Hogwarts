public class ShowStudents {
    public void gryffindorStudents(Gryffindor[] gryffindor) {
        System.out.println("Gryffindor students:");
        for (int i = 0; i < gryffindor.length; i++) {
            int a = 1;
            a += i;
            Gryffindor gryffindorStudent = gryffindor[i];
            System.out.println("Ученик " + a + ": " + gryffindorStudent.getName() + "; Магическая сила: " + gryffindorStudent.getPowerMagic() +
                    "; Расстояние трансгрессии: " + gryffindorStudent.getTransgressionDistance() + "; Благородство: " + gryffindorStudent.getNobility() +
                    "; Честь: " + gryffindorStudent.getHonour() + "; Храбрость: " + gryffindorStudent.getBravery());
        }
    }

    public void hufflupuffStudents(Hufflupuff[] hufflupuff) {
        System.out.println("\nHufflupuff students:");
        for (int i = 0; i < hufflupuff.length; i++) {
            int a = 1;
            a += i;
            Hufflupuff hufflupuffStudent = hufflupuff[i];
            System.out.println("Ученик " + a + ": " + hufflupuffStudent.getName() + "; Магическая сила: " + hufflupuffStudent.getPowerMagic() +
                    "; Расстояние трансгрессии: " + hufflupuffStudent.getTransgressionDistance() + "; Трудолюбие: " + hufflupuffStudent.getIndustriousness() +
                    "; Верность: " + hufflupuffStudent.getLoyalty() + "; Честность: " + hufflupuffStudent.getHonesty());
        }
    }

    public void ravenclowStudents(Ravenclow[] ravenclow) {
        System.out.println("\nRavenclow students:");
        for (int i = 0; i < ravenclow.length; i++) {
            int a = 1;
            a += i;
            Ravenclow ravenclowStudent = ravenclow[i];
            System.out.println("Ученик " + a + ": " + ravenclowStudent.getName() + "; Магическая сила: " + ravenclowStudent.getPowerMagic() +
                    "; Расстояние трансгрессии: " + ravenclowStudent.getTransgressionDistance() + "; Ум: " + ravenclowStudent.getMind() +
                    "; Мудрость: " + ravenclowStudent.getWisdom() + "; Остроумие: " + ravenclowStudent.getWit() + "; Творчество: " + ravenclowStudent.getCreation());
        }
    }

    public void slytherinStudents(Slytherin[] slytherin) {
        System.out.println("\nSlytherin students:");
        for (int i = 0; i < slytherin.length; i++) {
            int a = 1;
            a += i;
            Slytherin slytherinStudent = slytherin[i];
            System.out.println("Ученик " + a + ": " + slytherinStudent.getName() + "; Магическая сила: " + slytherinStudent.getPowerMagic() +
                    "; Расстояние трансгрессии: " + slytherinStudent.getTransgressionDistance() + "; Хитрость: " + slytherinStudent.getCunning() +
                    "; Решительность: " + slytherinStudent.getDecisiveness() + "; Амбициозность: " + slytherinStudent.getAmbitiousness() + "; Находчивость: " + slytherinStudent.getResourcefulness()
                    + "; Жажда власти: " + slytherinStudent.getThirstForPower());
        }
    }
}
