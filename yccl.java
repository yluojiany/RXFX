class No extends Exception{
	public No(){
		super();
	}
	public No(String message){
		super(message);
	}
}
class test{
	public void play(int index)throws No{
		if(index>10){
			throw new No("��ʽ�����쳣");
		}
		System.out.println("������������");
	}
}
public class yccl {
	public static void main(String[] args) {
		test test = new test();
		try {
			test.play(13);
		} catch (No e) {
			System.out.println("�쳣��ϢΪ�� "+e.getMessage());
		}
	}
}
