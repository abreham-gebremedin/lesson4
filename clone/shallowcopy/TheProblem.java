package  shallowcopy;

//a change in the copy changes the original object
public class TheProblem {
	public static void main(String[] args) {
		Job joesjob = new Job(40, "Carpenter");
		Person joe = new Person("Joe", joesjob);
		System.out.println(joe);
		try {
 
			Person joecopy = (Person) joe.clone(); //copy of joe using clone
			System.out.println(joecopy);
			// modifies original object!
			joecopy.job.typeOfJob = "Painter";
			joecopy.name="Abebe";
			 
			System.out.println(joe);
			System.out.println(joecopy);

			/*the orginal joe become a painter, that is shallow copy give the copy of the reference both the orginal and the copybecome the 
			same objects and there si only a single reference
			this is the shortcomeing of the shallow copy*/
		} catch (CloneNotSupportedException e) {
			//handle
		}
	}

}
