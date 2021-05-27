
class Animal
{
}
class Monkey extends Animal
{
}
class Ove
{
	public void m1(Animal a)
	{
		System.out.println("Animal version");
	}
	public void m1(Monkey m1)
	{
		System.out.println("Monkey version ");
	}
	public static void main(String args[])
	{
		Ove o= new Ove();
		Animal a = new Animal();
		o.m1(a);
		Monkey m = new Monkey();
		o.m1(m);
		Animal mx= new Monkey();
		o.m1(mx);
	}
}

