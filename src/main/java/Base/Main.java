package Base;

public class Main {
    public static String showWeather(String season) {
        switch (season.toLowerCase()) {
            case "winter":
                return "It's cold";

            case "spring":
                return "It's warm";

            case "summer":
                return "It's hot";

            case "autumn":
                return "It's cool";
            default:
                return "There is no such month";
        }


    }

    public static String countFinger(int finger) {

        switch (finger) {
            case 1:
                return "большой";

            case 2:
                return "указательный";

            case 3:
                return "средний";

            case 4:
                return "безимянный";
            case 5:
                return "мизинец";

            default:
                return "Нет такого пальца";

        }

    }

    public static int showPrice(int price) {
        if (price < 1000) {
            System.out.println("цена нормальная");
        } else if (price >= 1000) {
            System.out.println("цена завышена");
        } else {
            System.out.println("Введите число");


        }

        return price;
    }

    public static String showDay(String day) {
        if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday") || day.equalsIgnoreCase("friday")) {
            return "будний день - работай";
        } else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
            return "выходной день - отдыхай";
        } else {
            return "Слава привет";
        }

    }

    public static int maxElement(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static int[] sort(int[] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            int tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;

        }


        return massive;
    }
}
