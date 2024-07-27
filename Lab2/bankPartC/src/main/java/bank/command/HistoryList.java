package bank.command;

import java.util.ArrayList;
import java.util.Collection;

public class HistoryList {
    private Collection<Command> commandlist = new ArrayList();
    private Collection<Command> undolist = new ArrayList();

    public void undo() {
        if (commandlist.size() > 0) {
            Command commandObject = (Command) ((ArrayList) commandlist).get(commandlist.size() - 1);
            ((ArrayList) commandlist).remove(commandObject);
            commandObject.unExecute();
            undolist.add(commandObject);
        }
    }

    public void redo() {
        if (undolist.size() > 0) {
            Command commandObject = (Command) ((ArrayList) undolist).get(undolist.size() - 1);
            commandObject.execute();
            ((ArrayList) undolist).remove(commandObject);
            commandlist.add(commandObject);
        }

    }

    public void addCommand(Command commandObject){
        commandlist.add(commandObject);
    }
}
