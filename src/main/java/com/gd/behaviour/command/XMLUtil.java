package com.gd.behaviour.command;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @description TODO
 * author: liquan
 * date: 2020/12/14 16:12
 * version: 1.0
 */
public class XMLUtil {

    public static Object getBean(int i) {

        try {

            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = dFactory.newDocumentBuilder();

            Document doc = builder.parse("./src/main/java/com/gd/behaviour/command/config.xml");

            NodeList nl = doc.getElementsByTagName("className");

            Node node = null;

            if (i == 0) {
                node = nl.item(0).getFirstChild();
            } else {
                node = nl.item(1).getFirstChild();
            }

            String cname = node.getNodeValue();

            Class c = Class.forName(cname);

            Object object = c.newInstance();

            return object;

        } catch (ParserConfigurationException | SAXException | IOException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
}
