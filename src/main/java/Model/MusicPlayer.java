package Model;

import BD.Canciones;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.JavaSoundAudioDevice;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class MusicPlayer implements Runnable {

    private Player player;
    Thread musicThread;
    /**
     * Método para la reproducción de la música.
     * @param filenames
     */
    public void playMusic(List<String> filenames) {
        try {
            for (String filename : filenames) {
                /**
                 * Cargar el archivo de música
                 */
                FileInputStream fileInputStream = new FileInputStream(filename);

                /**
                 * Crear un objeto Player y un objeto AudioDevice para la reproducción de la música
                 */
                AudioDevice audioDevice = new JavaSoundAudioDevice();
                player = new Player(fileInputStream, audioDevice);

                /**
                 * Iniciar un nuevo hilo para la reproducción de la música
                 */
                musicThread = new Thread(this);
                musicThread.start();

                /**
                 * Esperar a que el hilo de música termine antes de continuar con el siguiente archivo
                 */
                musicThread.join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Implementar el método run() de la interfaz Runnable para la reproducción de la música en segundo plano
     */
    public void run() {
        try {
            /**
             * Reproducir la música
             */
            player.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

    /**
     * Para la reproducción de musica
     */
    public void stop() {
        player.close();
    }
}
