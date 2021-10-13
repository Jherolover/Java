package com.elite.util;

//import com.thoughtworks.xstream.XStream;
//import com.thoughtworks.xstream.io.xml.StaxDriver;
//import com.thoughtworks.xstream.mapper.MapperWrapper;
//import org.dom4j.Document;
//import org.dom4j.DocumentException;
//import org.dom4j.Element;
//import org.dom4j.io.SAXReader;


public class XmlUtil {
    /**
     * java 转换成xml
     *
     * @Title: toXml
     * @Description: TODO
     * @param obj
     *            对象实例
     * @return String xml字符串
     */
    public static String toXml(Object obj) {
		/*XStream xstream = new XStream();
		xstream.processAnnotations(obj.getClass()); // 通过注解方式的，一定要有这句话
		return xstream.toXML(obj);*/
       /* XStream xstream;
        xstream = new XStream(new StaxDriver());
        xstream.registerConverter(new ResultNullConverter());
        //不然会出现全类名
        //xstream.alias("Record_Info", Record_Info.class,"Record_Info");
        //xstream.autodetectAnnotations(true);
        //去掉转化带class属性
        xstream.aliasSystemAttribute(null,"class");
        xstream.processAnnotations(new Class[]{obj.getClass()}); // 通过注解方式的，一定要有这句话
        //由于注解的节点record__Info存在大小写问题，暂时直接替换
        return xstream.toXML(obj).replaceAll("record__Info","Record__Info").replace("phis.local.xinjiang.respojo.QuitFeeInfo", "Record__Info");
        */
        return null;
    }

    /**
     * 将传入xml文本转换成Java对象
     *
     * @Title: toBean
     * @Description: TODO
     * @param xmlStr
     * @param cls
     *            xml对应的class类
     * @return T xml对应的class类的实例对象
     *
     *         调用的方法实例：PersonBean person=XmlUtil.toBean(xmlStr,
     *         PersonBean.class);
     */
   /* public static <T> T toBean(String xmlStr, Class<T> cls) {
        XStream xstream = new XStream() {// 忽略xml中的未知节点
            @Override
            protected MapperWrapper wrapMapper(MapperWrapper next) {
                return new MapperWrapper(next) {
                    @SuppressWarnings("rawtypes")
                    @Override
                    public boolean shouldSerializeMember(Class definedIn, String fieldName) {
                        if (definedIn == Object.class) {
                            return false;
                        }
                        return super.shouldSerializeMember(definedIn, fieldName);
                    }
                };
            }
        };
        xstream.processAnnotations(cls);
        @SuppressWarnings("unchecked")
        T obj = (T) xstream.fromXML(xmlStr);
        return obj;
    }

    /**
     * @param xml 要转换的xml字符串
     * @param charset 字符编码
     * @return  转换成map后返回结果
     * @throws UnsupportedEncodingException
     * @throws DocumentException
     */
    /*public static Map<String, String> xmlToMap(String xml, String charset) throws UnsupportedEncodingException, DocumentException {
        Map<String, String> respMap = new HashMap<String, String>();
        SAXReader reader = new SAXReader();
        Document doc = reader.read(new ByteArrayInputStream(xml.getBytes(charset)));
        Element root = doc.getRootElement();
        xmlToMap(root, respMap);
        return respMap;
    }
    /**
     *
     * <p>Discription:方法功能中文描述</p>
     * @param tmpElement
     * @param respMap
     * @return
     * @author panhb 2020-8-1
     * @update [修改人] [修改时间] [变更描述]
     */
    /*public static Map<String, String> xmlToMap(Element tmpElement, Map<String, String> respMap){
        List<String> strings = new ArrayList<String>();
        for (String s:strings ) {
        }
        if (tmpElement.isTextOnly()) {
            respMap.put(tmpElement.getName(), tmpElement.getText());
            return respMap;
        }
        @SuppressWarnings("unchecked")
        Iterator<Element> eItor = tmpElement.elementIterator();
        while (eItor.hasNext()) {
            Element element = eItor.next();
            xmlToMap(element, respMap);
        }
        return respMap;
    }*/
}

