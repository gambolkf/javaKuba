package firstExc;

public class hello {

	public static void main(String[] args) {
		if (args.length > 0) 
		{
			int noNum = Integer.parseInt(args[0]);
			System.out.println("Hello!");
			for(int i=0; i < noNum; i++) {
				System.out.println(i);
		} } else {
			System.out.println("ZLE");
		}
	}

}
