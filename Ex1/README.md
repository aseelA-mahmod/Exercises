# General Project Description

This project is a simple command-line (Shell) program written in Java that allows the user to execute basic file system commands from the terminal.  
The code implements core commands typically found in the terminal such as `pwd`, `ls`, `cd`, `mkdir`, `touch`, `help`, and `exit`.

## Command Descriptions

- **`pwd`** – Displays the current folder path.  
- **`ls`** – Lists all files and folders in the current directory.  
- **`cd [folder_name]`** – Changes to the specified directory.  
- **`mkdir [folder_name]`** – Creates a new directory.  
- **`touch [file_name]`** – Creates a new empty file.  
- **`help`** – Displays a list of available commands.  
- **`exit`** – Exits the program.

---

## How to Compile and Run

1. Make sure Java is installed on your computer.  
2. Open the terminal and navigate to the project directory.  
3. Use the following command to compile the code:  
   ```bash
   javac src/*.java
   ```
4. To run the program, use:  
   ```bash
   java src.MiniShell
   ```

---

## Example Command Executions

```bash
mkdir myFolder  
cd myFolder  
touch myFile.txt
```
