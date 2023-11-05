import javax.swing.JOptionPane;
public class Dog_demo {
	private static void main(String[] args ) {
		Dog woofer = new Dog();
		Poodle yipper = new Poodle();
		woofer.showMessage("Woof");
		yipper.showMessage("Yip");
		bark(yipper);
		
	}
	
	private static void bark(Dog param) {
		param.showMessage("I'm hungry! Feed me !");
	}

}
