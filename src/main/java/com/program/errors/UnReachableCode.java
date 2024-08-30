package com.program.errors;

class UnReachableCode {
	public static void main(String args[])
	{

		System.out.println("I will get printed");

		return;

		// it will never run and gives error
		// as unreachable code.
		//System.out.println("I want to get printed");
	}

	public  void main1(String args[])
	{
		int a = 2;
		for (;;) {

			if (a == 2)
			{
				break;
				// it will never execute, so
				// same error will be there.
				//System.out.println("I want to get printed");
			}
		}
	}

	public static void main2(String args[])
	{

		try {
			throw new Exception("Custom Exception");
			// Unreachable code
			//System.out.println("Hello");
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public static void main3(String args[])
	{
		for (int i = 0; i < 5; i++)
		{
			continue;
			//System.out.println("Hello");
		}
	}
}
