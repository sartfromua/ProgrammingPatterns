package lab_08.task02;

public class CheckboxButton extends Button {

	CheckboxButton(Size size) {
		this.size = size;
	}

	public void draw() {
		super.draw();
		System.out.println("Drawing a checkbox button.\n");
	}

}
