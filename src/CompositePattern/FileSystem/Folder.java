package CompositePattern.FileSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder extends FileSystemObject {
    private final List<FileSystemObject> fileSystemObjects = new ArrayList<>();

    public Folder(String folderTitle) {
        super(folderTitle);
    }

    @Override
    public void printFileContent() {
        System.out.println(String.format("|---------------|%nCurrent folder: %s%n", super.getTitle()));
        fileSystemObjects.forEach(currentFileSystemObject -> currentFileSystemObject.printFileContent());
    }

    @Override
    public void addSystemObject(FileSystemObject fileSystemObject) {
        fileSystemObjects.add(fileSystemObject);
    }

    @Override
    public FileSystemObject removeSystemObject(FileSystemObject fileSystemObject) {
        FileSystemObject removedFileSystemObject = null;
        Iterator<FileSystemObject> fileSystemObjectIterator = fileSystemObjects.iterator();
        while (fileSystemObjectIterator.hasNext()) {
            if (fileSystemObjectIterator.next().equals(fileSystemObject)) {
                removedFileSystemObject = fileSystemObjectIterator.next();
                fileSystemObjectIterator.remove();
            }
        }
        return removedFileSystemObject;
    }

    @Override
    public FileSystemObject getChild(int child) {
        Iterator<FileSystemObject> fileSystemObjectIterator = fileSystemObjects.iterator();
        FileSystemObject currentFileSystemObject = null;
        int counter = 0;
        while (counter < child && fileSystemObjectIterator.hasNext()) {
            currentFileSystemObject = fileSystemObjectIterator.next();
        }
        return currentFileSystemObject;
    }

    @Override
    public FileSystemObject findFileSystemObject (String title) {
        if (super.getTitle().equals(title)) {
            return this;
        }
        Iterator<FileSystemObject> systemObjectIterator = fileSystemObjects.iterator();
        while (systemObjectIterator.hasNext()) {
            FileSystemObject currentChild = systemObjectIterator.next();
            FileSystemObject result = currentChild.findFileSystemObject(title);
            if (result != null) {
                return result;
            }
        }
        return null;
    }

}
