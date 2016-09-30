package _15_Inheritance_Polymorphism;

public class Mouse extends Animal {
		public boolean isSqueaking;
		
		@Override
		public void speak(){
			System.out.println("I love Cheese!");
			
		
		}
		
		@Override
		public void printFood(){
			System.out.println("Cheese");
		
		}

}
