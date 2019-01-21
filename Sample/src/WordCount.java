import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "During the mark phase all objects that are reachable from Java threads, native handles and other root sources are marked as alive, as well as the objects that are reachable from these objects and so forth. This process identifies and marks all objects that are still used, and the rest can be considered garbage.";
		
		
	
		String [] s1= s.split(" ");
		
		
		List l =  Arrays.asList(s1);
		
		
		HashMap<String,Long> hm= new HashMap<String,Long>();
		//jl.stream().forEach(k -> System.out.println(k)) ;
		
		System.out.println(l.stream().collect(Collectors.counting()));
		hm=(HashMap<String, Long>) l.stream().collect(Collectors.groupingBy(name->name ,Collectors.counting()));
		
		hm.forEach((k,v)->System.out.println(" "+k+" "+v));
		

	}

}
