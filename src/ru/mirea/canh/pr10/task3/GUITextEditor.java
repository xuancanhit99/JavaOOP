package ru.mirea.canh.pr10.task3;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class GUITextEditor extends GUIDocumentEditor {
    private final JTextArea textArea;
    public GUITextEditor() {
        super("Simple text editor");
        setLocationRelativeTo(null);
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        addWorkComponent(scrollPane);

        iDocument = null;
        iCreateDocument = new CreateTextDocument();

        endInit();
    }

    @Override
    protected void actionOnNew(File file, boolean cleanWork) throws IOException {
        iDocument = iCreateDocument.createNew(file);
        if(cleanWork)
            textArea.setText("");
    }

    @Override
    protected void actionOnOpen(File file) throws IOException {
        iDocument = iCreateDocument.createOpen(file);
        textArea.setText(((TextDocument)iDocument).getText());
    }

    @Override
    protected void actionOnSave() {
        if(iDocument != null) {
            ((TextDocument)iDocument).setText(textArea.getText());
            iDocument.save();
        }
    }
}
