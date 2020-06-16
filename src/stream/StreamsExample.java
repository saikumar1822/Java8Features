package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		System.out.println(list);
	List<Integer> list2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(list2);

*************************************************************************
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
