import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class t_5_ArrayList {
	
    public static void main(String[] args) {
    	System.out.println(">>>>>>>>>>>>><<<<<<<<<<<<<<<");
        List<t_5_Student> list = new ArrayList<>();
        list.add(new t_5_Student("002", "老张", 85));
        list.add(new t_5_Student("001", "小王", 90));
        list.add(new t_5_Student("004", "赵顺", 70));
        list.add(new t_5_Student("005", "马花疼", 88));
        list.add(new t_5_Student("009", "李小四", 74));
        list.add(new t_5_Student("006", "姜达", 62));
        list.add(new t_5_Student("007", "黄搞色", 59));
        list.add(new t_5_Student("008", "林大美", 67));

        Collections.sort(list);
        Iterator<t_5_Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(">>>>>>>>>>>>><<<<<<<<<<<<<<<");
        
        list.sort((Comparator<? super t_5_Student>) new StudentComparator());
        Iterator<t_5_Student> iteratorA = list.iterator();
        iteratorA.forEachRemaining(System.out::println);
    }
}
