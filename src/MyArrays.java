import java.util.Arrays;
import java.util.Random;

public class MyArrays {
    public static void insertionSort(int[] a) {
        for (int index = 1; index <= a.length - 1; index++) {
            int val = a[index];
            int j = index - 1;
            while ( j >= 0 && a[j] > val ) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = val;
        }
    }

    public static void selectionSort(int[] a) {
        //sorting in ascending order
        for (int i = 0; i <= a.length - 2; i++) {
            //find index such that a[index] is the smallest of a[i]..a[a.length-1]
            int index = i;
            int smallest = a[i];
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < smallest) {
                    smallest = a[j];
                    index = j;
                }
            }
            //if index != i, swap a[index] and a[i].
            if (index != i) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
    }

    public static void merge(int[] first, int[] second, int[] a) {
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;

        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                a[j] = first[iFirst];
                iFirst++;
            } else {
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
    }

    public static void mergeSort(int[] a) {
        if (a.length <= 1) { return; }
        int[] first = new int[a.length / 2];
        int[] second = new int[a.length - first.length];



        // Copy the first half of a into first, the second half into second
        // write this code yourselves…

        mergeSort(first);
        mergeSort(second);
        merge(first, second, a);
    }

    public static void main(String[] args) {
        /*int[] arr1 = {3, 2, 5, 1};

        System.out.println("Test case 1\nInitial array: \t" + Arrays.toString(arr1) + "\nExpected:\t\t[1, 2, 3, 5]");
        insertionSort(arr1);
        System.out.println("Actual:\t\t\t" + Arrays.toString(arr1));

        int[] arr2 = {2, 12, 17, 9, 3};

        System.out.println("\nTest case 2\nInitial array: \t" + Arrays.toString(arr2) + "\nExpected:\t\t[2, 3, 9, 12, 17]");
        insertionSort(arr2);
        System.out.println("Actual:\t\t\t" + Arrays.toString(arr2));

        int[] arr3 = {18, 1, 20, 14, 5, 10, 16, 3};

        System.out.println("\nTest case 3\nInitial array: \t" + Arrays.toString(arr3) + "\nExpected:\t\t[1, 3, 5, 10, 14, 16, 18, 20]");
        insertionSort(arr3);
        System.out.println("Actual:\t\t\t" + Arrays.toString(arr3));*/

        // Random random = new Random();
        // int[] numbers = random.ints(100).toArray();
        int[] numbers = {-257407413, 1116066914, 993793741, -809801753, -1865849473, -2043589300, -1414855761, 1917452665, -274999038, 807076322, 1688778216, 1714814186, -244024168,
                -708998708, 1191345057, -274749426, -1428460153, 2029689294, -1238203622, -481472154, 148486743, -37162436, 1654299157, -1311597131, 604752600, 1848524972, -442433676,
                1063199444, 1445184617, -1349981971, 362162977, 207313858, -495489418, -470226632, 877965357, 1708673535, 1911118658, 871779749, -151347909, -800630759, -248162074,
                -904468768, -517079265, 406147462, -89887080, -51628004, 1901357505, -182680652, -911414736, -1006776250, 792701767, -821076898, 2085044712, -462192002, 1112542579,
                1916672289, -754397597, -1287245374, -651245240, -1871750065, -1298030352, -989518868, 1514770675, 967621377, -546637297, -2119626786, 593646569, -1612605326,
                176694323, -456303878, 236233036, -969153909, -1745635639, -80004648, 560221330, 1107526585, 300909945, 624535602, -746637208, 412524038, 418234283, 886074403,
                756444115, -1970936985, -1687288756, 123443344, -1890527847, 1336778578, 397503953, -844086554, 10248670, 1356678548, -1244341637, 1558863877, -775404015, 1114151520,
                -871303972, 1460075643, 1579001608, -182794326};
        int[] selectionNumbers = numbers.clone();
        int[] insertionNumbers = numbers.clone();
        int[] arraysSortNumbers = numbers.clone();
        int[] mergeSortNumbers = numbers.clone();

        double startTime;
        double endTime;
        double duration;

        //System.out.println(Arrays.toString(numbers));
        System.out.println("Size of array: " + numbers.length);

        System.out.println("Sorting array times.\n");

        // System.currentTimeMillis() is inaccurate, System.nanoTime() is more accurate
        System.out.println("Selection array.");
        startTime = System.nanoTime();
        selectionSort(selectionNumbers);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Duration of selection array: " + duration + "ms");

        System.out.println("\nInsertion array.");
        startTime = System.nanoTime();
        insertionSort(insertionNumbers);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Duration of insertion array: " + duration + "ms");

        System.out.println("\nArrays.sort method.");
        startTime = System.nanoTime();
        Arrays.sort(arraysSortNumbers);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Duration of Arrays.sort: " + duration + "ms");
        // Why does Arrays.sort slower? Surely TimSort is designed to be fast?

        System.out.println("\nMerge sort method.");
        startTime = System.nanoTime();
        mergeSort(mergeSortNumbers);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Duration of merge sort array: " + duration + "ms");
    }
}
