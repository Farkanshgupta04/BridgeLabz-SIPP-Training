class State {
    String content;
    State prev, next;

    public State(String content) {
        this.content = content;
    }
}

class EditorHistory {
    State current;
    int size = 0;
    final int MAX_HISTORY = 10;

    void performAction(String newText) {
        State newState = new State(newText);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;
        trimHistory();
    }

    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    void displayCurrent() {
        System.out.println("Current Content: " + (current != null ? current.content : "Empty"));
    }

    void trimHistory() {
       
        int count = 0;
        State temp = current;
        while (temp != null && count < MAX_HISTORY) {
            temp = temp.prev;
            count++;
        }
        if (temp != null) temp.prev = null;
    }
}

public class TextEditorApp {
    public static void main(String[] args) {
        EditorHistory editor = new EditorHistory();

        editor.performAction("Hello");
        editor.performAction("Hello World");
        editor.performAction("Hello World!");

        editor.displayCurrent(); 

        System.out.println("Undo...");
        editor.undo();
        editor.displayCurrent(); 

        System.out.println("Redo...");
        editor.redo();
        editor.displayCurrent();
    }
}