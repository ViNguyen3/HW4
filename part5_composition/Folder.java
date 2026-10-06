package part5_composition;

import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<Folder> subFolders;
    private ArrayList<File> files;

    public Folder() {
        subFolders = new ArrayList<>();
        files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSubFolder(String subFolderName) {
        Folder subFolder = new Folder();
        subFolder.setName(subFolderName);
        subFolders.add(subFolder);
    }

    public Folder getSubFolder(String subFolderName) {
        for (Folder subFolder : subFolders) {
            if (subFolderName.equals(subFolder.getName())) {
                return subFolder;
            }
        }

        return null;
    }

    public void removeSubFolder(String subFolderName) {
        for (Folder subFolder : subFolders) {
            if (subFolderName.equals(subFolder.getName())) {
                subFolders.remove(subFolder);
                break;
            }
        }
    }

    public void addFile(String fileName) {
        File file = new File(fileName);
        files.add(file);
    }

    public boolean removeFile(File file) {
        return files.remove(file);
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", subFolders=" + subFolders +
                ", files=" + files +
                '}';
    }

    public void printFolderContents() {
        System.out.println(this.toString());
    }
}