package project16;

public class Text {

	public static void main(String[] args) {
		
		//stringbuffer����ɱ���ַ����У����Զ��ַ������ݽ�����ɾ�Ĳ�
		
		StringBuffer sb=new StringBuffer();
		
		sb.append("hello you mother fucker").append(true).append(151631);//���
		
		sb.insert(4,"abc");//����
		
		sb.reverse();//��ת�ַ���
		
		sb.delete(3,6);//ɾ������Ϊ3-5���ַ�
		
		char c=sb.charAt(3);//����ָ�������µ��ַ�
		
		sb.setCharAt(0,c);//�޸Ķ��������µ��ַ�
		
		System.out.println(sb.length());
		
		System.out.println(c);
		
		System.out.println(sb);
		
		//stringbuilder��stringbuffer���÷�������ͬ��ֻ��stringbuilder�̲߳���ȫ������Ч�ʽϸ�
		//string��stringbuffer��stringbuilder��Ч�ʶԱ�
	    //stringbuilder > stringbuffer > string
		// ����string����һ�������Ͳ��ɱ䣬����Ҫ�޸�ԭ�е�string����jvm�������´���һ���µĶ�������
		//��ֵ���ѾɵĶ�������������գ�������̾��˷��˴�����ʱ�䣬��stringbuffer��stringbuilder����
		//�Ķ����Ǳ�����ֱ�ӶԱ��������޸ļ��ɣ�����Ч�ʽϸߣ�ͬʱ����stringbuffer�����̰߳�ȫ�Ļ���
		//�����ڲ�ִ��ʱ�ٶ�Ҫ������stringbuilder
		
		String s="";
		StringBuffer sb2=new StringBuffer();
		StringBuilder sb3 =new StringBuilder();
		
		long startTime=System.currentTimeMillis();
		for(int i=0;i<30000;i++)
		{
			s=s+i+"";
		}
		
		long endTime=System.currentTimeMillis();
		
		System.out.println("String ��ʱ "+(endTime-startTime));
		
		startTime=System.currentTimeMillis();
		
		for(int j=0;j<30000;j++)
		{
			sb2.append(j);
		}
		
		endTime=System.currentTimeMillis();
		System.out.println("Stringbuffer ��ʱ "+(endTime-startTime));
		
         startTime=System.currentTimeMillis();
		
		for(int k=0;k<30000;k++)
		{
			sb3.append(k);
		}
		
		endTime=System.currentTimeMillis();
		System.out.println("Stringbuilder ��ʱ "+(endTime-startTime));
		

	}

}
