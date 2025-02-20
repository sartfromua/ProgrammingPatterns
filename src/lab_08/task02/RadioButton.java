package lab_08.task02;

public class RadioButton extends Button {

	RadioButton(Size size) {
		this.size = size;
	}

	public void draw() {
		super.draw();
		System.out.println("Drawing a radio button.\n");
	}

}
