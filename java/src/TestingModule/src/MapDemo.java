import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(16, 0.5f, true );
        map.put("Shikhar", 11);
        map.put("Akshit", 1);
        map.put("Pragya", 2);
        Integer id = map.getOrDefault("Akshit", 10);
        System.out.println(id);
        id = map.getOrDefault("abc", 10);
        System.out.println(id);
        System.out.println(map);

    }

    public static void output(){
//        HashMap<Integer, String> map = new HashMap<>(16, 0.5f);
//        map.put(11, "Shikhar");
//        map.put(2, "Akshit");
//        map.put(3, "Pragya");
//        map.put(null, "nullEntry");
//        map.put(null, "willReplaceNullEntry");
//        String name = map.get(3);
//        map.remove(3);
//        map.remove(31, "Nitin"); // will not remove anything
//        map.remove(3, "Pragya");
//        System.out.println(name);
//        System.out.println(map.containsKey(1));
//        System.out.println(map.containsValue("Pragya"));
//
//        Set<Integer> integers = map.keySet();
//        for (Integer key: map.keySet()){
//            System.out.println(map.get(key));
//        }
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for (Map.Entry<Integer, String> entry :entries){
//            entry.setValue(entry.getValue().toUpperCase());
//            System.out.println(entry.getKey()+":"+ entry.getValue());
//        }
//
//        HashMap<Student, String> studentMap = new HashMap<>();
//        Student s1 = new Student("Shikhar", 10005, 4.6);
//        Student s2 = new Student("Pragma", 10003, 4.8);
//        Student s3 = new Student("Shikhar", 10005, 4.6);
//        studentMap.put(s1, "Engg");
//        studentMap.put(s2, "Doct");
//        studentMap.put(s3, "Arch");
//
//        System.out.println(studentMap.size());
//        System.out.println(studentMap.get(s1));
//        System.out.println(studentMap.get(s3));

    }
}
