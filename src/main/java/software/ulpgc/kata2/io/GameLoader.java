package software.ulpgc.kata2.io;

import software.ulpgc.kata2.model.Game;

import java.io.IOException;
import java.util.List;

public interface GameLoader {
    List<Game> load() throws IOException;
}
