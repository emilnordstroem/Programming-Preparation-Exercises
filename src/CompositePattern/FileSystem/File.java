package CompositePattern.FileSystem;

import java.time.LocalDate;

public class File extends FileSystemObject {
    private final String createdByClient;
    private final LocalDate createdOnDate;
    private String content;

    public File(String fileTitle, String createdByClient, LocalDate createdOnDate, String content) {
        super(fileTitle);
        this.createdByClient = createdByClient;
        this.createdOnDate = createdOnDate;
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void printFileContent() {
        System.out.println(
                String.format("------------------------%n%s%nCreated by %s (%s)%n%s",
                    super.getTitle(),
                    createdByClient,
                    createdOnDate,
                    content
                )
        );
    }

    @Override
    public FileSystemObject findFileSystemObject(String title) {
        if (super.getTitle().equals(title)) {
            return this;
        }
        return null;
    }
}
