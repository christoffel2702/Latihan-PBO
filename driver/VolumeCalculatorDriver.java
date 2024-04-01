package driver;

import java.util.Scanner;

import model.Box;
import model.Shape;
import model.ShapeType;
import model.Sphere;
import model.TriangularPrism;

public class VolumeCalculatorDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box box = new Box(4, 5, 6);
        Sphere sphere = new Sphere(3);
        TriangularPrism prism = new TriangularPrism(3, 4, 5, 6);

        System.out.println("Pilih jenis bentuk (0: Balok, 1: Bola, 2: Prisma Segitiga): ");
        int choice = scanner.nextInt();
        ShapeType shapeType = null;

        switch (choice) {
            case 0:
                shapeType = ShapeType.BOX;
                break;
            case 1:
                shapeType = ShapeType.SPHERE;
                break;
            case 2:
                shapeType = ShapeType.PRISM;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        if (shapeType == ShapeType.BOX) {
            System.out.println("Volume Balok: " + calculateVolume(box));
        } else if (shapeType == ShapeType.SPHERE) {
            System.out.println("Volume Bola: " + calculateVolume(sphere));
        } else if (shapeType == ShapeType.PRISM) {
            System.out.println("Volume Prisma Segitiga: " + calculateVolume(prism));
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }

    private static double calculateVolume(Shape shape) {
        return shape.calculateVolume();
    }
}
