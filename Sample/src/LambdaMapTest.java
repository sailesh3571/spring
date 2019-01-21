import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List n = Arrays.asList("balayya","ntr","kalyanram","tarakram","nun");
		
		List n3=Arrays.asList(1,22,2,4,9,56);
		Collections.sort(n3);
	List <String>n2=	(List<String>) n.stream().map(x->((String)x).toUpperCase()).collect(Collectors.toList());
	System.out.println(n2);
	System.out.println(n3);

	}

}
