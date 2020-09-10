package Task2;

import java.util.Comparator;

public class WidthComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return (int) (o1.getWidth()-o2.getWidth());
    }
}
