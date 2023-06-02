package Testing;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Whatevs {

    public void whatevsMusic() {
        File musicFolder = new File("src\\music");
        File[] musicFiles = musicFolder.listFiles((dir, name) -> name.endsWith(".mp3"));

        // Crear una lista de nombres de archivos
        List<String> filenames = new ArrayList<>();
        for (File file : musicFiles) {
            filenames.add(file.getAbsolutePath());
        }

        // Crear un objeto MusicPlayer y reproducir la música en segundo plano
        MusicPlayer musicPlayer = new MusicPlayer();
        Thread musicThread = new Thread(() -> musicPlayer.playMusic(filenames));
        musicThread.start();
    }
}
