package jv17_05.pavliuk.lesson17.treeset;

public class HeavyBox extends Box implements Comparable<HeavyBox> {
    private int weight;

    public HeavyBox(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    @Override
    public int compareTo(HeavyBox o) {
        return Integer.compare(this.weight, o.weight);
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }
}
