package com.example.design.patterns.behavior.visitor;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Date: 2021/8/16 14:21
 */
@Slf4j
public class ToolApplication3 {

    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        Compressor compressor = new Compressor();
        List<ResourceFile> resourceFiles = listAllResourceFiles("");
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(extractor);
            resourceFile.accept(compressor);
        }

    }

    /**
     * 访问者定义了 访问多种资源的接口
     */
    public interface Visitor {
        void visit(PdfFile pdfFile);

        void visit(PPTFile pdfFile);

        void visit(WordFile pdfFile);
    }

    /**
     * 抽取 实现访问者
     */
    public static class Extractor implements Visitor {
        @Override
        public void visit(PdfFile pdfFile) {
            System.out.println("Extract PDF.");
        }

        @Override
        public void visit(PPTFile pdfFile) {
            System.out.println("Extract PPT.");
        }

        @Override
        public void visit(WordFile pdfFile) {
            System.out.println("Extract WORD.");
        }

    }

    /**
     * 压缩 实现访问者
     */
    public static class Compressor implements Visitor {
        @Override
        public void visit(PPTFile pptFile) {
            System.out.println("Compress PPT.");
        }

        @Override
        public void visit(PdfFile pdfFile) {
            System.out.println("Compress PDF.");
        }

        @Override
        public void visit(WordFile wordFile) {
            System.out.println("Compress WORD.");
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

        public abstract void accept(Visitor visitor);
    }

    public static class PPTFile extends ResourceFile {
        public PPTFile(String filePath) {
            super(filePath);
        }

        @Override
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public static class PdfFile extends ResourceFile {
        public PdfFile(String filePath) {
            super(filePath);
        }

        @Override
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public static class WordFile extends ResourceFile {
        public WordFile(String filePath) {
            super(filePath);
        }

        @Override
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }

    }
}
