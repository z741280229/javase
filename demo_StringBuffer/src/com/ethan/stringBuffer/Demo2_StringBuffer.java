package com.ethan.stringBuffer;

public class Demo2_StringBuffer {

	/**
	 * * A:StringBuffer����ӹ���
		* public StringBuffer append(String str):
			* ���԰���������������ӵ��ַ�������������,�������ַ�������������
		* public StringBuffer insert(int offset,String str):
			* ��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
		StringBuffer���ַ���������,��new��ʱ�����ڶ��ڴ洴����һ������,�ײ���һ������Ϊ16���ַ�����
		��������ӵķ���ʱ,���������´�������,�ڲ�����ԭ����������ַ�
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("ethan");
		System.out.println(sb);
		
		/*StringBuffer sb1 = new StringBuffer();
		sb1.insert(1, "test");
		System.out.println(sb1);*/
		StringBuffer sb1 = new StringBuffer("this");
		StringBuffer sb2 = sb1.insert(1, "test");
		System.out.println(sb1);
		System.out.println(sb2);
		
		//StringBuffer ��д��ͨtoString����
		System.out.println(sb.toString());
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());

	}

}
