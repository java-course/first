public class RobotManager
{

    public static void main(String[] args) {
        // Создаем объекта класса RobotExt - X, Y, course
        RobotExt robot = new RobotExt(0, 0, 0);

        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

        robot.setCourse(90);
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

        // Курс 45 градусов
        robot.setCourse(45);
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();
        // И назад на 10 метров
        robot.back(10);
        // Напечатать координаты
        robot.printCoordinates();
    }
}