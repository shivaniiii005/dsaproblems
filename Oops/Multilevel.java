package Oops;

public class Multilevel {

    public interface Camera {
        void takePhoto();
    }
    public interface MusicPlayer {
        void playMusic();
    }
    public static class phone implements Camera, MusicPlayer {

        public void takePhoto() {
            System.out.println("Photo clicked");
        }
        public void playMusic() {
            System.out.println("Music playing");
        }
    }

    public static void main(String[] args) {
        phone p = new phone();
        p.takePhoto();
        p.playMusic();
    }
}
