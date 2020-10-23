package ru.mirea.canh.pr10.task3;

import java.io.File;
import java.io.IOException;

public interface ICreateDocument {
    public IDocument createNew(File file) throws IOException;
    public IDocument createOpen(File file) throws IOException;
}
