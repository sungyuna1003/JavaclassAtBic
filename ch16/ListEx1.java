package ch16;

import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListEx1 extends MFrame implements ItemListener{
	
	List list1,list2;
	String team1[] = {"롯데","삼성","한화","KIA","SK"}; //list2
	String team2[] = {"LG","두산","키움","NC","KT"};//list2
	
	
	
	public ListEx1() {
		setTitle("팀선택");
		list1= new List(2); //() 안에 숫자 넣은 만큼 화면에 나타남.
 	    list2= new List(3,false); 
		
		
		
		list1.add("팀선택1");
		list1.add("팀선택2");
		/*list1 = new List(3,false);//단일 선택
		for (int i = 0; i < team1.length; i++) {
			list1.add(team1[i]);			
		}
		list2 = new List(5,true);//복수 선택
		for (int i = 0; i < team2.length; i++) {
			list1.add(team2[i]);			
		}*/
		inputItem(list2, team1);
		add(list1);
		add(list2);
		list1.addItemListener(this);
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(list1.getSelectedItem().equals("팀선택1"))
			inputItem(list2, team1);
		else
			inputItem(list2, team2);
		
	}
	
	
	
	public void inputItem(List l, String item[]) {
		l.removeAll();
		for (int i = 0; i < item.length; i++) {
			l.add(item[i]);
		}
	}

	public static void main(String[] args) {
		new ListEx1();

	}

}