import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List n = Arrays.asList("balayya","ntr","kalyanram","tarakram","nun");
		System.out.println("filtered list");
		n.stream().filter( x->((String)x).length()>7).forEach(x->{
			System.out.println(x);
		});
		
		
		Predicate   p1= (n1) -> ((String) n1).startsWith("b");
		Predicate p2= (n2)-> ((String) n2).length()>3;
		System.out.println(" un filtered list");		
		n.stream().filter(p2.and(p2)).forEach(n1->{
			System.out.println(n1);
		});
		

	}

}
