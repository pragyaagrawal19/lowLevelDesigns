
import java.util.*;


public class ListDemo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Integer item = stack.pop();
        System.out.println(item);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        int OneBasedindexFromTop = stack.search(3);
        System.out.println(OneBasedindexFromTop);




        output();
    }

    public static void output(){
//        List<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1,2,3));
//        numberList.add(4);
//        numberList.sort(new MyComparator());
//        System.out.println(numberList);
//        numberList.sort(new MyComparator().reversed());
//        System.out.println(numberList);
//        numberList.sort((a,b)-> b-a);
//
//        ArrayList<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Shikhar", 10005,4.6));
//        studentList.add(new Student("Pragya", 10003,4.8));
//        studentList.add(new Student("Alisha", 10003,4.8));
//        studentList.add(new Student("Seenu", 10007,4.3));
//        Comparator<Student> comparing = Comparator.comparing(Student::getGpa);
//        studentList.sort(comparing.reversed().thenComparing(Student::getName));
//        studentList.sort((s1,s2)-> s1.getRoleNo()-s2.getRoleNo());
//        System.out.println(studentList.toString());

//        MyNode linkedList = new MyNode(0);
//        MyNode node2 = new MyNode();
//        node2.setValue(1);
//        linkedList.setNext(node2);

//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.get(2);
//        System.out.println(linkedList.getLast());
//        linkedList.addFirst(0);  //O(1)
//        linkedList.addLast(4);   //O(1)
//        linkedList.remove(2);
//        linkedList.removeIf(x -> x%2 ==0);
//        System.out.println(linkedList);
//
//        LinkedList<String> l1 = new LinkedList<>(Arrays.asList("Cat", "Dog", "Tiger"));
//        LinkedList<String> l2 = new LinkedList<>(Arrays.asList("Lion", "Dog"));
//        l1.removeAll(l2);
//        System.out.println(l1);

//        Vector<Integer> vector = new Vector<>(2);
//        vector.add(1);
//        vector.add(2);
//        vector.add(3);
//        List<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1,2,3));
//        System.out.println(vector.capacity());
//        vector.addAll(numberList);
//        System.out.println(vector.size());
//        System.out.println(vector.capacity());
//        System.out.println(vector);

    }
}