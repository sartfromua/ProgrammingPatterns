package lab_13.task01;

public class ImageGallery {

    public static void main(String[] args) {
        // якщо виникає помилка завантаження, замініть відносний шлях на абсотютний шлях!
        String path = "D:\\IdeaProjects\\ProgrammingPatterns\\src\\lab_13\\task01\\resources\\";

//        DisplayObject[] images = {
//                new ImageFile(path + "image1.jpeg"),  //
//                new ImageFile(path + "image2.jpeg"),  //
//                new ImageFile(path + "image3.jpeg"),  //
//                new ImageFile(path + "image4.jpeg"),  //
//                new ImageFile(path + "image5.jpeg"),  //
//                new ImageFile(path + "image6.jpeg"),  //
//                new ImageFile(path + "image7.jpeg"),  //
//                new ImageFile(path + "image8.jpeg"),  //
//                new ImageFile(path + "image9.jpeg"),  //
//                new ImageFile(path + "image10.jpeg"),  // ,
//        };

        DisplayObject[] images = {
                new ImageProxy(path + "image1.jpeg"),  //
                new ImageProxy(path + "image2.jpeg"),  //
                new ImageProxy(path + "image3.jpeg"),  //
                new ImageProxy(path + "image4.jpeg"),  //
                new ImageProxy(path + "image5.jpeg"),  //
                new ImageProxy(path + "image6.jpeg"),  //
                new ImageProxy(path + "image7.jpeg"),  //
                new ImageProxy(path + "image8.jpeg"),  //
                new ImageProxy(path + "image9.jpeg"),  //
                new ImageProxy(path + "image10.jpeg"),  // ,
        };

        for (DisplayObject image : images) {
            image.display();
        }

    }

}
