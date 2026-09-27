package Test3;

public class Main {
    public static void main(String[] args){
        //создание объекта и вывод, написанный в классе
        Book info = new Book("Onegin", "Pushkin A.S.");
        //изменение сеттером
        info.printinfo();
        info.setAuthor("Gogol");
        info.printinfo();

    }
}
