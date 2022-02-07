public class Maximizer<T extends Comparable<T>> {
    private T value;

    public void updateValue(T t) {
        if (value == null) {
            value = t;
        }
        if (value.compareTo(t) < 0) {
            value = t;
        }
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Maximizer<String> strMaximizer = new Maximizer<>();
        strMaximizer.updateValue("a");
        strMaximizer.updateValue("z");
        strMaximizer.updateValue("m");
        String maxStr = strMaximizer.getValue();
        System.out.println(maxStr);

        Maximizer<Integer> intMaximizer = new Maximizer<>();
        intMaximizer.updateValue(-22);
        intMaximizer.updateValue(10000);
        intMaximizer.updateValue(33);
        Integer maxInt = intMaximizer.getValue();
        System.out.println(maxInt);
    }
}
