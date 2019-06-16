
import java.util.Iterator;
import java.util.TreeSet;

public class t_01 {
    public static void main(String[] args) {
        TreeSet<t_1> studentSets = new TreeSet<t_1>();
        studentSets.add(new t_1("001", "²ÌĞìÀ¤", 10));
        studentSets.add(new t_1("003", "ÎâÒà·²", 59));
        studentSets.add(new t_1("002", "ÕÂ½ğÀ³", 91));
        studentSets.add(new t_1("008", "²¨À½¸ç", 77));
        studentSets.add(new t_1("009", "Ãæ½î¸ç", 82));
        studentSets.add(new t_1("004", "¾Ö×ù", 99));

        Iterator<t_1> its = studentSets.iterator();
        while (its.hasNext()) {
        	t_1 s = its.next();
            System.out.println(s);
        }
    }
}