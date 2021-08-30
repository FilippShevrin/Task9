package Task8;

import java.util.Comparator;

    public class dictionaryComporatorInt implements Comparator<Baggage> {

        @Override
        public int compare(Baggage o1, Baggage o2) {
            if (o1.myGetterWeight() == o2.myGetterWeight()) //первый равен
            if (o1.myGetterWeight() > o2.myGetterWeight()) return 1; //первый больше
            if (o1.myGetterWeight() < o2.myGetterWeight()) return -1;//первый меньше =более ранняя позиция
            return 0;

        }
    }
