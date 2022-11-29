package  deepcopy;

public class Person implements Cloneable {
	String name;
	Job job;

	public Person(String name, Job j) {
		this.name = name;
		job = j;
	}

	public String toString() {
		return "name: " + name + ", job: [" + job + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// creates a deep copy
		Person pcopy = (Person) super.clone(); //shallow copy
		//pcopy.job= new job(pcopy.numHours, job.typeOfJob) /**other simple way of doing the clone*/
		pcopy.job = (Job) job.clone(); //this copy won't affect the orginal 
		
		
		return pcopy;
	}
}
