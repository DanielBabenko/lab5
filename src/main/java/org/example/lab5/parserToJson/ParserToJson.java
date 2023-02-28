package org.example.lab5.parserToJson;

import com.google.gson.Gson;
import org.example.lab5.LabWork;
import org.example.lab5.exceptions.InvalidFieldY;
import org.example.lab5.exceptions.NullX;
import org.example.lab5.features.Coordinates;
import org.example.lab5.features.Person;
import org.example.lab5.features.enums.Color;
import org.example.lab5.features.enums.Difficulty;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;

public class ParserToJson {

    public LabWork addToList(String name, int mP, int tIW, String difficulty, int x, double y, String nameAuthor, String color, float height, String bd) throws NullX, InvalidFieldY {
        LabWork lab = new LabWork(name, mP, tIW, Difficulty.valueOf(difficulty), new Coordinates(x, y), new Person(nameAuthor, Color.valueOf(color), height, bd));
        return lab;
    }

    public void serialization(HashSet<LabWork> labs){
        Gson gson = new Gson();

        String result = gson.toJson(labs);

        try (FileOutputStream out = new FileOutputStream("notes.json", true);

             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            // перевод строки в байты
            byte[] buffer = result.getBytes();
            bos.write(buffer, 0, buffer.length);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
