package Test3;

public class Book {
    //создаю переменные
    private String title;
    private String author;

    //конструктор
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    //геттеры
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    //сеттеры
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    //Вывод методом?
    public void printinfo(){
        System.out.println("Автор: " + author + "\nКнига: " + title);
    }

}
