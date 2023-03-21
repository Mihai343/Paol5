import java.io.*;
import java.util.Vector;
import java.util.Scanner;
import java.util.Collections;

class SortedVector extends Vector{

    private Vector <String> v;
    public SortedVector(){
        v= new Vector <String>();
    }
    public void addElement(String a){
        v.add(a);
        Collections.sort(v);
    }
    public void insertElementAt(String a, int b){
        v.insertElementAt(a,b);
        Collections.sort(v);
    }
}
