package software.ulpgc.kata2;

import software.ulpgc.kata2.io.CsvGameDeserializer;
import software.ulpgc.kata2.io.FileGameLoader;
import software.ulpgc.kata2.model.Game;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\Universidad\\3º\\IS2\\Practicas\\kata2\\Videogames sales dataset\\vgsales.csv");
        List<Game> games = new FileGameLoader(file, new CsvGameDeserializer()).load();
        TreeMap<Game.Platform, Integer> platformsCount = games.stream()
                .collect(Collectors.toMap(
                        Game::platform,
                        game -> 1,
                        Integer::sum,
                        TreeMap::new
                ));
        platformsCount.forEach((key, value) -> {
            System.out.println("Platform: "+ key + "\tCount: " + value);
        });
    }
}
