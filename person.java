
public class person {

	public static void main(String[] args) {
		mobile m1 = new mobile();
		m1.call();
		mobile smartphone = new mobile()
				{
			      public void call()
			      {
			    	  System.out.println("video call ,global call");
			      }
				};
				smartphone.call();

	}

}
