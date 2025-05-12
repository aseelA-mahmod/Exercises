.1 איך יוצרים תיקייה בגאווה?

כדי ליצור תיקייה תיקייה או folder בג'אווה, משתמשים במחלקה File מהחבילה java.io. הפקודה mkdir() יוצרת תיקייה אחת, ו mkdirs() יוצרת גם תיקיות אב אם הן לא קיימות.

דוגמת קוד פשוטה:
import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
File folder = new File ("myFlder"));
if (folder.mkdir()) {
    System.out.println("Folder was created successfully!");
} else {
    System.out.println("Failed to create the folder.");
}

https://docs.oracle.com/javase/8/docs/api/java/io/File.html#mkdir--

//-----------------------------------------------------------------

.2 איך יוצרים קובץ?

כדי ליצור קובץ בג'אווה, משתמשים בשיטה createNewFile() מתוך המחלקה File שנמצאת בחבילה java.io. השיטה יוצרת קובץ חדש אם הוא לא קיים כבר במיקום שנבחר, היא מחזירה false. אם יש בעיה, כמו חוסר הרשאות, היא גם מחזירה false.

דוגמת קוד פשוטה:

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("myFile.txt");
        if (file.createNewFile()) {
            System.out.println("The file was created successfully!");
        } else {
            System.out.println("The file already exists.");
        }
    }
}



https://docs.oracle.com/javase/8/docs/api/java/io/File.html#createNewFile--


//--------------------------------------------------------------

 3 איך בודקים אם קובץ/תיקייה קיימים ?

כדי לבדוק אם הקובץ או התיקייה קיימים או לא, משתמשים בפונקציה exists() מתוך המחלקה File.
היא מחזירה true אם הקובץ/תיקייה קיימים, ו־false אם לא.

import java.io.File;

public class CheckFile {
    public static void main(String[] args) {
        File file = new File("notes.txt");

        if (file.exists()) {
            System.out.println("File exists!");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
(אם יש קובץ בשם notes.txt באותה תיקייה של הפרויקט, יודפס "File exists!".
אם הקובץ לא קיים, יודפס "File does not exist." )


https://docs.oracle.com/javase/8/docs/api/java/io/File.html#exists--

//-------------------------------------------------------------------

4 איך מציגים את תוכן תיקייה?

כדי להציג את כל הקבצים והתיקיות שבתוך תיקייה מסוימת בג'אווה, משתמשים בפונקציה listFiles() מתוך המחלקה File. היא מחזירה מערך של קבצים (File[]) שנמצאים בתוך התיקייה.

مثال 

import java.io.File;

public class ListFolderContents {
    public static void main(String[] args) {
        File folder = new File("myFolder");
        File[] files = folder.listFiles();

        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName());
            }
        } else {
            System.out.println("المجلد غير موجود أو فارغ.");
        }
    }
}

https://docs.oracle.com/javase/8/docs/api/java/io/File.html#listFiles--

//--------------------------------------------------------------------


File:

מחלקת File ב-Java מייצגת קובץ או תיקייה במערכת הקבצים.
היא מכילה פונקציות לעבודה עם קבצים ותיקיות כמו קריאה, כתיבה, מחיקה, בדיקת אם קובץ קיים ועוד. היא לא מיועדת לעבודה עם נתיבי קבצים בצורה מודרנית או גמישה יותר.

Path:

Path היא מחלקה ב-Java NIO (New Input/Output) המייצגת נתיב לקובץ או תיקייה בצורה מודרנית וגמישה יותר.
היא מספקת פונקציות מתקדמות לעבודה עם קבצים, כמו יצירה, העתקה, מחיקה, חיבור נתיבים ועוד.



https://docs.oracle.com/javase/8/docs/api/java/io/File.html

https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html

