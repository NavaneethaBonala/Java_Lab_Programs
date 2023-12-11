package lab_17_Threading1;// User defined Package
public class Threading {// Class declaration

	//Main method
	public static void main(String[] args) {
		
		String[] s= {"sai", "niveditha", "lakshmi","mamatha", "Varun"};
		String[] s1= {"Tapaswi", "charith", "satheesh","afrean", "Vaishanvi"};
		
		DisplayNameThread d1 = new DisplayNameThread(s);
		DisplayNameThread d2 = new DisplayNameThread(s1);
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		
		t1.start();
		t2.start();		
	}
}
