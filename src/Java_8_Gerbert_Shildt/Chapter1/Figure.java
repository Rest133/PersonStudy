package Java_8_Gerbert_Shildt.Chapter1;

class Figure {
    double dim1, dim2;

    Figure(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    double area() {
        System.out.println("Площадь фигуры не определена.");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("S четырехуголника равна ");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("S прямоугольного треуголника равна ");
        return dim1 * dim2 / 2;
    }
}

class FindArea {
    public static void main(String[] args) {
        Figure f = new Figure(15, 12);
        Rectangle box = new Rectangle(5.0, 12.0);
        Triangle triangle = new Triangle(1.0, 6.0);

        System.out.println("Площади этих фигур равны: ");
        System.out.println("Фигура 1: " + f.area());
        System.out.println("Фигура 2(четырехугольник): " + box.area());
        System.out.println("Фигура 3(п/у треугольник): " + triangle.area());
    }
}