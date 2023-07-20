// collection is framwork in java which is used to store and manipulate the group of objects
// collection includes list,set,queue,map etc -> all these are interfaces
// common operation in collection are -> add , remove , size , iterate(interface itself) , addAll , removeAll , clear etc

// List -> ordered collection of objects , duplicate allowed , indexed , can be accessed by index , can be traversed in order
// Set -> unordered collection of objects , duplicate not allowed , no index , can't be accessed by index , can't be traversed in order
// Queue -> ordered collection of objects , duplicate allowed , indexed , can be accessed by index , can be traversed in order  , FIFO 
// Map -> unordered collection of objects , duplicate not allowed , no index , can't be accessed by index , can't be traversed in order , key value pair

import java.util.*;

//! Map -> HashMap , LinkedHashMap , TreeMap , HashTable
class mapExample {
    // * HashMap
    // key -> unique , value -> duplicate
    // unordered collection
    // null key and null value allowed
    // HashMap is faster than HashTable
    void demoHashMap() {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "A");
        hm.put(2, "B");
        hm.replace(1, "FD");
        hm.replace(3, "NO"); // no effect -> not found key 3
        System.out.println(hm.get(1));
        System.out.println(hm.containsKey(2));
        System.out.println(hm);
    }
    // * LinkedHashMap
    // key -> unique , value -> duplicate
    // ordered collection
    // null key and null value allowed
    // LinkedHashMap is slower than HashMap
    // use doubly linked list

    // * TreeMap
    // key -> unique , value -> duplicate
    // ordered collection
    // null key and null value not allowed
    // TreeMap is slower than LinkedHashMap
    // use tree data structure
}

// ! Queue -> PriorityQueue , Deque , ArrayDeque
// PriorityQueue -> ordered collection of objects , duplicate allowed , indexed
// , can be accessed by index , can be traversed in order , FIFO
// Deque -> ordered collection of objects , duplicate allowed , indexed , can be
// accessed by index , can be traversed in order , FIFO , LIFO
// ArrayDeque -> ordered collection of objects , duplicate allowed , indexed ,
// can be accessed by index , can be traversed in order , FIFO , LIFO

// ! Set -> HashSet , LinkedHashSet , TreeSet
class setExample {
    void demoHashSet() {
        // not sorted
        // use hash table data structure
        // duplicate not allowed
        // unordered collection
        Set<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("C"); // duplication is not allowed
        System.out.println(hs);
    }

    void demoLinkHashSet() {
        // sorted in order of insertion
        // ordered collection
        // use doubly linked list
    }

    void demoTreeSet() {
        // in nature it is sorted
        // orderd collection
        // use tree data structure
    }
}

// ! list -> ArrayList , LinkedList , Vector , Stack
class listExample {

    public void notes() {
        // differnce between arraylist and linkedlist
        // arraylist -> internally uses dynamic array to store the elements
        // linkedlist -> internally uses doubly linked list to store the elements

        // differnce between arraylist and vector
        // arraylist -> not synchronized , not thread safe , fast
        // vector -> synchronized , thread safe , slow

    }

    public void demoArrayList() {
        System.out.println("This is demo of ArrayList");
        ArrayList<String> al = new ArrayList<>();
        // List<Double> dl = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("c");
        al.remove("B");
        System.out.println("Size -> " + al.size());
        System.out.println(al);
        // method to iterate
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public void demoLinkList() {
        System.out.println("This is demo of LinkedList");
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.addFirst("First");
        ll.add("c");
        ll.remove("B");
        System.out.println("Size -> " + ll.size());
        System.out.println(ll);
    }

    public void demoVector() {
        List<Integer> vl = new Vector<>();
        vl.add(1);
        vl.add(2);
        vl.add(3);
        vl.remove(2);
        System.out.println("Size -> " + vl.size());
        System.out.println(vl);
    }

    public void demoStack() {

        // List<String> sl2 = new Stack<>();
        Stack<String> sl = new Stack<>();
        sl.push("A");
        sl.push("B");
        sl.push("C");
        sl.pop();
        System.out.println(sl);

    }

    public void info() {
        System.out.println("This class is about list and its demo");
    }
}

public class App {
    public static void main(String args[]) {
        System.out.println("Hello collection framework");
        listExample le = new listExample();
        setExample se = new setExample();
        mapExample me = new mapExample();
        me.demoHashMap();
    }
}