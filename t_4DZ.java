import java.util.LinkedList;
 
public class t_4DZ {
    private LinkedList linkedList=new LinkedList();
 
    //ѹջ
    public void  push(Object value){//ѹ
        linkedList.addFirst(value);
    }
 
    //��ջ
    public Object pop(){//��
        Object value=linkedList.getFirst();
        linkedList.removeFirst();
        return value;
    }
 
    //������С
    public int size(){
        return linkedList.size();
    }
 
    public static void main(String[] args) {
        t_4DZ dz=new t_4DZ();
        dz.push("��");
        dz.push("��");
        dz.push("��");
        dz.push("��");
 
        while(dz.size()!=0){
            System.out.println(dz.pop());
        }
    }
}
