package MyTests;


import Base.Main;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MyTests {
    private Main testMain = new Main();

    @Test

    public void testShowweather() throws Exception {
        String season = "Summer";
        System.out.println(testMain.showWeather(season));
        String season1 = "winter";
        System.out.println(testMain.showWeather(season1));

    }

    @Test
    public void testCountfinger() throws Exception {
        int finger = 3;
        System.out.println(testMain.countFinger(finger));

    }

    @Test
    public void testshowPrice() throws Exception {
        int price = 900;
        System.out.println(testMain.showPrice(price));
        int price1 = 1000;
        System.out.println(testMain.showPrice(price1));
    }

    @Test
    public void testshowDay() throws Exception {
        String day = "tuesday";
        System.out.println(testMain.showDay(day));
        String day1 = "sundAy";
        System.out.println(testMain.showDay(day1));
        String day2 = "123123";
        System.out.println(testMain.showDay(day2));

    }

    @Test
    public void testMaxElement() throws Exception {
        int arr[] = {1, 206, 10, 2, 3, 0, 7, 56, 32, 3, 14};
        System.out.println(testMain.maxElement(arr));
    }

    @Test
    public void testReverseArray() throws Exception {
        int massive[] = {1, 206, 10, 2, 3, 0, 7, 56, 32, 3, 14};
        System.out.println(Arrays.toString(testMain.sort(massive)));

    }

}
