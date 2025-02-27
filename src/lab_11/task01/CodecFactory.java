package lab_11.task01;

/**
 * Фабрика для створення відеокодека, яким стиснуто відеофайл
 */
public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            return new MPEG4CompressionCodec();
        } else {
            return new OggCompressionCodec();
        }
    }
}