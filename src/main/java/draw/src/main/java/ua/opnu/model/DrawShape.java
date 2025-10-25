package draw.src.main.java.ua.opnu.model;

import java.awt.*;

/*
 * Абстрактний клас "Фігура для малювання".
 * Не можна створити об'єкт цього класу напряму — лише через його нащадків.
 */
public abstract class DrawShape {

    // Константи типів фігур
    public static final int SHAPE_RECTANGLE = 0;
    public static final int SHAPE_ROUNDED_RECT = 1;
    public static final int SHAPE_ELLIPSE = 2;

    // Початкова та кінцева точки
    private Point startPoint;
    private Point endPoint;

    // Конструктори
    public DrawShape() {
        this(new Point(0, 0), new Point(0, 0));
    }

    public DrawShape(Point startPoint, Point endPoint) {
        this.startPoint = new Point(startPoint);
        this.endPoint = new Point(endPoint);
    }

    // Абстрактний метод — кожна фігура реалізує по-своєму
    public abstract Shape getShape(Point startPoint, Point endPoint);

    // Метод, який повертає фігуру на основі поточних координат
    public Shape getShape() {
        return this.getShape(startPoint, endPoint);
    }

    // Сеттери
    public void setStartPoint(Point startPoint) {
        this.startPoint = new Point(startPoint);
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = new Point(endPoint);
    }

    // Статичний метод для створення конкретної фігури за типом
    public static DrawShape newInstance(int shapeType) {
        return switch (shapeType) {
            case SHAPE_RECTANGLE -> new Rectangle();
            case SHAPE_ROUNDED_RECT -> new RoundedRectangle();
            case SHAPE_ELLIPSE -> new Ellipse();
            default -> null;
        };
    }
}
