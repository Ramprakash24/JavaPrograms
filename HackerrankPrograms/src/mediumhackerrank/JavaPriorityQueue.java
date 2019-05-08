package mediumhackerrank;
/*
 *  Question : https://www.hackerrank.com/challenges/java-priority-queue/problem
 *  Reference : https://www.geeksforgeeks.org/implement-priorityqueue-comparator-java/
/*
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student{
	int id;
	String name;
	double cgpa;
	public Student(int id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
		
}

class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		if(a.getCgpa() < b.getCgpa()) return 1;
		if(a.getCgpa() > b.getCgpa()) return -1;
		if(a.getCgpa() == b.getCgpa()) {
			if(a.getName().compareTo(b.getName()) < 0 ) return -1;
			if(a.getName().compareTo(b.getName()) > 0 ) return 1;
			if(a.getName().compareTo(b.getName()) == 0 ) {
				if(a.getId() > b.getId()) return 1;
				if(a.getId() < b.getId()) return -1;
			}
		}
		return 0;
	}
	
}

class Priorities{
	List<Student> getStudents(List<String> events){
		PriorityQueue<Student> pqueue = new PriorityQueue<Student>(new StudentComparator());
		for(int i = 0; i < events.size(); i++) {
			if(events.get(i).contains("SERVED")) {
				if(pqueue.size() > 0)
					pqueue.poll();
			}
			else {
				String[] data = events.get(i).split(" ");
				pqueue.add(new Student(Integer.parseInt(data[3]), data[1], Double.parseDouble(data[2])));
			}		
	}
	List<Student> result = new ArrayList<>();
	while(pqueue.size() > 0)
		result.add(pqueue.poll());
	return result;
	}
}
public class JavaPriorityQueue {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
	    Priorities priorities = new Priorities();
	    
		int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
        scan.close();
	}
		
}
