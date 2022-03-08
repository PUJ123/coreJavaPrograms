package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {
		//Stream OF
		
		  Stream<Integer>stream = Stream.of(1,2,3,4,5,15) ;
		  stream.forEach(i->System.out.println(i));
		 
	}}
		//Stream of Array
		/*
		Stream<Integer> stream = Stream.of(new Integer[] {1,2,3,4,5,6});
		
		 * stream.forEach(i->System.out.println(i));
		 */
		//List To Stream
		/*
		 * List<Integer> li = new ArrayList<Integer>(); for(int i=1;i<=10;i++) {
		 * li.add(i); } li.forEach(i->System.out.println(i));
		 */
		/*
		 * Stream<Integer> stream = li.stream();
		 * stream.forEach(i->System.out.println(i));
		 */
		
		/*
		 * IntStream stream = "1234_abc".chars();
		 * stream.forEach(i->System.out.println(i));
		 */
		/*
		 * Stream<String> stream = Stream.of("la&th&a".split("&"));
		 * stream.forEach(i->System.out.println(i));
		 */
		
		/*
		 * Stream<Integer> stream = li.stream().filter(new Predicate<Integer>() {
		 * 
		 * @Override public boolean test(Integer t) { // TODO Auto-generated method stub
		 * return t%2==0; } })stream.forEach(i->System.outprint(i));
		 */
		 
		
		/*
		 * List<Integer> list= li.stream().filter(t->
		 * t%2==0).collect(Collectors.toList()); System.out.println(list.toString());
		 */
		
		
		/*
		 * Integer[]array = li.parallelStream().filter(i-> i%2==0).toArray(Integer[]::
		 * new); for(int i=0;i<array.length;i++) { System.out.println(array[i]); }
		 */
		
		
	/*
	 * List<String> list = new ArrayList<String>(); list.add("lllll");
	 * list.add("jjjjj"); list.add("fffff"); list.add("ssssss");
	 */
		
		//List<String> name= list.stream().filter(i->i.startsWith("f")).collect(Collectors.toList());
		
		/*
		 * List<String> name= list.stream().filter(i->
		 * i.startsWith("ssss")).collect(Collectors.toList());
		 * 
		 * System.out.println(name.toString());
		 */
		
		/*
		 * Student std= new Student(100,"llll","lll@gmail.com","MCA"); Student std1= new
		 * Student(101,"llll","lll@gmail.com","B.Teck"); Student std2= new
		 * Student(102,"llll","lll@gmail.com","Degree"); Student std3= new
		 * Student(103,"llll","lll@gmail.com","MCA"); List<Student> student= new
		 * ArrayList<>(); student.add(std); student.add(std1); student.add(std2);
		 * student.add(std3); System.out.println(student.toString());
		 * 
		 * List<Student>stdList = student.stream().filter(i->
		 * i.getCourse().equals("MCA")).collect(Collectors.toList());
		 * System.out.println(stdList.toString());
		 */
		
/*
 * List<String> memberNames = new ArrayList<>(); memberNames.add("Amitabh");
 * memberNames.add("Shekhar"); memberNames.add("Aman");
 * memberNames.add("Rahul"); memberNames.add("Shahrukh");
 * memberNames.add("Salman"); memberNames.add("Yana");
 * memberNames.add("Lokesh");
 */
		
		/*
		 * List<String> S =memberNames.stream().filter(i->
		 * i.startsWith("S")).collect(Collectors.toList()); System.out.println(S);
		 */
		
		/*
		 * memberNames.stream().filter(i-> i.startsWith("S")).forEach(new
		 * Consumer<String>() {
		 * 
		 * 
		 * @Override public void accept(String t) { System.out.println(t);
		 * 
		 * } });
		 */
		//memberNames.stream().filter(i-> i.startsWith("R")).forEach(i-> System.out.println(i));
		//memberNames.stream().filter(i-> i.endsWith("n")).forEach(System.out::println);
		
		//Map
		//memberNames.stream().filter(i-> i.startsWith("S")).map(String:: toLowerCase).forEach(i-> System.out.println(i));
		
		//sorted
	//	memberNames.stream().sorted().forEach(System.out::println);
		
		/*
		 * List<String>stlist=memberNames.stream().sorted().map(String::toLowerCase).
		 * collect(Collectors.toList()); System.out.println(stlist.toString());
		 */
		
		/*
		 * boolean b= memberNames.stream().anyMatch(n-> n.equals("Shekhar")); boolean
		 * b1= memberNames.stream().noneMatch(n->n.equals("Shekhar"));
		 * System.out.println(b + " "+b1);
		 */
		
		//Count
		/*
		 * long count= memberNames.stream().filter(i-> i.startsWith("Y")).count();
		 * 
		 * System.out.println(count);
		 * 
		 * long count1=memberNames.stream().map(String::toUpperCase).filter(i->
		 * i.startsWith("Y")).count(); System.out.println(count1);
		 */
		
		//reduce
		
		/*
		 * Optional<String> op= memberNames.stream().reduce((n1,n2) -> n1+" $ "+n2);
		 * System.out.println(op.isPresent()); op.ifPresent(n->System.out.println(n));
		 * 
		 * Optional<String> op1= memberNames.stream().filter(s->
		 * s.startsWith("S")).findFirst(); op1.ifPresent(n->System.out.println(n));
		 */
		 
		/*
		 * List<Integer>list1= new ArrayList<Integer>(); for(int i=0;i<10;i++) {
		 * list1.add(i); } System.out.println(list1.toString()); Stream<Integer>
		 * stream=list1.parallelStream(); stream.forEach(i-> System.out.print(i));
		 * //System.out.println(stream);
		 */
		
		
		

