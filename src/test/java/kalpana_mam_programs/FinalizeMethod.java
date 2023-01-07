package kalpana_mam_programs;

public class FinalizeMethod {

	int a = 100;
	int b = 200;

	@Override
	protected void finalize() throws Throwable {

		System.out.println("Object is destoyed");

	}

	public static void main(String[] args) {
		FinalizeMethod ob = new FinalizeMethod();
		ob = new FinalizeMethod();
		ob = null;
		ob = new FinalizeMethod();
		ob = new FinalizeMethod();

//		FinalizeMethod ob1 = new FinalizeMethod();
//		ob1 = null;
//		ob1 = new FinalizeMethod();
		System.gc();

	}

}
