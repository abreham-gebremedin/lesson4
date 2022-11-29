package sameclass.theproblem;

class PersonWithJobWithCounter extends PersonWithJob {
	@SuppressWarnings("unused")
	static private int counter=0;

	PersonWithJobWithCounter(String n, double s) {
		super(n, s);
		counter++;
	}
}
