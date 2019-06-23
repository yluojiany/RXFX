import java.util.HashMap;
import java.util.Map;

public class T_2 {
    private String name;
    private int age;

    public T_2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof T_2)) return false;

        T_2 student = (T_2) o;

        if (getAge() != student.getAge()) return false;
        return getName() != null ? getName().equals(student.getName()) : student.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return 
                "姓名：" + name + '\'' +
                "；年龄：" + age +
                ' ';
    }

    public static void main(String[] args) {
        Map<T_2, String> map = new HashMap<>();
        map.put(new T_2("小明", 19), "操场");
        map.put(new T_2("小红", 19), "食堂");
        map.put(new T_2("小芳", 13), "寝室2");
        map.put(new T_2("小虎牙", 18), "寝室3");

        for (T_2 student : map.keySet()) {
            System.out.println(student + " 地址:" + map.get(student));
        }
        System.out.println("--------------------------------------------");
        for (Map.Entry<T_2, String> next : map.entrySet()) {
            System.out.println(next.getKey() + " 地址:" + next.getValue());
        }
    }
}