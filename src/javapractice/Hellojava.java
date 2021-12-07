package javapractice;

public class Hellojava {
	public static void main(String[] args) {
		printName("Udit garg");
                System.out.println("HELLO WORLD");
	}
        
        public static void printName(String name){
		if(name ==null){
		System.out.println("Name cant be null");
		}
		else{
                 System.out.println(name);
		}
                System.out.println("HELLO WORLD");
        }
}
