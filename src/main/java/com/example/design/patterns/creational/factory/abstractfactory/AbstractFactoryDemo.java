package com.example.design.patterns.creational.factory.abstractfactory;

/**
 * @Description:
 * @Date: 2021/8/12 17:09
 */
public class AbstractFactoryDemo {

    public interface IConfigParserFactory {
        IRuleConfigParser createRuleParser();

        ISystemConfigParser createSystemParser();
        //此处可以扩展新的parser类型，比如IBizConfigParser

    }

    public class JsonConfigParserFactory implements IConfigParserFactory {

        @Override
        public IRuleConfigParser createRuleParser() {
            return new JsonRuleConfigParser();
        }

        @Override
        public ISystemConfigParser createSystemParser() {
            return new JsonSystemConfigParser();
        }
    }

    public class XmlConfigParserFactory implements IConfigParserFactory {
        @Override
        public IRuleConfigParser createRuleParser() {
            return new XmlRuleConfigParser();
        }

        @Override
        public ISystemConfigParser createSystemParser() {
            return new XmlSystemConfigParser();
        }
    }

    public interface IRuleConfigParser {

    }

    public interface ISystemConfigParser {

    }

    public static class XmlRuleConfigParser implements IRuleConfigParser {

    }

    public static class JsonRuleConfigParser implements IRuleConfigParser {

    }

    public static class JsonSystemConfigParser implements ISystemConfigParser {

    }

    public static class XmlSystemConfigParser implements ISystemConfigParser {

    }
}
