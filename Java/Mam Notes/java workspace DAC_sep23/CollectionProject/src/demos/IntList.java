package demos;
import java.util.*;
public class IntList {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		nums.add(34);
		nums.add(23);
		nums.add(67);
		nums.add(12);
		nums.add(65);
		
		System.out.println(nums);
		nums.remove(2);
		System.out.println(nums);
		nums.remove(Integer.valueOf(12));
		System.out.println(nums);
		nums.remove(Integer.valueOf(100));
		System.out.println(nums);
		
		/*List<Emp> emps = new ArrayList<>();
		emps.add(new SalesManager());
		emps.add(new Programmer());
		*/

	}

}
