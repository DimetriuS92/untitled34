import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String season = "winter";
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

