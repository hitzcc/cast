package test;

public class Inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inc inc = new Inc();
		int i = 0;
		inc.change(i);
		i = i++;
		System.out.println(i);
	}
	
	public void change(int i)
	{
		i++;
	}

}
