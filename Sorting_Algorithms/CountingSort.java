public class CountingSort {
    public static void main(String[] args) {
        int[] ages = {12, 16, 11, 18, 10, 13, 12, 15};
        int max = 18, min = 10;
        int range = max - min + 1;

        int[] count = new int[range];
        for (int age : ages) {
            count[age - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i]-- > 0) {
                ages[index++] = i + min;
            }
        }

        System.out.print("Sorted Ages: ");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}