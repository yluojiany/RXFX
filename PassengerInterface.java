package org.aeroplane;
/**
 * ���νӿ�
 * @author 
 *
 */

public interface PassengerInterface {
      /**
       * ��ȡ�ÿ�����		
       * @return ��������
       */
	public String getName();
	  /**
	   * ��ȡԤ����
	   * @return ����Ԥ����
	   */
	
	public int getBookingNumber();
	  /**
	   * ��ȡ��λ����
	   * @return ��������
	   */
	
	public int getRow();
	/**
	 * ��ȡ��λ��
	 * @return ������λ��
	 */
	
	public int getSeatPosition();
	
}
