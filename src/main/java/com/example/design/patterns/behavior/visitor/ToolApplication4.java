package com.example.design.patterns.behavior.visitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Date: 2021/8/16 15:22
 */
public class ToolApplication4 {
    public static void main(String[] args) {
        List<ResourceFile> resourceFiles = listAllResourceFiles("");
        for (ResourceFile resourceFile : resourceFiles) {
            Extractor extractor = ExtractorFactory.getExtractor(resourceFile.getType());
            extractor.extract2txt(resourceFile);
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        //...根据后缀(pdf/ppt/word)由工厂方法创建不同的类对象(PdfFile/PPTFile/WordFile)
        resourceFiles.add(new PDFFile("a.pdf"));
        resourceFiles.add(new WordFile("b.word"));
        resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }

    public enum ResourceFileType {
        PDF, PPT, WORD;
    }

    public static abstract class ResourceFile {
        protected String filePath;

        public ResourceFile(String filePath) {
            this.filePath = filePath;
        }

        public abstract ResourceFileType getType();
    }

    public static class PDFFile extends ResourceFile {
        public PDFFile(String filePath) {
            super(filePath);
        }

        @Override
        public ResourceFileType getType() {
            return ResourceFileType.PDF;
        }
    }

    public static class PPTFile extends ResourceFile {

        public PPTFile(String filePath) {
            super(filePath);
        }

        @Override
        public ResourceFileType getType() {
            return ResourceFileType.PPT;
        }
    }

    public static class WordFile extends ResourceFile {

        public WordFile(String filePath) {
            super(filePath);
        }

        @Override
        public ResourceFileType getType() {
            return ResourceFileType.WORD;
        }
    }

    //...PPTFile/WordFile跟PdfFile代码结构类似，此处省略...
    public interface Extractor {
        void extract2txt(ResourceFile resourceFile);
    }

    public static class PdfExtractor implements Extractor {
        @Override
        public void extract2txt(ResourceFile resourceFile) {
            System.out.println("extract pdf");
        }
    }

    public static class PPTExtractor implements Extractor {
        @Override
        public void extract2txt(ResourceFile resourceFile) {
            System.out.println("extract ppt");
        }
    }

    public static class WordExtractor implements Extractor {
        @Override
        public void extract2txt(ResourceFile resourceFile) {
            System.out.println("extract word");
        }
    }

    //...PPTExtractor/WordExtractor跟PdfExtractor代码结构类似，此处省略...
    public static class ExtractorFactory {
        private static final Map<ResourceFileType, Extractor> extractors = new HashMap<>();

        static {
            extractors.put(ResourceFileType.PDF, new PdfExtractor());
            extractors.put(ResourceFileType.PPT, new PPTExtractor());
            extractors.put(ResourceFileType.WORD, new WordExtractor());
        }

        public static Extractor getExtractor(ResourceFileType type) {
            return extractors.get(type);
        }
    }
}
