import java.io.File;
import java.io.IOException;

public class ShellCommandHandler {
    private File currentDirectory;

    public File getCurrentDirectory() {
        return currentDirectory;
    }


    public ShellCommandHandler() {
        currentDirectory = new File(System.getProperty("user.dir"));
    }

    public void printWorkingDirectory() {
        System.out.println(currentDirectory.getAbsolutePath());
    }

    public void listDirectory() {
        File[] files = currentDirectory.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("Directory is empty.");
        } else {
            for (int i = 0; i < files.length; i++) {
                File f = files[i];  // Here 'f' is defined as a local variable within the loop.

                if (f.isDirectory()) {
                    System.out.println("[DIR] " + f.getName());
                } else {
                    System.out.println("[FILE] " + f.getName());
                }
            }
        }
    }

    public void changeDirectory(String name) {
        if (name == null) {
            System.out.println("Usage: cd [directory_name]");
        } else if (name.equals("..")) {
            File parent = currentDirectory.getParentFile();
            if (parent != null && parent.isDirectory()) {
                currentDirectory = parent;
            } else {
                System.out.println("Already at the root directory.");
            }
        } else {
            File newDir = new File(currentDirectory, name);
            if (newDir.exists() && newDir.isDirectory()) {
                currentDirectory = newDir;
            } else {
                System.out.println("Directory not found: " + name);
            }
        }
    }

    public void makeDirectory(String name) {
        if (name == null) {
            System.out.println("Usage: mkdir [directory_name]");
        } else {
            File newDir = new File(currentDirectory, name);
            if (newDir.exists()) {
                System.out.println("Directory already exists.");
            } else {
                boolean created = newDir.mkdir();

                if (created) {
                    System.out.println("Directory created: " + name);
                } else {
                    System.out.println("Failed to create directory.");
                }
            }
        }
    }

    public void createFile(String name) {
        if (name == null) {
            System.out.println("Usage: touch [file_name]");
        } else {
            File newFile = new File(currentDirectory, name);

            if (newFile.exists()) {
                System.out.println("File already exists.");
            } else {
                try {
                    boolean created = newFile.createNewFile();
                    if (created) {
                        System.out.println("File created: " + name);
                    } else {
                        System.out.println("Failed to create file.");
                    }
                } catch (IOException e) {
                    System.out.println("Error creating file: " + e.getMessage());
                }
            }
        }
    }

    public void printHelp() {
        System.out.println("Available commands:");
        System.out.println("pwd            - Print the current working directory");
        System.out.println("ls             - List all files and directories in the current directory");
        System.out.println("cd [dir]       - Change directory to [dir] or '..' to go up");
        System.out.println("mkdir [name]   - Create a new directory with the given name");
        System.out.println("touch [name]   - Create a new empty file with the given name");
        System.out.println("help           - Show this help information");
        System.out.println("exit           - Exit the shell");
    }
}
