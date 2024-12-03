import java.util.LinkedList;
import java.util.ListIterator;

public class ListUtils {

    // Part (c) Reverse a LinkedList in place
    public static <E> void reverseLinkedListInPlace(LinkedList<E> list) {
        ListIterator<E> frontIterator = list.listIterator();
        ListIterator<E> backIterator = list.listIterator(list.size());

        // Traverse and swap elements using two iterators: front and back
        while (frontIterator.nextIndex() < backIterator.previousIndex()) {
            E temp = frontIterator.next();
            frontIterator.set(backIterator.previous());
            backIterator.set(temp);
        }
    }

    // Test the method
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Before reverse: " + list);
        reverseLinkedListInPlace(list);
        System.out.println("After reverse: " + list);
    }
}
