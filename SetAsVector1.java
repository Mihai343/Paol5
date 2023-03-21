import java.util.Vector;

public class SetAsVector1 {
    private Vector <Integer> vector;
    public boolean contains(Integer n) {
        if (vector.contains(n))
            return true;
        return false;
    }
    public boolean add(Integer n) {
        if (vector.contains(n))
            return vector.add(n);
        return false;

    }

    public boolean remove(Integer n)

    {
        try {
            if (vector.remove(n))
                return true;

        }
        catch (Exception e) {
            return false;
        }
        return false;

    }
     public String toString() {
        try {
            return vector.toString();
        } catch (Exception e) {
            System.out.println("nu a mers");
        }
        return "nu";

    }
}
