package git_practice;

public class Car{
	String maker;
	int displacement;
	String color;
	
	
	void start(){
		System.out.println("発進します");
	}

	void stop(){
		System.out.println("止まります");
	}

	void curve(){
		System.out.println("曲がります");
	}
	
	
	void showInfo()
	{
		System.out.println("メーカー："+ maker);
		System.out.println("排気量："+ displacement+"cc");
		System.out.println("色："+ color);
	}
}
