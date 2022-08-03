Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		int count=1;
		for(int i=1;i<str.length();i++)
		{
		    if(str.charAt(i-1)==32)
		    {
		        count++;
		    }
		}
		System.out.println(count);