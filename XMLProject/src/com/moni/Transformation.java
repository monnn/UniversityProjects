package com.moni;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by Monica Shopova
 * monika.shopova@gmail.com
 */

public class Transformation {

    public static void main(String[] args){
        TransformerFactory factory = TransformerFactory.newInstance();
        String outputFileName="src/resources/resoucesInfo.html";
        Source xslDoc=new StreamSource("src/resources/transformation.xsl");
        Source xmlDoc=new StreamSource("src/resources/toXml.xml");
        OutputStream htmlFile= null;
        try {
            htmlFile = new FileOutputStream(outputFileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Transformer trasform= null;
        try {
            trasform = factory.newTransformer(xslDoc);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
        try {
            trasform.transform(xmlDoc, new StreamResult(htmlFile));
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
