package kata6;

import java.util.ArrayList;

public class HistogramBuilder<T> {
    private final ArrayList<T> array;

    public HistogramBuilder(ArrayList<T> list) {
        this.array = array;
    }
            
    public <A> Histogram<A> build ( Attribute<T,A> attribute ){
        Histogram<A> hm = new Histogram<>();
        for (T key : array) {
            A value =  attribute.get(key);
            hm.increment(value);
        }
        return hm;                
    }
      
}
