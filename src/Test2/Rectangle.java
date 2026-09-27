package Test2;

public class Rectangle {
    private int width;
    private int height;

    //создали переменные и создаю конструктор
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    //геттеры создаю
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    //сеттер только для ширины
    public void setWidth(int width){
        this.width = width;
    }
    //теперь вывести надо все
    public int calculateArea() {
        return width * height;
    }
}

