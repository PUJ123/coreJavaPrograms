package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class StudentDetailsIterateUsingForEach {

	public static void main(String[] args) {
		
		List<Student> stdList = getStudentList();
		//Map<Integer,Student> stdMap = new HashMap<>();
		Map<String,List<Student>> stdMap = new HashMap<>();
		
		stdList.forEach(new Consumer<Student>() {

			@Override
			public void accept(Student std) {
				List<Student>checkList=stdMap.get(std.getCourse());
				
				
				  if(checkList!=null && !checkList.isEmpty()) 
				  { 
					  List<Student> stdList=stdMap.get(std.getCourse()); //System.out.println(stdList);
				  stdList.add(std); stdMap.put(std.getCourse(), stdList); } else {
				  List<Student> stdList=new ArrayList<>(); stdList.add(std);
				  stdMap.put(std.getCourse(), stdList); }
				 
				
				
			}
		});
		
		System.out.println(stdMap.toString());
	}

	private static List<Student> getStudentList() {
		
		List<Student> stuList =new ArrayList<>();
		Student std= new Student(100,"lll","latha@gmail.com","MCA");
		Student std1= new Student(101,"hhhh","hhhh@gmail.com","MCA");
		Student std2= new Student(102,"ssss","ssss@gmail.com","B.Tech");
		Student std3= new Student(103,"jjjj","jjjj@gmail.com","B.Tech");
		Student std4= new Student(104,"iiiii","iiiii@gmail.com","Degree");
		Student std5= new Student(105,"mmmmm","mmmmm@gmail.com","B.Tech");
		stuList.add(std);
		stuList.add(std1);
		stuList.add(std2);
		stuList.add(std3);
		stuList.add(std4);
		stuList.add(std5);
		
		
		 return stuList ;
	}

	
}
