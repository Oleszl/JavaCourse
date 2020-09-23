package Task2;

import java.util.Comparator;

public class HeightComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return (int) (o1.getHeight()-o2.getHeight());
    }
}
