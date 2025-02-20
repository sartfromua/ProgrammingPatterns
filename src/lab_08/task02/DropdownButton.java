package lab_08.task02;

public class DropdownButton extends Button {

	DropdownButton(Size size) {
		this.size = size;
	}

	public void draw() {
		super.draw();
		System.out.println("Drawing a dropdown button.\n");
	}

}
