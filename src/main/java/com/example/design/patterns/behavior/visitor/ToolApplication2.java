package com.example.design.patterns.behavior.visitor;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Date: 2021/8/16 14:21
 */
@Slf4j
public class ToolApplication2 {

    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> resourceFiles = listAllResourceFiles("");
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(extractor);
        }
    }

    public static class Extractor {

        public void extract2txt(PPTFile pptFile) {
            System.out.println("Extract PPT.");
        }

        public void extract2txt(PdfFile pdfFile) {
            System.out.println("Extract PDF.");
        }

        public void extract2txt(WordFile wordFile) {
            System.out.println("Extract WORD.");
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

    public static abstract class ResourceFile {
        protected String filePath;

        public ResourceFile(String filePath) {
            this.filePath = filePath;
        }

        abstract public void accept(Extractor extractor);
    }

    public static class PPTFile extends ResourceFile {
        public PPTFile(String filePath) {
            super(filePath);
        }

        @Override
        public void accept(Extractor extractor) {
            extractor.extract2txt(this);
        }
    }

    public static class PdfFile extends ResourceFile {
        public PdfFile(String filePath) {
            super(filePath);
        }

        @Override
        public void accept(Extractor extractor) {
            extractor.extract2txt(this);
        }
    }

    public static class WordFile extends ResourceFile {
        public WordFile(String filePath) {
            super(filePath);
        }

        @Override
        public void accept(Extractor extractor) {
            extractor.extract2txt(this);
        }
    }
}
