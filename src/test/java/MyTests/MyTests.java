package MyTests;


import Base.Main;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.function.Function;

import static Base.Main.*;
import static Base.Slava.minElement;
import static Base.Slava.reverseD;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;



public class MyTests {
  //  private Main testMain = new Main();

    @Test

    public void testShowweather() throws Exception {
        String season = "Summer";
        System.out.println(showWeather(season));
        String season1 = "winter";
        System.out.println(showWeather(season1));

    }

    @Test
    public void testCountfinger() throws Exception {
        int finger = 3;
        System.out.println(countFinger(finger));

    }

    @Test
    public void testshowPrice() throws Exception {
        int price = 900;
        System.out.println(showPrice(price));
        int price1 = 1000;
        System.out.println(showPrice(price1));
    }

    @Test
    public void testshowDay() throws Exception {
        String day = "tuesday";
        System.out.println(showDay(day));
        String day1 = "sundAy";
        System.out.println(showDay(day1));
        String day2 = "123123";
        System.out.println(showDay(day2));

    }

    @Test
    public void testMaxElement() throws Exception {
        int arr[] = {1, 206, 10, 2, 3, 0, 7, 56, 32, 3, 14};
        System.out.println(maxElement(arr));
    }

    @Test
    public void testReverseArray() throws Exception {
        int massive[] = {1, 206, 10, 2, 3, 0, 7, 56, 32, 3, 14};
        System.out.println(Arrays.toString(sort(massive)));

    }

    @Test
    public void testminElement() {
        int[] b = {1, 2, 3, 4, -9};
        System.out.println(minElement(b));

    }

    @Test
    public void testReverse() {
        int[] b = {1, 2, 3, 4, -9};
        System.out.println(Arrays.toString(reverseD(b)));
    }
    @Test
    public void testTwoMax() throws Exception {
        int[] aray = {25,17,2,30,26,29,14,20,15,31,12,9,3,23,25,5,7,10,27,19};
        System.out.println(Arrays.toString(twoMax(aray)));
    }
    @Test
    public void testMostPopular() throws Exception {
        int[] a = new int[] { 9, 0, 8, 0, 1, 2, 4, 4, 5, 7, 8, 4, 3, 9, 2, 1, 7, 4, 6, 4, 1, 2};
        System.out.println(getPopularElement(a));
    }
    @Test
    public void testsqrCount() throws Exception {
        int[] a = {25,17,2,30,26,29,14,20,15,31,12,9,3,23,25,5,7,10,27,19};
        System.out.println(sqrCount(a));
    }

}
