package ru.mirea.canh.pr10.task3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextDocument implements IDocument {
    private File file;
    private String text;

    TextDocument(File file) {
        try {
            this.file = file;
            FileReader fileReader = new FileReader(file);
            StringBuilder stringBuilder = new StringBuilder();
            int read = fileReader.read();
            while (read != -1) {
                stringBuilder.append((char)read);
                read = fileReader.read();
            }
            text = stringBuilder.toString();
            fileReader.close();
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    @Override
    public void save() {
        try{
            if(file != null) {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(text);
                fileWriter.close();
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    @Override
    public File getFile() {
        return file;
    }
}
