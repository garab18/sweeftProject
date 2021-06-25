import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class MySet<T> {
    private HashMap<T, Integer> map;
    ArrayList<T> list;
    private int size;

    public MySet(){
        size = 0;
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean contains(T elem){
        if (map.containsKey(elem)) return true;
        return false;
    }

    public void addElement(T elem){
        if (contains(elem)) return;
        list.add(elem);
        map.put(elem, size);
        size++;
    }

    public T getElement(int index){
        if (index >= size) return null;
        return list.get(index);
    }

    //remove time complexity is O(1) cause before removal element swaps position to last element.
    public void remove(T elem){
        if (!contains(elem)) return;
        size--;
        int elemIndex = map.get(elem);
        list.set(elemIndex, list.get(size));
        list.set(size, elem);
        list.remove(size);
        map.remove(elem);
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        MySet<Integer> set = new MySet<>();
        set.addElement(1);
        set.addElement(2);
        set.addElement(3);
        set.addElement(4);
        System.out.println(set.size);
        set.remove(2);
        System.out.println(set.size);
        for(int i = 0; i < set.getSize(); i ++){
            System.out.print(set.getElement(i));
        }
        System.out.println();

        MySet<String> sett = new MySet<>();
        sett.addElement("hello");
        sett.addElement("world");
        sett.addElement("good");
        for(int i = 0; i < set.getSize(); i ++){
            System.out.print(sett.getElement(i));
        }
        System.out.println();
        sett.addElement("bye");
        sett.remove("good");
        System.out.println(sett.getSize());
        for(int i = 0; i < set.getSize(); i ++){
            System.out.print(sett.getElement(i));
        }
    }
}
