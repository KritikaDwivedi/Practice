package tests;

	public class finalStaticConcept {
	
	public static final String Pi;
	
	//Static block
	static {
		Pi="kritika";
		System.out.println(Pi);
	}
	
	private finalStaticConcept(String a, String b) {
		System.out.println("Private constructor");
	}
	
	//constructor
	public finalStaticConcept(){
		this("","");
		System.out.println("Constructor");
	}


	{//Instance Block
		System.out.println("printing IIb");
	}
	
	public static void main(String[] args) {
	new finalStaticConcept();
	
	}
}	
	class callConstructor extends finalStaticConcept{
	
		public callConstructor() {
		}
		
	}
