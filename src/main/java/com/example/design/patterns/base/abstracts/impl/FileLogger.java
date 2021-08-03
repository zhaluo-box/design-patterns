package com.example.design.patterns.base.abstracts.impl;

import com.example.design.patterns.base.abstracts.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;

/**
 * @Description:
 * @Date: 2021/7/20 12:47
 */
public class FileLogger extends Logger {

    private Writer fileWriter;

    public FileLogger(String name, boolean enabled, Level minPermittedLevel, String filepath) throws IOException {
        super(name, enabled, minPermittedLevel);
        this.fileWriter = new FileWriter(filepath);
    }

    @Override
    public void doLog(Level level, String mesage) throws IOException {
        // 格式化level和message,输出到日志文件
        fileWriter.write(formatMessageAndLevel(level, mesage));
    }

    public String formatMessageAndLevel(Level level, String mesage) {
        // TODO 格式化level和message,输出到日志文件
        return "";
    }
}
