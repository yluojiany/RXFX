import java.util.*; 
class Solution{
	public ArrayList<String> restoreIpAddress(String s){ 
		ArrayList<String> res=new ArrayList<String>(); 
		String ip="";
		restoreIpAddress(s,0,0,ip,res);
		return res;
		}
	private void restoreIpAddress(String s,int start,int part,String ip, ArrayList<String> res){
		//���ֶ࣬����� 
		if(s.length() -start >(4-part)*3) return;
		//����̫��Ҳ���� 
		if(s.length()-start <(4-part)) return; 
		//�ҵ�һ���Ϸ���ip 
		if(start==s.length() && part ==4) {
			//�����һ��Ĩȥ
			res.add(ip.substring(0,ip.length()-1));
			return;
			} 
		int num =0; 
		for(int i=start;i<Math.min(start+3,s.length());i++){ 
			//ÿ��λ�������ֿ��� 
			num = num*10 +(s.charAt(i)-'0');
			if(num<=255){ 
				//ÿ��ip��ַ�����ֶ���С��256
				ip+=s.charAt(i); 
				restoreIpAddress(s,i+1,part+1,ip+'.',res); } 
			//�����һ����0�Ļ���ֻ����0��������0x��ɵĵ�ַ 
			if(num==0) 
				break;
			}
		} 
			
		
	}


