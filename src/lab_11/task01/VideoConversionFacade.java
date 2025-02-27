package lab_11.task01;

public class VideoConversionFacade {
	public VideoFile convert(VideoFile videoFile) {
		Codec sourceCodec = CodecFactory.extract(videoFile);

		Codec destinationCodec = new MPEG4CompressionCodec();
		Buffer buffer = BitrateReader.read(videoFile, sourceCodec);
		VideoFile videoFileConverted = BitrateReader.convert(buffer, videoFile.getName(), destinationCodec);
		AudioMixer audioMixer = new AudioMixer();
		audioMixer.fix(videoFileConverted, videoFile.getAudioBuffer());
		return videoFileConverted;
	}
}
