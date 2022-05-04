package Ch12;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFileClass {
    public static void main(String[] args) throws IOException {
        File file = new File("image/us.txt");
        File file1 = new File("image/you.txt");
        File file2 = new File("image1");
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isAbsolute());
        System.out.println(file.isHidden());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.length() + " bytes");
        System.out.println(file.lastModified());
        System.out.println(new Date(file.lastModified()));
        System.out.println(file.renameTo(file1));
        System.out.println(file2.mkdir());
        System.out.println(file2.delete());
    }
}
