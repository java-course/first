
public class Robot
{

    // Текущая координата X
    double x = 0;
    // Текущая координата Y
    double y = 0;
    // Текущий курс (в градусах)
    double course = 0;

    // Передвижение на дистанцию distance
    void forward(int distance) {
        // Обращение к полю объекта X
        x = x + distance * Math.cos(course / 180 * Math.PI);
        // Обращение к полю объекта Y
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }

    // Печать координат робота
    void printCoordinates() {
        System.out.println(x + "," + y);
    }
}
