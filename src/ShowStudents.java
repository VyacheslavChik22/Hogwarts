public class ShowStudents {
    static int gryffindorStudentPoints1 = 0;
    static int gryffindorStudentPoints2 = 0;
    static int gryffindorStudentPoints3 = 0;
    static String gryffindorStudentName1 = "";
    static String gryffindorStudentName2 = "";
    static String gryffindorStudentName3 = "";

    static int hufflupuffStudentPoints1 = 0;
    static int hufflupuffStudentPoints2 = 0;
    static int hufflupuffStudentPoints3 = 0;
    static String hufflupuffStudentName1 = "";
    static String hufflupuffStudentName2 = "";
    static String hufflupuffStudentName3 = "";

    static int ravenclowStudentPoints1 = 0;
    static int ravenclowStudentPoints2 = 0;
    static int ravenclowStudentPoints3 = 0;
    static String ravenclowStudentName1 = "";
    static String ravenclowStudentName2 = "";
    static String ravenclowStudentName3 = "";

    static int slytherinStudentPoints1 = 0;
    static int slytherinStudentPoints2 = 0;
    static int slytherinStudentPoints3 = 0;
    static String slytherinStudentName1 = "";
    static String slytherinStudentName2 = "";
    static String slytherinStudentName3 = "";


    public static void gryffindorStudents(Gryffindor[] gryffindor) {
        System.out.println("*** Gryffindor students:");
        for (int i = 0; i < gryffindor.length; i++) {
            int a = 1;
            a += i;
            Gryffindor gryffindorStudent = gryffindor[i];
            if (a == 1) {
                gryffindorStudentPoints1 = gryffindorStudent.getPowerMagic() + gryffindorStudent.getTransgressionDistance() + gryffindorStudent.getNobility() +
                        gryffindorStudent.getHonour() + gryffindorStudent.getBravery();
                gryffindorStudentName1 = gryffindorStudent.getName();
            } else if (a == 2) {
                gryffindorStudentPoints2 = gryffindorStudent.getPowerMagic() + gryffindorStudent.getTransgressionDistance() + gryffindorStudent.getNobility() +
                        gryffindorStudent.getHonour() + gryffindorStudent.getBravery();
                gryffindorStudentName2 = gryffindorStudent.getName();

            } else if (a == 3) {
                gryffindorStudentPoints3 = gryffindorStudent.getPowerMagic() + gryffindorStudent.getTransgressionDistance() + gryffindorStudent.getNobility() +
                        gryffindorStudent.getHonour() + gryffindorStudent.getBravery();
                gryffindorStudentName3 = gryffindorStudent.getName();

            }
            System.out.println("Ученик " + a + ": " + gryffindorStudent.getName() + "; Магическая сила: " + gryffindorStudent.getPowerMagic() +
                    "; Расстояние трансгрессии: " + gryffindorStudent.getTransgressionDistance() + "; Благородство: " + gryffindorStudent.getNobility() +
                    "; Честь: " + gryffindorStudent.getHonour() + "; Храбрость: " + gryffindorStudent.getBravery());
        }
    }

    public void gryffindorStudentsPoints() {
        System.out.println("\nУченик: " + gryffindorStudentName1 + " в сумме получает: " + gryffindorStudentPoints1 + " баллов");
        System.out.println("Ученик: " + gryffindorStudentName2 + " в сумме получает: " + gryffindorStudentPoints2 + " баллов");
        System.out.println("Ученик: " + gryffindorStudentName3 + " в сумме получает: " + gryffindorStudentPoints3 + " баллов");
    }

    public static void hufflupuffStudents(Hufflupuff[] hufflupuff) {
        System.out.println("\n*** Hufflupuff students:");
        for (int i = 0; i < hufflupuff.length; i++) {
            int a = 1;
            a += i;
            Hufflupuff hufflupuffStudent = hufflupuff[i];
            if (a == 1) {
                hufflupuffStudentPoints1 = hufflupuffStudent.getPowerMagic() + hufflupuffStudent.getTransgressionDistance() + hufflupuffStudent.getIndustriousness() +
                        hufflupuffStudent.getLoyalty() + hufflupuffStudent.getHonesty();
                hufflupuffStudentName1 = hufflupuffStudent.getName();
            } else if (a == 2) {
                hufflupuffStudentPoints2 = hufflupuffStudent.getPowerMagic() + hufflupuffStudent.getTransgressionDistance() + hufflupuffStudent.getIndustriousness() +
                        hufflupuffStudent.getLoyalty() + hufflupuffStudent.getHonesty();
                hufflupuffStudentName2 = hufflupuffStudent.getName();

            } else if (a == 3) {
                hufflupuffStudentPoints3 = hufflupuffStudent.getPowerMagic() + hufflupuffStudent.getTransgressionDistance() + hufflupuffStudent.getIndustriousness() +
                        hufflupuffStudent.getLoyalty() + hufflupuffStudent.getHonesty();
                hufflupuffStudentName3 = hufflupuffStudent.getName();

            }

            System.out.println("Ученик " + a + ": " + hufflupuffStudent.getName() + "; Магическая сила: " + hufflupuffStudent.getPowerMagic() +
                    "; Расстояние трансгрессии: " + hufflupuffStudent.getTransgressionDistance() + "; Трудолюбие: " + hufflupuffStudent.getIndustriousness() +
                    "; Верность: " + hufflupuffStudent.getLoyalty() + "; Честность: " + hufflupuffStudent.getHonesty());
        }
    }

    public void hufflupuffStudentsPoints() {
        System.out.println("\nУченик: " + hufflupuffStudentName1 + " в сумме получает: " + hufflupuffStudentPoints1 + " баллов");
        System.out.println("Ученик: " + hufflupuffStudentName2 + " в сумме получает: " + hufflupuffStudentPoints2 + " баллов");
        System.out.println("Ученик: " + hufflupuffStudentName3 + " в сумме получает: " + hufflupuffStudentPoints3 + " баллов");
    }

    public void ravenclowStudents(Ravenclow[] ravenclow) {
        System.out.println("\n*** Ravenclow students:");
        for (int i = 0; i < ravenclow.length; i++) {
            int a = 1;
            a += i;
            Ravenclow ravenclowStudent = ravenclow[i];
            if (a == 1) {
                ravenclowStudentPoints1 = ravenclowStudent.getPowerMagic() + ravenclowStudent.getTransgressionDistance() + ravenclowStudent.getMind() +
                        ravenclowStudent.getWisdom() + ravenclowStudent.getWit() + ravenclowStudent.getCreation();
                ravenclowStudentName1 = ravenclowStudent.getName();
            } else if (a == 2) {
                ravenclowStudentPoints2 = ravenclowStudent.getPowerMagic() + ravenclowStudent.getTransgressionDistance() + ravenclowStudent.getMind() +
                        ravenclowStudent.getWisdom() + ravenclowStudent.getWit() + ravenclowStudent.getCreation();
                ravenclowStudentName2 = ravenclowStudent.getName();
            } else if (a == 3) {
                ravenclowStudentPoints3 = ravenclowStudent.getPowerMagic() + ravenclowStudent.getTransgressionDistance() + ravenclowStudent.getMind() +
                        ravenclowStudent.getWisdom() + ravenclowStudent.getWit() + ravenclowStudent.getCreation();
                ravenclowStudentName3 = ravenclowStudent.getName();
            }
            System.out.println("Ученик " + a + ": " + ravenclowStudent.getName() + "; Магическая сила: " + ravenclowStudent.getPowerMagic() +
                    "; Расстояние трансгрессии: " + ravenclowStudent.getTransgressionDistance() + "; Ум: " + ravenclowStudent.getMind() +
                    "; Мудрость: " + ravenclowStudent.getWisdom() + "; Остроумие: " + ravenclowStudent.getWit() + "; Творчество: " + ravenclowStudent.getCreation());
        }
    }

    public void ravenclowStudentsPoints() {
        System.out.println("\nУченик: " + ravenclowStudentName1 + " в сумме получает: " + ravenclowStudentPoints1 + " баллов");
        System.out.println("Ученик: " + ravenclowStudentName2 + " в сумме получает: " + ravenclowStudentPoints2 + " баллов");
        System.out.println("Ученик: " + ravenclowStudentName3 + " в сумме получает: " + ravenclowStudentPoints3 + " баллов");
    }

    public void slytherinStudents(Slytherin[] slytherin) {
        System.out.println("\n*** Slytherin students:");
        for (int i = 0; i < slytherin.length; i++) {
            int a = 1;
            a += i;
            Slytherin slytherinStudent = slytherin[i];
            if (a == 1) {
                slytherinStudentPoints1 = slytherinStudent.getPowerMagic() + slytherinStudent.getTransgressionDistance() + slytherinStudent.getCunning() +
                        slytherinStudent.getDecisiveness() + slytherinStudent.getAmbitiousness() + slytherinStudent.getResourcefulness() + slytherinStudent.getThirstForPower();
                slytherinStudentName1 = slytherinStudent.getName();
            } else if (a == 2) {
                slytherinStudentPoints2 = slytherinStudent.getPowerMagic() + slytherinStudent.getTransgressionDistance() + slytherinStudent.getCunning() +
                        slytherinStudent.getDecisiveness() + slytherinStudent.getAmbitiousness() + slytherinStudent.getResourcefulness() + slytherinStudent.getThirstForPower();
                slytherinStudentName2 = slytherinStudent.getName();
            } else if (a == 3) {
                slytherinStudentPoints3 = slytherinStudent.getPowerMagic() + slytherinStudent.getTransgressionDistance() + slytherinStudent.getCunning() +
                        slytherinStudent.getDecisiveness() + slytherinStudent.getAmbitiousness() + slytherinStudent.getResourcefulness() + slytherinStudent.getThirstForPower();
                slytherinStudentName3 = slytherinStudent.getName();
            }
            System.out.println("Ученик " + a + ": " + slytherinStudent.getName() + "; Магическая сила: " + slytherinStudent.getPowerMagic() +
                    "; Расстояние трансгрессии: " + slytherinStudent.getTransgressionDistance() + "; Хитрость: " + slytherinStudent.getCunning() +
                    "; Решительность: " + slytherinStudent.getDecisiveness() + "; Амбициозность: " + slytherinStudent.getAmbitiousness() + "; Находчивость: " + slytherinStudent.getResourcefulness()
                    + "; Жажда власти: " + slytherinStudent.getThirstForPower());
        }
    }

    public void slytherinStudentsPoints() {
        System.out.println("\nУченик: " + slytherinStudentName1 + " в сумме получает: " + slytherinStudentPoints1 + " баллов");
        System.out.println("Ученик: " + slytherinStudentName2 + " в сумме получает: " + slytherinStudentPoints2 + " баллов");
        System.out.println("Ученик: " + slytherinStudentName3 + " в сумме получает: " + slytherinStudentPoints3 + " баллов");
    }

    public void gryffindorStudentsBest() {
        String gryffindorArrayBestStudents[] = {gryffindorStudentName1, gryffindorStudentName2, gryffindorStudentName3};
        int gryffindorArrayPoints[] = {gryffindorStudentPoints1, gryffindorStudentPoints2, gryffindorStudentPoints3};
        int maxPoints = 0;
        int smallerPoints = 0;
        int nameStudentMaxPoint = 0;
        int nameStudentSmallerPoints = 0;
        for (int i = 0; i < gryffindorArrayPoints.length; i++) {

            if (maxPoints < gryffindorArrayPoints[i]) {
                maxPoints = gryffindorArrayPoints[i];
                nameStudentMaxPoint = i;
            } else {
                smallerPoints = gryffindorArrayPoints[i];
                nameStudentSmallerPoints = i;
            }
        }

        System.out.println("У " + gryffindorArrayBestStudents[nameStudentMaxPoint] + " сумма баллов равна " + maxPoints + ". "
                + gryffindorArrayBestStudents[nameStudentMaxPoint] + " лучший Гриффендорец, чем " + gryffindorArrayBestStudents[nameStudentSmallerPoints]);
    }

    public void hufflupuffStudentsBest() {
        String hufflupuffArrayBestStudents[] = {hufflupuffStudentName1, hufflupuffStudentName2, hufflupuffStudentName3};
        int hufflupuffArrayPoints[] = {hufflupuffStudentPoints1, hufflupuffStudentPoints2, hufflupuffStudentPoints3};
        int maxPoints = 0;
        int smallerPoints = 0;
        int nameStudentMaxPoint = 0;
        int nameStudentSmallerPoints = 0;
        for (int i = 0; i < hufflupuffArrayPoints.length; i++) {

            if (maxPoints < hufflupuffArrayPoints[i]) {
                maxPoints = hufflupuffArrayPoints[i];
                nameStudentMaxPoint = i;
            } else {
                smallerPoints = hufflupuffArrayPoints[i];
                nameStudentSmallerPoints = i;
            }
        }
        System.out.println("У " + hufflupuffArrayBestStudents[nameStudentMaxPoint] + " сумма баллов равна " + maxPoints + ". "
                + hufflupuffArrayBestStudents[nameStudentMaxPoint] + " лучший Пуффендуец, чем " + hufflupuffArrayBestStudents[nameStudentSmallerPoints]);
    }

    public void ravenclowStudentsBest() {
        String ravenclowArrayBestStudents[] = {ravenclowStudentName1, ravenclowStudentName2, ravenclowStudentName3};
        int ravenclowArrayPoints[] = {ravenclowStudentPoints1, ravenclowStudentPoints2, ravenclowStudentPoints3};
        int maxPoints = 0;
        int smallerPoints = 0;
        int nameStudentMaxPoint = 0;
        int nameStudentSmallerPoints = 0;
        for (int i = 0; i < ravenclowArrayPoints.length; i++) {

            if (maxPoints < ravenclowArrayPoints[i]) {
                maxPoints = ravenclowArrayPoints[i];
                nameStudentMaxPoint = i;
            } else {
                smallerPoints = ravenclowArrayPoints[i];
                nameStudentSmallerPoints = i;
            }
        }
        System.out.println("У " + ravenclowArrayBestStudents[nameStudentMaxPoint] + " сумма баллов равна " + maxPoints + ". "
                + ravenclowArrayBestStudents[nameStudentMaxPoint] + " лучший Когтевранец, чем " + ravenclowArrayBestStudents[nameStudentSmallerPoints]);
    }

    public void slytherinStudentsBest() {
        String slytherinArrayBestStudents[] = {slytherinStudentName1, slytherinStudentName2, slytherinStudentName3};
        int slytherinArrayPoints[] = {slytherinStudentPoints1, slytherinStudentPoints2, slytherinStudentPoints3};
        int maxPoints = 0;
        int smallerPoints = 0;
        int nameStudentMaxPoint = 0;
        int nameStudentSmallerPoints = 0;
        for (int i = 0; i < slytherinArrayPoints.length; i++) {

            if (maxPoints < slytherinArrayPoints[i]) {
                maxPoints = slytherinArrayPoints[i];
                nameStudentMaxPoint = i;
            } else {
                smallerPoints = slytherinArrayPoints[i];
                nameStudentSmallerPoints = i;
            }
        }

        System.out.println("У " + slytherinArrayBestStudents[nameStudentMaxPoint] + " сумма баллов равна " + maxPoints + ". "
                + slytherinArrayBestStudents[nameStudentMaxPoint] + " лучший Слизериец, чем " + slytherinArrayBestStudents[nameStudentSmallerPoints]);
    }

    public void battleStudentsHogwarts() {
        System.out.println("\n*** Лучшим учеником Хогвадца является:");
        String bigBattleName[] = {gryffindorStudentName1, ravenclowStudentName1, hufflupuffStudentName1, slytherinStudentName1};
        int bigBattlePoint[] = {gryffindorStudentPoints1, ravenclowStudentPoints1, hufflupuffStudentPoints1, slytherinStudentPoints1};
        String faculty[] = {"Гриффиндор", "Когтевран", "Пуффендуй", "Слизерин"};
        int facultyStudentBest = 0;
        int facultyStudentSmaller = 0;
        int maxPoints = 0;
        int smallerPoints = 0;
        int nameStudentMaxPoint = 0;
        int nameStudentSmallerPoints = 0;
        for (int i = 0; i < bigBattlePoint.length; i++) {
            if (maxPoints < bigBattlePoint[i]) {
                maxPoints = bigBattlePoint[i];
                nameStudentMaxPoint = i;
                facultyStudentBest = i;
            } else {
                smallerPoints = bigBattlePoint[i];
                nameStudentSmallerPoints = i;
                facultyStudentSmaller = i;
            }
        }
        System.out.println("У " + bigBattleName[nameStudentMaxPoint] + " из " + faculty[facultyStudentBest] + " сумма баллов равна " + maxPoints + ". "
                + bigBattleName[nameStudentMaxPoint] + " лучший Хогвардец, чем " + bigBattleName[nameStudentSmallerPoints] + " из " + faculty[facultyStudentSmaller]);
    }
}
