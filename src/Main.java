import java.io.*;

public class Main {
    public static void main(String[] args) {
        //1. В папке Games создайте несколько директорий: src, res, savegames, temp.
        Filef.folder("D:/Games/src");

        Filef.folder("D:/Games/res");
        Filef.folder("D:/Games/savegames");
        Filef.folder("D:/Games/temp");

        //2.В каталоге src создайте две директории: main, test.
        Filef.folder("D:/Games/src/main");
        Filef.folder("D:/Games/src/test");

        //3.В подкаталоге main создайте два файла: Main.java, Utils.java.
        Filef.file("D:/Games/src/main/Main.java");
        Filef.file("D:/Games/src/main/Utils.java");

        //4.В каталог res создайте три директории: drawables, vectors, icons
        Filef.folder("D:/Games/res/drawables");
        Filef.folder("D:/Games/res/vectors");
        Filef.folder("D:/Games/res/icons");

        //5.В директории temp создайте файл temp.txt
        Filef.file("D:/Games/temp/temp.txt");
    }
}