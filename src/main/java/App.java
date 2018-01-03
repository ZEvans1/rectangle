import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Enter rectangle length: ");
        String rectangleLengthString = myConsole.readLine();
        int rectangleLengthInt = Integer.parseInt(rectangleLengthString);

        System.out.println("Enter rectangle width: ");
        String rectangleWidthString = myConsole.readLine();
        int rectangleWidthInt = Integer.parseInt(rectangleWidthString);

        Rectangle rectangle = new Rectangle(rectangleLengthInt, rectangleWidthInt);
        boolean squareResult = rectangle.isSquare();
        System.out.println("The rectangle is square: " + squareResult);
    }
}
