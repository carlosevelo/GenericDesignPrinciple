public class Algorithms {
    public static <T extends Comparable<T>> Stats calcStats(T[] values) {
        Stats stats = new Stats();
        T min = values[0];
        T max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(max) > 0) {
                max = values[i];
            }
            if (values[i].compareTo(min) < 0) {
                min = values[i];
            }
        }
        stats.max = max;
        stats.min = min;
        return stats;
    }

    public static void main(String[] args) {
        String[] strArr = new String[] { "z", "a", "m" };
        Stats<String> strStats = Algorithms.calcStats(strArr);
        System.out.println(String.format("min: %s, max: %s",
                strStats.min, strStats.max));

        Integer[] intArr = new Integer[] { 10000, 33, -22 };
        Stats<Integer> intStats = Algorithms.calcStats(intArr);
        System.out.println(String.format("min: %d, max: %d", intStats.min, intStats.max));
    }
}

class Stats <T> {
    public T min;
    public T max;

}

