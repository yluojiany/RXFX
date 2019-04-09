package org.aeroplane;

public class Flight implements FlightInterface {
	private String flightNames;
    private int row;
    private int rowLength;
    private int[] fail= {-1};
    private Passenger[] passengerList;
/**
 * ������Ĺ��췽��
 * @param FlightName ������ 
 * @param rows ��������λ
 * @param rowLength ÿ����λ��
 * @throws Exception �׳��쳣��
 */
	public Flight(String FlightName,int rows,int rowLength) throws Exception{
	  if(FlightName==null||FlightName.trim().length()==0||rows<=0||rowLength<=0)
		  throw new Exception("Error");
	  else {
		  this.flightNames =FlightName;
		  this.row =rows;
		  this.rowLength =rowLength;
		  this.passengerList =new Passenger[row*rowLength];
		  for(int i=0;i<row*rowLength;i++)
			  passengerList[i]=null;
		  
	  }

	}

	//***********************Ԥ��������λ************************
	
	public int[] reserve(String names[]){
		if(names.length>rowLength)
			return fail;
		int i=0,j=0,k=0;
		boolean flag=false;
		
		labelA:for(i=0;i<=row-1;i++) {
			for(j=0;j<=rowLength-names.length;j++) {
				for(k=j;k<=j+names.length-1;k++) {
					if(passengerList[i*rowLength+k]!=null)
						break;
				}
				if(k>j+names.length-1) {
					flag=true;
					break labelA;
				}
			}
		}
		if(!flag)
			return fail;
		int[]bn=new int[names.length];
		for(k=j;k<=j+names.length-1;k++) {
			bn[k-j]=i*rowLength+k+1;
			passengerList[i*rowLength+k]=new Passenger(names[k-j],i*rowLength+k+1,i,k);
		}
		return bn;
	}
//***********************ȡ��Ԥ����λ****************************
	public boolean cancel(int bookingNumber) {
		boolean Status=false;
		for(int i=0;i<row*rowLength;i++) {
		if(passengerList[i]!=null&& bookingNumber==passengerList[i].getBookingNumber())
		{
			Status=true;
			passengerList[i]=null;
			break;
		}
	}
	return Status;
	}
public Passenger[]getPassengerList(){
	return passengerList;
}
	
}
