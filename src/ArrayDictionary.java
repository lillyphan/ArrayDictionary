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
    }

    //add an key-value pair to the dictionary
    void put(E key, T value){
        if (keys.contains(key)){
            System.out.println("This key already exists.");
        } else {
            keys.add(key);
            values.add(value);
            size++;
        }
    }

    //get the value associated with a given key
    T get(E key){
        if (contains(key)){
            return values.get(keys.indexOf(key));
        } else {
            return null;
        }
    }

    //remove a key-value pair and return its value
    T remove(E key){
        if (contains(key)){
            T val = values.get(keys.indexOf(key));
            values.remove(keys.indexOf(key));
            keys.remove(key);
            size--;
            return val;
        } else {
            return null;
        }
    }

    //returns true if the given key has an associated value
    boolean contains(E key){
        return keys.contains(key);
    }

    //returns true if the dictionary is empty
    boolean isEmpty(){
        return false;
    }

    //returns the number of key-value pairs in the dictionary
    int size(){
        return size;
    }

    //returns a Collection¹ of keys
    Collection<E> keys(){
        return null;
    }

    //returns a Collection of values
    Collection<T>  values(){
        return null;
    }
}
