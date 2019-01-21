import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List s= (List) Arrays.asList("3","4","6");
		String  s1 = s.stream().map( i -> (i-1)).reduce("", String::concat);
		

	}
	public Callable fetch() {
		return () -> "Tricky example ;-)";
		}

}
