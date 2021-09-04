package array;

public class nonPrimitiveArray {

	public static void main(String[] args) {
		
		Student[] studentArray = new Student[5];
		
		studentArray[0] = new Student(1,"amit jana");
		studentArray[1] = new Student(2,"Aryan roy");
		studentArray[2] = new Student(3,"Rahul");
		studentArray[3] = new Student(4,"surya");
		studentArray[4] = new Student(5,"simran jana");
		
		for(int i=0; i<studentArray.length;i++){
			System.out.println("Student roll no. " + studentArray[i].rollNo+ " has name "+ studentArray[i].name);// TODO Auto-generated method stub
		}

	}

}
