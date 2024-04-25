public class Player {
    public static void main(String[] args) {

        MediaController mediaController = new MediaController();

        mediaController.playMedia(new MusicPlayer());
        mediaController.playMedia(new VideoPlayer());
    }
}
