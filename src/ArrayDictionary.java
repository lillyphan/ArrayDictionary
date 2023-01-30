import java.util.Collection;

public class ArrayDictionary<E,T> {
    /*  A Java dictionary should use generics for the
     *  types of both key and value. E and T here.
     */

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
        return false;
    };

    //returns the number of key-value pairs in the dictionary
    int size(){
        return 0;
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
