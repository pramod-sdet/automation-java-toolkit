package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class EmpRunner {

	public static void main(String[] args) {
	Emp e1 = new Emp(101, "Pramod", "QA", 1000);
	
	List<Emp> empList= new ArrayList<Emp>();

	empList.add(e1);
	empList.add(new Emp(102,"Shreya","Dev", 2000));
	empList.add(new Emp(103,"Paul","PM", 2500));
	empList.add(new Emp(104,"Ansh","Dev", 5500));
	
//	
//	for (Emp temp : empList) {
//		System.out.println(temp);
//	}
	
	empList.forEach(e-> System.out.println(e));
		
	
	List<Emp> result= empList.stream().filter(e -> e.getSalary()>2000)
					.collect(Collectors.toList());
	System.out.println(result);
	
	
	List <Emp> reusultSortedEmps= empList.stream()
			.sorted((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()))
			.collect(Collectors.toList());
	reusultSortedEmps.forEach(e -> System.out.println(e));

	}

}