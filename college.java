
public class college {
	static String principalname = "abcd";
	 int fee = 30000;
	int fine =1;
	boolean uniform = false;

	public static void main(String[] args) 
	{
		college principal = new college();
		principal.creatDepart();
			
	}
	
	public  void creatDepart()
	
	{
		int depfee =100;
		System.out.println(depfee);
		 depfee =40;
		System.out.println(depfee);
		System.out.println("Settings teams for departments");
		class dept
		{
			public void innagruate(int i)
			{
				System.out.println(i);
				System.out.println("Department started");
				System.out.println(principalname);
			 depfee =80;
				System.out.println(depfee);
			}

			
		}
		 dept hod = new  dept();
		 hod.innagruate(10000);
	}

}
