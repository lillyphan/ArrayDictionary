import java.util.ArrayList;
import java.util.Collection;

public class ArrayDictionary<E,T> {
    private ArrayList<E> keys;
    private ArrayList<T> values;
    private int size;

    public ArrayDictionary(){
        keys = new ArrayList<>();
        values = new ArrayList<>();
        size = 0;
    };

    //add an key-value pair to the dictionary
    void put(E key, T value){};

    //get the value associated with a given key
    T get(E key){
        return null;
    };

    //remove a key-value pair and return its value
    T remove(E key){
        return null;
    };

    //returns true if the given key has an associated value
    boolean contains(E key){
        return false;
    };

    //returns true if the dictionary is empty
    boolean isEmpty(){
        return keys.isEmpty();
    };

    //returns the number of key-value pairs in the dictionary
    int size(){
        return size;
    };

    //returns a Collection¹ of keys
    Collection<E> keys(){
        return null;
    };

    //returns a Collection of values
    Collection<T>  values(){
        return null;
    };
}
