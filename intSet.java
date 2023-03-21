import java.util.BitSet;

public class IntSet {
    private BitSet bset;
    public IntSet(int n){
        bset=new BitSet(n);
    }
    boolean  get(int bitIndex){
        boolean a=bset.get(bitIndex);
        return a;
    }
    void set(int Bindex,boolean value)
    {
        bset.set(Bindex,value);
    }


}
