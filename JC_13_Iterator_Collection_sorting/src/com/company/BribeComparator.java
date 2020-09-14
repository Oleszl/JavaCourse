package com.company;

import java.util.Comparator;

public class BribeComparator implements Comparator<Delegate> {


    @Override
    public int compare(Delegate o1, Delegate o2) {
        if (o1.getBribeSuma()>o2.getBribeSuma())
            return 1;
        else if (o1.getBribeSuma()<o2.getBribeSuma())
            return -1;

        else return 0;

    }
}
