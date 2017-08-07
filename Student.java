package Work;

import java.util.*;

public class Student {
	String name;
	String id;
	float [] score;
	
	public Student()
	{
		name = "0";
		id = "0";
		score = new float[10];
	}
	
	public void set(String name,String id,float[] s)
	{
		this.name = name;
		this.id = id;
		System.arraycopy(s, 0, score, 0, 10);
	}
	
	public float Allscore()
	{
		float all = 0;
		for(int i = 0;i < score.length;i++)
		{
			all += score[i];
		}
		return all;
	}
	
	public float Average()
	{
		return Allscore()/score.length;
	}
	
	public void display()
	{
		System.out.println("姓名：" +name);
		System.out.println("学号：" +id);
		System.out.println("总成绩：" +Allscore());
		System.out.println("平均分：" +Average());
	}

	public static void main(String[] args){
		String name,id;
		float []score = new float[10];
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		System.out.println("请输入名字、学号以及十门课成绩:");
		name = sc.next();
		id = sc.next();
		for(int i = 0; i < 10; i++){
			score[i] = (float) sc.nextDouble();
		}
		stu.set(name,id,score);
		stu.display();
	}
}
