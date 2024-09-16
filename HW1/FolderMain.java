public class FolderMain {
    public static void main(String[] args) {
        Folder folder1 = new Folder("php demo1");
        Folder folder2 = new Folder("Source Files");
        Folder folder3 = new Folder(".phalcon");
        Folder folder4 = new Folder("app");
        Folder folder5 = new Folder("config");
        Folder folder6 = new Folder("controllers");
        Folder folder7 = new Folder("library");
        Folder folder8 = new Folder("migrations");
        Folder folder9 = new Folder("models");
        Folder folder10 = new Folder("views");
        Folder folder11 = new Folder("cache");
        Folder folder12 = new Folder("public");
        Folder folder13 = new Folder("Include Path");
        Folder folder14 = new Folder("Remote Files");
        File file1 = new File(".htaccess");
        File file2 = new File(".htrouter.php");
        File file3 = new File("index.html");

        folder1.addFolder(folder2);
        folder2.addFolder(folder3);
        folder2.addFolder(folder4);
        folder4.addFolder(folder5);
        folder4.addFolder(folder6);
        folder4.addFolder(folder7);
        folder4.addFolder(folder8);
        folder4.addFolder(folder9);
        folder4.addFolder(folder10);
        folder2.addFolder(folder11);
        folder2.addFolder(folder12);
        folder1.addFolder(folder13);
        folder1.addFolder(folder14);
        folder12.addFile(file1);
        folder12.addFile(file2);
        folder12.addFile(file3);

        System.out.println("-----------------Initial php demo1 Directory-------------------");
        folder1.printDirectory(folder1);
        System.out.println("\n ~Removing the 'app' folder~ \n");
        folder2.removeFolder(folder4);
        System.out.println("--------------Final State of php demo1 Directory----------------");
        folder1.printDirectory(folder1);
    }
}
