public class RobotManager
{

    public static void main(String[] args) {
        // Создаем объекта класса Robot
        Robot robot = new Robot();
        
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();
        
        // Курс 90 градусов - не самый правильный способ
        // но давайте пока останровимся на нем
        robot.course = 90;
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

        // Курс 45 градусов
        robot.course = 45;
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();
    }
}
