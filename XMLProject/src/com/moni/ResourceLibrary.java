package com.moni;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

/**
 * Created by Monica Shopova
 * monika.shopova@gmail.com
 */

@XmlRootElement(name="resources")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResourceLibrary {

    @XmlElement(name = "resource")
    public ArrayList<Resource> list;

    public ArrayList<Resource> getList() {
        return list;
    }

    public void setList(ArrayList<Resource> list) {
        this.list = list;
    }

}
