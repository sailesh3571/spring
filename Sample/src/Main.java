import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Main extends Main1 {
	public int ch=6;
	public void show(){
		
		System.out.println(ch);
		
	}
public void show(int a ,int b){
		
		System.out.println("int");
		
	}
public void show(double a ,double b){
	
	System.out.println("double");
	
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String m2= "HELLO SUN";
		String m3= "HELLO SUN";
		
		if (m2==m3)
		{
			System.out.println("equal");
			
			
		}
		
		if(m2.equals(m3))
			
		{
			System.out.println("equal1");
		}
		/*//m2.replace("i", "l");
		m2.toLowerCase();
		System.out.println(m2);
		*/
		/*Main m = new Main ();
		String [] mo ={"xt","xy"};
		System.out.println(mo[1]);
		
		List l = new ArrayList();
		l.add(10);
		System.out.println(l.add(20));
		TreeMap t = new TreeMap();
		t.put(10, 20);*/
		/*t.put(11, 21);
		System.out.println(t.get(10));
		System.out.println(t);*/
		
		
		/*m.show(1,2);
		m.show();
		m.show(12.4,12.5);*/
	}

}
