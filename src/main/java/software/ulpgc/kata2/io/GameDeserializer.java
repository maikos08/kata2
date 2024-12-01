package software.ulpgc.kata2.io;

import software.ulpgc.kata2.model.Game;

public interface GameDeserializer {
    Game deserialize(String text);
}
