package classworkitujava;

public class Person {
	String name="Shweta";
	int age;
	Person s;
	
    public void work() {
    	System.out.println("work");
    }
    public void main(String[] args) {
                Student s1 = new Student();
        s1.showInfo(s);
     
     
    }
}

 class Student extends Person {
    public void getGPA() {
    	System.out.println("Student Studies");
    }
    	void showInfo(Person person) {
    		String name2 = name;
    		if(person instanceof Student){
    		Student s1 =  (Student) person;
        	System.out.println("Name is" + name2);
        	//}
    		
    }

    	}
}