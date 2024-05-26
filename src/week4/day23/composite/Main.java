package week4.day23.composite;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");
        FileSystemComponent file3 = new File("file3.jpg");

        Directory directory1 = new Directory("Documents");
        Directory directory2 = new Directory("Images");

        directory1.addComponent(file1);
        directory1.addComponent(file2);

        directory2.addComponent(file3);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(directory1);
        rootDirectory.addComponent(directory2);

        rootDirectory.showDetails();
    }
}
