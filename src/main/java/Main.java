import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите время года:");
        String season = scanner.nextLine();
        String weather;
        switch (season) {
            case "winter":
                weather = "It's cold";
                break;
            case "spring":
                weather = "It's warm";
                break;
            case "summer":
                weather = "It's hot";
                break;
            case "autumn":
                weather = "It's cool";
                break;
            default:
                weather = "There is no such month";
        }
        System.out.println(weather);
    }
}
