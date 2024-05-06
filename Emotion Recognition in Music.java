import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Enum to represent different emotions
enum Emotion {
    HAPPY,
    SAD,
    ANGRY,
    CALM,
    EXCITED
}

// Class to represent a music track
class MusicTrack {
    private String title;
    private String artist;
    private double[] audioFeatures; // Audio features such as tempo, energy, etc.

    public MusicTrack(String title, String artist, double[] audioFeatures) {
        this.title = title;
        this.artist = artist;
        this.audioFeatures = audioFeatures;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double[] getAudioFeatures() {
        return audioFeatures;
    }
}

// Class to represent the Emotion Recognition system
public class EmotionRecognitionInMusic {
    private Map<String, Emotion> emotionMap; // Map of music track titles to emotions

    public EmotionRecognitionInMusic() {
        this.emotionMap = new HashMap<>();
        // Initialize with dummy data for demonstration purposes
        emotionMap.put("Track1", Emotion.HAPPY);
        emotionMap.put("Track2", Emotion.SAD);
        emotionMap.put("Track3", Emotion.ANGRY);
        // Add more music tracks and corresponding emotions as needed
    }

    // Method to recognize emotion in a music track
    public Emotion recognizeEmotion(MusicTrack musicTrack) {
        // For demonstration purposes, let's assume a simple algorithm based on audio features
        double[] audioFeatures = musicTrack.getAudioFeatures();
        // Here, you would typically use machine learning models to analyze audio features and recognize emotions
        // For simplicity, let's just return a random emotion for demonstration
        return Emotion.values()[(int) (Math.random() * Emotion.values().length)];
    }

    public static void main(String[] args) {
        EmotionRecognitionInMusic emotionRecognition = new EmotionRecognitionInMusic();
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a music track title
        System.out.print("Enter the title of the music track: ");
        String title = scanner.nextLine();

        // For demonstration purposes, let's assume the audio features are precomputed and provided
        double[] audioFeatures = {0.6, 0.8, 0.4}; // Example audio features (tempo, energy, etc.)
        MusicTrack musicTrack = new MusicTrack(title, "Artist", audioFeatures);

        // Recognize the emotion in the music track
        Emotion emotion = emotionRecognition.recognizeEmotion(musicTrack);
        System.out.println("Emotion recognized in " + title + ": " + emotion);

        scanner.close();
    }
}
