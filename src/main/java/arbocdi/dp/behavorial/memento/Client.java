package arbocdi.dp.behavorial.memento;

public class Client {
    public static void main(String[] args) {
        Notepad notepad = new Notepad("memento.txt");
        NotepadCaretaker caretaker = new NotepadCaretaker(notepad);
        notepad.writeSomeText("Im currently learning: ");
        caretaker.save();
        notepad.writeSomeText("Java");
        System.out.println(notepad);
        caretaker.load();
        notepad.writeSomeText("Spring");
        System.out.println(notepad);
    }
}
