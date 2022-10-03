package arbocdi.dp.behavorial.memento;

public class NotepadCaretaker {
    private Notepad notepad;
    private Notepad.Memento memento;

    public NotepadCaretaker(Notepad notepad) {
        this.notepad = notepad;
    }

    public void save(){
        memento = notepad.create();
    }
    public void load(){
        notepad.set(memento);
    }
}
