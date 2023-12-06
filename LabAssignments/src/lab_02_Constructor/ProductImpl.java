package lab_02_Constructor;

public class ProductImpl {
	public static void main(String[] args) {

		Product p1 = new Product();

		p1.setPid(100);
		p1.setDescription("Samsung a20 Mobile");
		p1.setPrice(23000);

		System.out.println(p1.getPid() + " " + p1.getDescription() + " " + p1.getPrice());

		p1.setPid(101);
		p1.setDescription("Samsung A30");
		p1.setPrice(30000);

		System.out.println(p1.getPid() + " " + p1.getDescription() + " " + p1.getPrice());
	}
}