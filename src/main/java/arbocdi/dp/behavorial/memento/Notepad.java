package arbocdi.dp.behavorial.memento;

public class Notepad {
    private String file;
    private StringBuilder content = new StringBuilder();

    public Notepad(String file) {
        this.file = file;
    }

    public Memento create(){
        return new Memento(file,content.toString());
    }

    public void set(Memento memento){
        file = memento.file;
        content = new StringBuilder(memento.content);
    }

    @Override
    public String toString() {
        return "File: " + file + "\n" + "content: " + content.toString();
    }

    public Notepad writeSomeText(String text){
        content.append(text);
        return this;
    }

    public static class Memento {
        private String file;
        private String content;

        private Memento(String file, String content) {
            this.file = file;
            this.content = content;
        }
    }
}
