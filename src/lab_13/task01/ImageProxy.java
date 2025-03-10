package lab_13.task01;

import java.awt.*;

public class ImageProxy implements DisplayObject {

	private DisplayObject imageFile;
	private String path;

	public ImageProxy(String path) {
		this.path = path;
	}

	@Override
	public void display() {
		if (imageFile == null) {
			imageFile = new ImageFile(path);
		}
		imageFile.display();
	}
}
