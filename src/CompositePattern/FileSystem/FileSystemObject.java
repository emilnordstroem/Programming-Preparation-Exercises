package CompositePattern.FileSystem;

public abstract class FileSystemObject {
    private String title;

    public FileSystemObject(String title) {
        this.title = title;
    }

    public String getTitle () {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void printFileContent () {
        throw new UnsupportedOperationException();
    }
    public void addSystemObject (FileSystemObject systemObject) {
        throw new UnsupportedOperationException();
    }
    public FileSystemObject removeSystemObject (FileSystemObject systemObject) {
        throw new UnsupportedOperationException();
    }
    public FileSystemObject getChild (int child) {
        throw new UnsupportedOperationException();
    }
    public FileSystemObject findFileSystemObject (String title) {
        throw new UnsupportedOperationException();
    }

}
