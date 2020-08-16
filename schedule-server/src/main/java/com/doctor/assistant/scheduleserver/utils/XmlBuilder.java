package com.doctor.assistant.scheduleserver.utils;import javax.xml.bind.JAXBContext;import javax.xml.bind.Unmarshaller;import java.io.Reader;import java.io.StringReader;public class XmlBuilder {    /**     * 将xml字符串转换成指定类型的pojo     *     * @param clazz     * @param xmlStr     * @return     * @throws Exception     */    public static Object xmlStrToObject(Class<?> clazz, String xmlStr) throws Exception {        Object xmlObject;        Reader reader;        JAXBContext context = JAXBContext.newInstance(clazz);        //将xml转成对象的核心接口        Unmarshaller unmarshaller = context.createUnmarshaller();        reader = new StringReader(xmlStr);        xmlObject = unmarshaller.unmarshal(reader);        reader.close();        return xmlObject;    }}