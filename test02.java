package stringbuffer;

public class test02 {
	public static void main(String[] args) {
		 
	     int[] arr = {10,20,30,40,55,66,77,88,99};
	     System.out.println(array2String(arr));
	   }
	 
	   public static String array2String(int[] arr) {
	 
	     StringBuffer sb = new StringBuffer();
	     // 1�Ȱ��������Ÿ�ƴ�ӵ�������
	     sb.append("[");
	     // 2��������
	     for(int i=0; i<= arr.length-1; i++){
	        if(i == arr.length-1) {
	          sb = sb.append(arr[i] + "]"); //ע�����һ��Ԫ��ƴ�Ӵ���ʽ
	        }else {
	          sb = sb.append(arr[i] + ",");
	        }
	     }
	     return sb.toString();
	   }
	

}
