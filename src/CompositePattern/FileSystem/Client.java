package CompositePattern.FileSystem;

import IteratorPattern.menu.Iterator;

import java.time.LocalDate;

public class Client {
    private final String name;
    private final FileSystemObject rootFileSystemObject;

    public Client(String name) {
        this.name = name;
        this.rootFileSystemObject = new Folder("user");
    }

    public void printFileSystem(){
        rootFileSystemObject.printFileContent();
    }

    public void createNewFolder (String folderToAddFolder, String folderTitle) {
        FileSystemObject newFolder = new Folder(folderTitle);
        Folder foundFolder = findFolder(folderToAddFolder);
        if (foundFolder == null) {
            return;
        }
        foundFolder.addSystemObject(newFolder);
    }

    public void createNewFile (String folderToAddFile, String title, String content) {
        FileSystemObject newFile = new File(
                title,
                name,
                LocalDate.now(),
                content
        );
        Folder foundFolder = findFolder(folderToAddFile);
        if (foundFolder == null) {
            return;
        }
        foundFolder.addSystemObject(newFile);
    }

    private Folder findFolder (String folderName) {
        return (Folder) rootFileSystemObject.findFileSystemObject(folderName);
    }

}
