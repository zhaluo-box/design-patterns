package com.example.design.patterns.creational.factory.simplefactory;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Date: 2021/8/12 16:33
 */

@Slf4j
public class RuleConfigSource {

    public static void main(String[] args) {
        load("json");
    }

    public static RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = null;
        //        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
        //            parser = new JsonRuleConfigParser();
        //        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
        //            parser = new XmlRuleConfigParser();
        //        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
        //            parser = new YamlRuleConfigParser();
        //        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
        //            parser = new PropertiesRuleConfigParser();
        //        } else {
        //            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        //        }
        // 优化后的版本
        parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        return parser.parse(configText);
    }

    public static class RuleConfigParserFactory {

        /*              --------------优化开始-------------              */
        private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();

        static {
            cachedParsers.put("json", new JsonRuleConfigParser());
            cachedParsers.put("xml", new XmlRuleConfigParser());
            cachedParsers.put("yaml", new YamlRuleConfigParser());
            cachedParsers.put("properties", new PropertiesRuleConfigParser());
        }

        public static IRuleConfigParser createParser1(String configFormat) {
            if (configFormat == null || configFormat.isEmpty()) {
                return null;//返回null还是IllegalArgumentException全凭你自己说了算
            }
            return cachedParsers.get(configFormat.toLowerCase());
        }
        /*              --------------优化结束-------------              */

        /**
         * <br>
         * 在“规范和重构”那一部分中，我们有讲到，为了让代码逻辑更加清晰，可读性更好，
         * 我们要善于将功能独立的代码块封装成函数。按照这个设计思路，我们可以将代码中涉及 parser 创建的部分逻辑剥离出来，抽象成 createParser() 函数
         * </br>
         *
         * @param ruleConfigFileExtension aa
         * @return 解析器
         */
        public static IRuleConfigParser createParser(String ruleConfigFileExtension) {
            IRuleConfigParser parser = null;
            if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
                parser = new JsonRuleConfigParser();
            } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
                parser = new XmlRuleConfigParser();
            } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
                parser = new YamlRuleConfigParser();
            } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
                parser = new PropertiesRuleConfigParser();
            }
            return parser;
        }
    }

    private static String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }

    public static class RuleConfig {

    }

    public interface IRuleConfigParser {
        RuleConfig parse(String context);
    }

    public static class JsonRuleConfigParser implements IRuleConfigParser {
        @Override
        public RuleConfig parse(String context) {
            log.info("parse json");
            return null;
        }
    }

    public static class XmlRuleConfigParser implements IRuleConfigParser {
        @Override
        public RuleConfig parse(String context) {
            log.info("parse xml");
            return null;
        }
    }

    public static class YamlRuleConfigParser implements IRuleConfigParser {
        @Override
        public RuleConfig parse(String context) {
            log.info("parse yaml");
            return null;
        }
    }

    public static class PropertiesRuleConfigParser implements IRuleConfigParser {
        @Override
        public RuleConfig parse(String context) {
            log.info("parse properties");
            return null;
        }
    }

    public static class InvalidRuleConfigException extends RuntimeException {
        public InvalidRuleConfigException(String msg) {
            super(msg);
        }
    }
}
