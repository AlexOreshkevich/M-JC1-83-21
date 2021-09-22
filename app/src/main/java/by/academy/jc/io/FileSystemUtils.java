package by.academy.jc.io;

public class FileSystemUtils {

    public static String getResourcePath(String resourceName) {
        return FileSystemUtils.class.getClassLoader().getResource(resourceName).getFile();
    }

    public static String obtainResourcePath(String newFileName) {
        return "app/src/main/resources/" + newFileName;
    }
}
