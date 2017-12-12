package com.Chapter9.com;

import java.lang.reflect.Field;

public class TestMoreFields {

	public static void main(String[] args) {
		/*
		 * ������ʳ�Ա����
		 */
		MoreFields moreFields = new MoreFields();
		Class<? extends MoreFields> exampleC = moreFields.getClass();
		
		Field[] fields2 = exampleC.getDeclaredFields();
		for(int i = 0;i < fields2.length;i++) {
			// ������Ա����
			Field field = fields2[i];
			System.out.println("��Ա���ƣ�" + field.getName());
			Class fieldType = field.getType();
			System.out.println("����Ϊ��" + fieldType);
			
			boolean isTurn = true;
			while(isTurn) {
				try { // ����ó�Ա�����ķ���ȨΪprivate�����׳��쳣���Ȳ��������
					isTurn = false;
					System.out.println("�޸�ǰ��ֵ��" + field.get(moreFields));
					// �жϳ�Ա�����������Ƿ�Ϊint
					if (fieldType.equals(int.class)) {
						System.out.println("���÷���setInt�޸ĳ�Ա������ֵ��");
						field.setInt(moreFields, 5);
					// �жϳ�Ա�����������Ƿ�Ϊfloat
					}else if (fieldType.equals(float.class)) {
						System.out.println("���÷���setFloat�޸ĳ�Ա������ֵ��");
						field.setFloat(moreFields, 100.63f);
					// �жϳ�Ա�����������Ƿ�Ϊboolean
					}else if (fieldType.equals(boolean.class)) {
						System.out.println("���÷���setBoolean�޸ĳ�Ա������ֵ��");
						field.setBoolean(moreFields, true);
					}else {
						System.out.println("���÷����޸ĳ�Ա������ֵ��");
						field.set(moreFields, "zhangyunhe");
					}
					System.out.println("�޸ĺ��ֵΪ:" + field.get(moreFields));
					System.out.println("------------------");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("������ǰ�׳��쳣��");
					field.setAccessible(true);
					isTurn = true;
				}
			}
			System.out.println();
		}
	}

}
