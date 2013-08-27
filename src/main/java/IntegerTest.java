import java.util.ArrayList;




public class IntegerTest {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add("yes");
		int b = 3;
		arr.add(b);
		arr.add('k');
		Object[] k = arr.toArray();
		
		for(int i=0;i<k.length;i++){
			System.out.println(k[i]);
		}
		
		
//		String yes = (String) arr.get(0);
//		Integer cannot be case to String
		Integer in = (Integer) arr.get(1);
		int a = in.intValue();
		System.out.println(arr.get(2));
/*		arr.add(new Point(3,6));
		arr.add(new Point(6,8));
		
		System.out.println(arr);*/
		
		
	}
	
}

class Point{
	int x;
	int y;
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		
	 	
		// TODO Auto-generated method stub
		return "x="+this.x+"y="+this.y;
		
	}
}
