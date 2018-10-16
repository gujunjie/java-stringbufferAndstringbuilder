package project16;

public class Text {

	public static void main(String[] args) {
		
		//stringbuffer代表可变的字符序列，可以对字符串内容进行增删改查
		
		StringBuffer sb=new StringBuffer();
		
		sb.append("hello you mother fucker").append(true).append(151631);//添加
		
		sb.insert(4,"abc");//插入
		
		sb.reverse();//反转字符串
		
		sb.delete(3,6);//删除索引为3-5的字符
		
		char c=sb.charAt(3);//返回指定索引下的字符
		
		sb.setCharAt(0,c);//修改定制索引下的字符
		
		System.out.println(sb.length());
		
		System.out.println(c);
		
		System.out.println(sb);
		
		//stringbuilder与stringbuffer的用法大致相同，只是stringbuilder线程不安全，但是效率较高
		//string与stringbuffer与stringbuilder的效率对比
	    //stringbuilder > stringbuffer > string
		// 由于string对象一旦创建就不可变，所以要修改原有的string对象，jvm都是重新创建一个新的对象重新
		//赋值，把旧的对象进行垃圾回收，这个过程就浪费了大量的时间，而stringbuffer与stringbuilder创建
		//的对象是变量，直接对变量进行修改即可，所以效率较高，同时由于stringbuffer加入线程安全的机制
		//所以内部执行时速度要稍慢与stringbuilder
		
		String s="";
		StringBuffer sb2=new StringBuffer();
		StringBuilder sb3 =new StringBuilder();
		
		long startTime=System.currentTimeMillis();
		for(int i=0;i<30000;i++)
		{
			s=s+i+"";
		}
		
		long endTime=System.currentTimeMillis();
		
		System.out.println("String 耗时 "+(endTime-startTime));
		
		startTime=System.currentTimeMillis();
		
		for(int j=0;j<30000;j++)
		{
			sb2.append(j);
		}
		
		endTime=System.currentTimeMillis();
		System.out.println("Stringbuffer 耗时 "+(endTime-startTime));
		
         startTime=System.currentTimeMillis();
		
		for(int k=0;k<30000;k++)
		{
			sb3.append(k);
		}
		
		endTime=System.currentTimeMillis();
		System.out.println("Stringbuilder 耗时 "+(endTime-startTime));
		

	}

}
