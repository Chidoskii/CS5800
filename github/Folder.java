import java.util.ArrayList;

class File {
    String name;
    public File(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Folder {
    private String name;
    private ArrayList<Folder> folders = new ArrayList<>();
    private ArrayList<File> files = new ArrayList<>();
    public Folder(String name) {
        this.name = name;
    }
    public void addFolder(Folder folder) {
        folders.add(folder);
    }
    public void removeFolder(Folder folder) {
        folders.remove(folder);
    }
    public void addFile(File file) {
        files.add(file);
    }
    public void printDirectory(Folder folder) {
        System.out.println( "/" + name);
        if (folder.folders.isEmpty() && folder.files.isEmpty()) {
            return;
        }

        if (folder.folders.size() > 0) {
            for (int i = 0; i < folder.folders.size(); i++) {
                folder.folders.get(i).printDirectory(folder.folders.get(i));

            }
        }
        if (folder.files.size() > 0) {
            for (int i = 0; i < folder.files.size(); i++) {
                System.out.println("-" + folder.files.get(i).getName());
            }
        }
    }
}


