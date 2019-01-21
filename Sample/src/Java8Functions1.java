import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8Functions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String>  t = Arrays.asList("balayya","legend","ntr","aditya369");
		
		
		List n = new ArrayList();
		n.add(2);
		n.add("sai");
		
		System.out.println(n);
		System.out.println();
		//() -> System.Out.Println ("lambda test");
		
		/*for (String t1 : t)
		{
			System.out.println ("lambda test"+ t1);
		*/
		
		filter(t, (str)-> ((String) str).startsWith("a"));
		filter(t, str->((String)str).endsWith("d") );
		//t.forEach(n -> System.out.println (n) );
		
		//t.forEach( System.out::println  );
		
		

	}

	
	public static void filter(List <String> names, Predicate condition){
		
		//names.forEach((name)-> condition.test(name).System.out.println(name)
		
			
				
				names.stream().filter( (name) -> (condition.test(name))).forEach( (name)-> {
					System.out.println(name);
				});
		
		for (String name: names)
		{
			if(condition.test(name))
				System.out.println(name);
		}
		
		
	}
}
