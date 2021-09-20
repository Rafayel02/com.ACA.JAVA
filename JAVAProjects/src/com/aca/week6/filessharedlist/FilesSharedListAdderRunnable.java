package com.aca.week6.filessharedlist;

import com.aca.week6.runnables.filesconcurrentprocessig.FileSearcherRunnable;

import java.io.File;
import java.util.List;

public class FilesSharedListAdderRunnable implements Runnable {

    private final File file;
    private final String valueForSearch;
    private final List<String> list;

    public FilesSharedListAdderRunnable(File file, String valueForSearch, List<String> list) {
        this.file = file;
        this.valueForSearch = valueForSearch;
        this.list = list;
    }

    @Override
    public void run() {
        int countOfValueInFile = FileSearcherRunnable.getCountOfValueInFile(this.file, valueForSearch);
        addToList(this.file.getName(), countOfValueInFile);
    }

    private synchronized void addToList(String fileName, int countOfValueInFile) {
        this.list.add(fileName + countOfValueInFile);
    }

}
