package ssa;
import java.util.*;


public class Student implements Comparable <Student>{ //"implements Comparable" line to be able to sort
	static ArrayList<Student> studentList = null;//made this null and set up an if statement below
	String id; 
	String firstName;
	String lastName;
	String eyeColor; 
	int monthsEmployed; 
	
	public void printRosterHeader(){
		
		System.out.println("Student class roster");
		System.out.println("Empl Id   First name       Last name          Eye color  Months at SSA");
		System.out.println("=======   ================ ================   =========  =============");
	
		Collections.sort(studentList);

		
	
		//for(initializer ; test-expressiong; updater)
		for(Student student:  studentList){
			// - sign makes it left align. also, when you use printf use , instead of +
			System.out.printf("%s    %-16s   %-16s   %-6s     %3d\n", student.getId(), student.getFirstName(), student.getLastName(), student.getEyeColor(), student.getMonthsEmployed());
		}
		
		HashMap<String, Student> StudentDB = new HashMap<String, Student>();
		for(Student astudent : studentList){
			StudentDB.put(astudent.id, astudent);
		}
		Student student = StudentDB.get("001212");
		System.out.println("Student class roster");
		System.out.println("Empl Id   First name       Last name          Eye color  Months at SSA");
		System.out.println("=======   ================ ================   =========  =============");
		System.out.printf("%s    %-16s   %-16s   %-6s     %3d\n", student.getId(), student.getFirstName(), student.getLastName(), student.getEyeColor(), student.getMonthsEmployed());
		 student = StudentDB.get("001449");
		System.out.printf("%s    %-16s   %-16s   %-6s     %3d\n", student.getId(), student.getFirstName(), student.getLastName(), student.getEyeColor(), student.getMonthsEmployed());
		student = StudentDB.get("004444");
		System.out.printf("%s    %-16s   %-16s   %-6s     %3d\n", student.getId(), student.getFirstName(), student.getLastName(), student.getEyeColor(), student.getMonthsEmployed());
		
		
		
}

	
	void Init() {
		
		Student michaelClair = new Student("001122", "Michael", "Clair", "Other", 12);
		studentList.add(michaelClair);		
		Student stephenRock = new Student("001212", "Stephen", "Rook" , "Brown", 11);
		studentList.add(stephenRock);	
		Student jonathanStafford = new Student("474143", "Jonathan", "Stafford" , "Other", 13);
		studentList.add(jonathanStafford);
		Student kyleDeen = new Student("005295", "Kyle", "Deen" , "Blue", 2);
		studentList.add(kyleDeen);
		Student kevinTran = new Student("004400", "Kevin", "Tran" , "Other", 12);
		studentList.add(kevinTran);
		Student reubenTurner = new Student("132617", "Reuben", "Turner" , "Blue", 12);
		studentList.add(reubenTurner);
		Student liLui = new Student("306700", "Li", "Lui" , "Brown", 12);
		studentList.add(liLui);
		Student joshuaFraney = new Student("215296", "Joshua", "Franey" , "Other", 27);
		studentList.add(joshuaFraney);
		Student gabrielHamilton = new Student("523420", "Gabriel", "Hamilton" , "Other", 10);
		studentList.add(gabrielHamilton);
		Student aishaCovington = new Student("004014", "Aisha", "Covington" , "Brown", 10);
		studentList.add(aishaCovington);
		Student arunSoma = new Student("006789", "Arun", "Soma" , "Brown", 2);
		studentList.add(arunSoma);
		Student steveEllwood = new Student("009999", "Steve", "Ellwood" , "Other", 2);
		studentList.add(steveEllwood);
		Student shauilTimmons = new Student("343769", "Shaquil", "Timmons" , "Brown", 11);
		studentList.add(shauilTimmons);
		Student karenReiter = new Student("001449", "Karen", "Reiter" , "Blue", 10);
		studentList.add(karenReiter);
		Student daxRichards = new Student("267252", "Dax", "Richards" , "Brown", 12);
		studentList.add(daxRichards);
		Student mikeSykes = new Student("229949", "Mike", "Sykes" , "Brown", 13);
		studentList.add(mikeSykes);
		Student danielKiros = new Student("772223", "Daniel", "Kiros" , "Brown", 3);
		studentList.add(danielKiros);
		Student peterChoi = new Student("004444", "Peter", "Choi" , "Brown", 2);
		studentList.add(peterChoi);
		Student joeHill = new Student("005255", "Joe", "Hill" , "Brown", 13);
		studentList.add(joeHill);
		Student evanTizard = new Student("008888", "Evan", "Tizard" , "Brown", 12);
		studentList.add(evanTizard);
		
		
	}
	@Override// these 4 lines are to sort
	public int compareTo(Student student){
		return this.firstName.compareTo(student.firstName);
	}
	
	//constructor:
	public Student(String id, String firstName, String lastName, String eyeColor, int monthsEmployed)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eyeColor = eyeColor;
		this.monthsEmployed = monthsEmployed;
	
	}
	
	//constructor for student with no parameters
	public Student(){		
		if(studentList == null){
			studentList = new ArrayList<Student>();
			Init(); //here i am calling the Init method which contains the student data
		}
		
		
	}
	
	public void printClassRoster(){
		printRosterHeader();
		
		
	}
	
	//Getters and Setters:
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public int getMonthsEmployed() {
		return monthsEmployed;
	}
	public void setMonthsEmployed(int monthsEmployed) {
		this.monthsEmployed = monthsEmployed;
	}


	public static ArrayList<Student> getStudentList() {
		return studentList;
	}


	public static void setStudentList(ArrayList<Student> studentList) {
		Student.studentList = studentList;
	}
	
	
			
				
				
	
	

}
