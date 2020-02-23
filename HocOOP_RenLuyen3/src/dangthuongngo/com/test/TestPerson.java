package dangthuongngo.com.test;

import java.util.ArrayList;

import dangthuongngo.com.model.Man;
import dangthuongngo.com.model.Person;
import dangthuongngo.com.model.Woman;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person>dsPerson=new ArrayList<Person>();
		Person an=new Man();
		an.setFirstName("An");
		Person hong=new Woman();
		hong.setFirstName("Hong"); 
		((Woman)hong).setWearingMakeup(true);
		
		dsPerson.add(an);
		dsPerson.add(hong);
		for(Person p: dsPerson)
			if(p instanceof Man)
			{
				System.out.println(p.getFirstName()+"la Nam");
			}
			else if(p instanceof Woman)
			{
				System.out.println(p.getFirstName()+" la Nu");
			}
	}

}
