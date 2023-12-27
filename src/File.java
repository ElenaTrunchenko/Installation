import java.io.*;
import java.util.Date;

class Filef {
    String address;
    static StringBuilder builder = new StringBuilder();

    public Filef(String address) {
        this.address = address;
    }

    public static void file(String address) {
        File newFile = new File(address);
        Date date = new Date();

        try {
            boolean created = newFile.createNewFile();
            if (created) {
                builder.append(date).append(" файл ").append(address).append(" успешно создана").append("\n");
            } else builder.append(date).append("  файл ").append(address).append(" не создан").append("\n");
            creatLog(builder);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void folder(String address) {
        File f = new File(address);
        boolean created = f.mkdir();

        Date date = new Date();
        StringBuilder builder = new StringBuilder();
        if (created) {
            builder.append(date).append(" папка ").append(address).append(" успешно создана ").append("\n");
        } else builder.append(date).append(" папка ").append(address).append(" не создана ").append("\n");
        creatLog(builder);
    }

    public static void creatLog(StringBuilder builder) {

        try (FileWriter writer = new FileWriter("D:/Games/temp/temp.txt", true)) {
            writer.write(String.valueOf(builder));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
