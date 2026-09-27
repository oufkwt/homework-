package Test2;

public class Main {
    public static void main(String[] args){
        //создаю объект
        Rectangle serface = new Rectangle(5, 10);

        //и надо вывести с сеттером
        System.out.println("Было так: " + serface.calculateArea());
        serface.setWidth(8);
        System.out.println("Стало так: " + serface.calculateArea());
        serface.getWidth();
      //  int w = serface.getWidth();
        System.out.println(serface.getWidth());
    }


}
