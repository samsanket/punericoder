class F
{
	void show(double f, int i)
	{
		System.out.println("FLOAT INT");
	}
	void show(int i , double f)
	{
		System.out.println("INT FLOAT");
	}
	public static void main(String args[])
	{
		F fx= new F();
		fx.show(10.0f,10);
		fx.show(10,10.0f);
		//fx.show(10.0f,10.0f);
		//fx.show(10,10);
	}
}
