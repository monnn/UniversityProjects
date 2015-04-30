package com.moni;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Created by Monica Shopova
 * monika.shopova@gmail.com
 */

public class XMLToObject {

    private static final String TO_OBJECT ="src/resources/toObject.xml";

    public static void main(String[] args) throws JAXBException, IOException {
        File file = new File(TO_OBJECT);
        JAXBContext context = JAXBContext.newInstance(ResourceLibrary.class);
        Unmarshaller um = context.createUnmarshaller();
        ResourceLibrary resourceLibrary = (ResourceLibrary) um.unmarshal(file);

        ArrayList<Resource> list = resourceLibrary.getList();
        for (Resource rsrc : list) {
            System.out.println(rsrc.toString());
        }
    }

}
