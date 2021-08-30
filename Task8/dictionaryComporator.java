package Task8;

import java.util.Comparator;

public class dictionaryComporator implements Comparator<Baggage> {

    @Override
    public int compare(Baggage o1, Baggage o2) {
        int sum1 = o1.myGetterName().length()+ o1.myGetterClassName().length();
        int sum2 = o2.myGetterName().length()+ o2.myGetterClassName().length();
            if( sum1 >  sum2)
                return 1; //первый больше
            if( sum1 < sum2)
                return -1;//первый меньше =более ранняя позиция

        return 0;
    }
}



