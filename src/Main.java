public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри Поттер", 0, 0, 0, 0, 0),
                new Gryffindor("Гермиона Грейнджер", 0, 0, 0, 0, 0),
                new Gryffindor("Рон Уизли", 0, 0, 0, 0, 0)
        };

        Hufflupuff[] hufflupuff = {
                new Hufflupuff("Захария Смит", 0, 0, 0, 0, 0),
                new Hufflupuff("Седрик Диггори", 0, 0, 0, 0, 0),
                new Hufflupuff("Джастин Финч-Флетчли", 0, 0, 0, 0, 0)
        };


        Ravenclow[] ravenclow = {
                new Ravenclow("Чжоу Чанг", 0, 0, 0, 0, 0, 0),
                new Ravenclow("Падма Патил", 0, 0, 0, 0, 0, 0),
                new Ravenclow("Маркус Белби", 0, 0, 0, 0, 0, 0)
        };

        Slytherin[] slytherin ={
                new Slytherin("Драко Малфой",0,0,0,0,0,0,0),
                new Slytherin("Грэхэм Монтегю",0,0,0,0,0,0,0),
                new Slytherin("Грегори Гойл",0,0,0,0,0,0,0),
        };





        ShowStudents showStudents = new ShowStudents();
        showStudents.gryffindorStudents(gryffindor);
        showStudents.hufflupuffStudents(hufflupuff);
        showStudents.ravenclowStudents(ravenclow);
        showStudents.slytherinStudents(slytherin);

    }
}

