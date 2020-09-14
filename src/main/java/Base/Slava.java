package Base;

public class Slava {
    public static int minElement(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }


    public void testminElement() {
        int[] b = {1, 2, 3, 4, -9};
        System.out.println(minElement(b));
    }

    public static int[] reverseD(int[] mass) {
        for (int i = 0; i < mass.length / 2; i++) {
            int tmp = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = tmp;
        }

        return mass;
    }

}
