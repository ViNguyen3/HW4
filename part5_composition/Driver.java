package part5_composition;

public class Driver {
    public static void main(String[] args) {

        Folder phpDemo1 = new Folder();
        phpDemo1.setName("php_demo1");

        // Main folders
        phpDemo1.addSubFolder("Source Files");
        phpDemo1.addSubFolder("Include Path");
        phpDemo1.addSubFolder("Remote Files");

        // Source Files folders
        Folder sourceFiles = phpDemo1.getSubFolder("Source Files");

        sourceFiles.addSubFolder(".phalcon");
        sourceFiles.addSubFolder("app");
        sourceFiles.addSubFolder("cache");
        sourceFiles.addSubFolder("public");

        // app folders
        Folder app = sourceFiles.getSubFolder("app");

        app.addSubFolder("config");
        app.addSubFolder("controllers");
        app.addSubFolder("library");
        app.addSubFolder("migrations");
        app.addSubFolder("models");
        app.addSubFolder("views");

        // public files
        Folder publicFolder = sourceFiles.getSubFolder("public");

        publicFolder.addFile(".htaccess");
        publicFolder.addFile(".htrouter.php");
        publicFolder.addFile("index.html");

        // Step 1
        System.out.println("Complete File System");
        phpDemo1.printFolderContents();

        System.out.println();

        // Step 2
        System.out.println("After app Folder removal");
        sourceFiles.removeSubFolder("app");
        phpDemo1.printFolderContents();

        System.out.println();

        // Step 3
        System.out.println("After public Folder removal");
        sourceFiles.removeSubFolder("public");
        phpDemo1.printFolderContents();
    }
}