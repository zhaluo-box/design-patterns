package com.example.design.patterns.behavior.visitor;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Date: 2021/8/16 14:21
 */
@Slf4j
public class ToolApplication {

    public static void main(String[] args) {
        List<ResourceFile> resourceFiles = listAllResourceFiles("");
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.extract2txt();
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        //...根据后缀(pdf/ppt/word)由工厂方法创建不同的类对象(PdfFile/PPTFile/WordFile)
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new WordFile("b.word"));
        resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }

    public static abstract class ResourceFile{
        protected String filePath;

        public ResourceFile(String filePath) {
            this.filePath = filePath;
        }

        abstract void extract2txt();
    }

    public static class PPTFile extends ResourceFile{
        public PPTFile(String filePath) {
            super(filePath);
        }

        @Override
        public void extract2txt() {
            log.info(" PPT file extract to txt file! ");
        }
    }

    public static class PdfFile extends ResourceFile{
        public PdfFile(String filePath) {
            super(filePath);
        }

        @Override
        public void extract2txt() {
            log.info(" PDF file extract to txt file! ");
        }
    }

    public static class WordFile extends ResourceFile{
        public WordFile(String filePath) {
            super(filePath);
        }

        @Override
        public void extract2txt() {
            log.info(" word file extract to txt file! ");
        }
    }
}
