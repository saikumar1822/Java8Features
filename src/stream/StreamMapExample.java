package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(100);
		marks.add(40);
		marks.add(90);
		marks.add(45);
		marks.add(45);
		marks.add(10); 
		marks.add(15);
		marks.add(20);
		System.out.println(marks);
		List<Integer> cutomizedsorting=marks.stream().sorted((i1,i2)->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
		
		List<Integer> compareTo=marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("compareTo"+"   "+compareTo);
		System.out.println("cutomizedsorting"+" "+cutomizedsorting);
	List<Integer> UpatedMarks=marks.stream().map(i->i+5).collect(Collectors.toList());
	System.out.println(" map"+ " "+UpatedMarks);
	List<Integer> sorted=marks.stream().sorted().collect(Collectors.toList());
	System.out.println(" sorted"+"  "+sorted);
	long noOfFailedStudents=marks.stream().filter(i->i<=35).count();
	System.out.println(" noOfFailedStudents count"+" "+noOfFailedStudents);
	

	}


}
