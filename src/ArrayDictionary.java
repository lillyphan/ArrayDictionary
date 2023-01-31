/**
 * ArrayDictionary - class that utilizes two ArrayLists to create a Dictionary data structure
 * Author: Lilly Phan
 * Date (last edited): 01/31/2023
 **/

//imports
import java.util.ArrayList;
import java.util.Collection;

public class ArrayDictionary<E,T> {
    //intialization of instance data
    private ArrayList<E> keys; //ArrayList of all keys in Dictionary
    private ArrayList<T> values; //ArrayList of all values in Dictionary
    private int size;

    //constructor - declares all instance data
    public ArrayDictionary(){
        keys = new ArrayList<>();
        values = new ArrayList<>();
        size = 0;
    }

    //adds a key-value pair to the dictionary
    void put(E key, T value){
        if (keys.contains(key)){ //dict should not have duplicate keys
            System.out.println("This key already exists."); //let user know when key already exists
        } else {
            //add key and value to corresponding arrays
            keys.add(key);
            values.add(value);
            size++; //increment size
        }
    }

    //get the value associated with a given key
    T get(E key){
        if (contains(key)){
            return values.get(keys.indexOf(key)); //return the corresponding value to the key from values ArrayList
        } else {
            return null; //if the key doesn't exist, return null
        }
    }

    //remove a key-value pair and return its value
    T remove(E key){
        if (contains(key)){
            T val = values.get(keys.indexOf(key)); //get the value of the key to return
            values.remove(keys.indexOf(key)); //remove the value
            keys.remove(key); //remove the key
            size--; //decrement size
            return val;
        } else {
            return null; //if the key doesn't exist, return null
        }
    }

    //returns true if the given key has an associated value
    boolean contains(E key){
        return keys.contains(key);
    }

    //returns true if the dictionary is empty
    boolean isEmpty(){
        return keys.isEmpty();
    }

    //returns the number of key-value pairs in the dictionary
    int size(){
        return size;
    }

    //returns a Collection¹ of keys
    Collection<E> keys(){
        return new ArrayList<>(keys);
    } //ArrayList is a class that uses Collections

    //returns a Collection of values
    Collection<T>  values(){
        return new ArrayList<>(values);
    }
}
