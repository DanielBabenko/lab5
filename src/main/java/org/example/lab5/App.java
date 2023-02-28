package org.example.lab5;

import org.example.lab5.exceptions.InvalidFieldY;
import org.example.lab5.exceptions.NullX;
import org.example.lab5.parserFromJson.Root;
import org.example.lab5.workWithCollections.*;
import org.example.lab5.parserToJson.ParserToJson;

import java.util.*;

/**
 * Kernel Class of this program by ...
 */

public class App {

    public static void main(String[] args) throws NullX, InvalidFieldY {

        Root root = new Root();

        //to Json
        ParserToJson inJson = new ParserToJson();

        LabWork lab1 = inJson.createLabWork("Rim", 123, 12, "EASY", 11, 12.3, "Nikita", "GREEN", 224, "23-05-2004");
        LabWork lab2 = inJson.createLabWork("Rim21", 123, 121, "EASY", 11, 12.3, "George", "GREEN", 224, "23-05-2004");
        LabWork lab3 = inJson.createLabWork("Ri342m21", 123423, 4312, "EASY", 11, 12.3, "Daniel", "GREEN", 224, "23-05-2004");

        Command addEl = new AddNewElementCommand(root);
        Add a = new Add(addEl);

        Command showLabs = new ShowTheCollectionCommand(root);
        Show s = new Show(showLabs);

        IDCommand removeEl = new RemoveElementByIDCommand(root);
        Remove r = new Remove(removeEl);

        Command clearLabs = new ClearTheCollectionCommand(root);
        Clear c = new Clear(clearLabs);

        Command printTiW = new PrintUniqueTiWCommand(root);
        UniqueTiW unique = new UniqueTiW(printTiW);

        Command sortTiW = new PrintSortedTiWCommand(root);
        SortedTiW sort = new SortedTiW(sortTiW);

        Command maxByAuthor = new MaxByAuthorCommand(root);
        AuthorMaximization author = new AuthorMaximization(maxByAuthor);

        ElementCommand addElIfMax = new AddIfMaxCommand(root);
        AddIfMax addMax = new AddIfMax(addElIfMax);

        ElementCommand removeGreaterEl = new RemoveGreaterElementCommand(root);
        RemoveGreater greater = new RemoveGreater(removeGreaterEl);

        ElementCommand removeLowerEl = new RemoveLowerElementCommand(root);
        RemoveLower lower = new RemoveLower(removeLowerEl);

        UpdateCommand updateEl = new UpdateElementCommand(root);
        Update update = new Update(updateEl);

        a.add(lab1);
        a.add(lab2);
        addMax.addIfMax(lab3);

        Map<String, Command> commands = new HashMap<>();
        commands.put(clearLabs)

        //greater.removeGreater(lab2);
        //lower.removeLower(lab2);

        //update.update(2,lab3);

        //unique.printUniqueTunedInWorks();
        //sort.printFieldAscendingTunedInWorks();
        //author.maxByAuthor();

        /* Map<String, Invoker> commands = new HashMap<>();
        commands.put("show",s);
        commands.put("max_by_author",author);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            for(Map.Entry<String, Invoker> entry: commands.entrySet()) {
                String key = entry.getKey();
                if ((line = reader.readLine()).equals(key)){
                    entry.getValue().doSomething();
                    break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}
