package javapractice;

public class Hellojava {
	public static void main(String[] args) {
		printName("Udit garg");
	}
        
        public static void printName(String name){
		if(name ==null){
		System.out.println("Name cant be null");
		}
		else{
                 System.out.println(name);
		}
        }
}
