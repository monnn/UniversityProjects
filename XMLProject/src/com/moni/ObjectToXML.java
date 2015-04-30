package com.moni;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Created by Monica Shopova
 * monika.shopova@gmail.com
 */

 public class ObjectToXML {

    private static final String TO_XML ="src/resources/toXml.xml";

    public static void main(String[] args) throws JAXBException, IOException {

        ArrayList<Resource> resourceList = new ArrayList<Resource>();

        Resource resource1 = new Resource();
        resource1.setId(1);
        resource1.setCategory("Java");
        resource1.setTitle("10 Object Oriented Design Principles Java Programmer should know");
        resource1.setAuthor("Javin Paul");
        resource1.setUrl("http://javarevisited.blogspot.sg/2012/03/10-object-oriented-design-principles.html");
        resource1.setDate("03.03.2012");
        resourceList.add(resource1);

        Resource resource2 = new Resource();
        resource2.setId(2);
        resource2.setCategory("Ubuntu");
        resource2.setTitle("Ubuntu 15.04 Vivid Vervet Alpha 2 release date, features and where to download it");
        resource2.setAuthor("Jim Martin");
        resource2.setUrl("http://www.pcadvisor.co.uk/news/linux/3595340/ubuntu-1504-vivid-vervet-alpha-2/");
        resource2.setDate("23.01.2015");
        resourceList.add(resource2);

        Resource resource3 = new Resource();
        resource3.setId(3);
        resource3.setCategory("Algorithms");
        resource3.setTitle("How Algorithms Changed The World");
        resource3.setAuthor("Mike James");
        resource3.setUrl("http://www.i-programmer.info/news/181-algorithms/5387-how-algorithms-changed-the-world.html");
        resource3.setDate("26.01.2013");
        resourceList.add(resource3);

        Resource resource4 = new Resource();
        resource4.setId(4);
        resource4.setCategory("Android");
        resource4.setTitle("Intel's 64-bit Android");
        resource4.setAuthor("Mike James");
        resource4.setUrl("http://www.i-programmer.info/news/193-android/6833-intels-64-bit-android.html");
        resource4.setDate("13.01.2014");
        resourceList.add(resource4);

        Resource resource5 = new Resource();
        resource5.setId(5);
        resource5.setCategory("Computer graphics");
        resource5.setTitle("3D computer graphics");
        resource5.setAuthor("unknown");
        resource5.setUrl("http://www.sciencedaily.com/articles/0/3d_computer_graphics.html");
        resource5.setDate("18.02.2010");
        resourceList.add(resource5);

        Resource resource6 = new Resource();
        resource6.setId(6);
        resource6.setCategory("GitHub");
        resource6.setTitle("A beginner's guide to GitHub");
        resource6.setAuthor("Aleksandar Todorovic");
        resource6.setUrl("https://opensource.com/life/15/2/beginners-guide-github");
        resource6.setDate("16.02.2015");
        resourceList.add(resource6);

        Resource resource7 = new Resource();
        resource7.setId(7);
        resource7.setCategory("Python");
        resource7.setTitle("Asynchronous Python and Databases");
        resource7.setAuthor("Mike Bayer");
        resource7.setUrl("http://techspot.zzzeek.org/2015/02/15/asynchronous-python-and-databases/");
        resource7.setDate("15.02.2015");
        resourceList.add(resource7);

        Resource resource8 = new Resource();
        resource8.setId(8);
        resource8.setCategory("Node.js");
        resource8.setTitle("Node.js Flow (part 1) - Callback Hell vs. Async vs. Highland");
        resource8.setAuthor("Eirik Vullum");
        resource8.setUrl("http://blog.vullum.io/javascript-flow-callback-hell-vs-async-vs-highland/");
        resource8.setDate("04.01.2015");
        resourceList.add(resource8);

        Resource resource9 = new Resource();
        resource9.setId(9);
        resource9.setCategory("JavaScript");
        resource9.setTitle("Is JavaScript the Future of Programming?");
        resource9.setAuthor("Dani Fankhauser");
        resource9.setUrl("http://mashable.com/2012/11/12/javascript/");
        resource9.setDate("12.11.2012");
        resourceList.add(resource9);

        Resource resource10 = new Resource();
        resource10.setId(10);
        resource10.setCategory("SQL");
        resource10.setTitle("10 SQL Articles Everyone Must Read");
        resource10.setAuthor("Jo Oq");
        resource10.setUrl("http://blog.jooq.org/2015/02/13/10-sql-articles-everyone-must-read/");
        resource10.setDate("13.02.2015");
        resourceList.add(resource10);

        Resource resource11 = new Resource();
        resource11.setId(11);
        resource11.setCategory("GitHub");
        resource11.setTitle("25 New Script Libraries and Plugins on GitHub");
        resource11.setAuthor("Grace Smith");
        resource11.setUrl("http://mashable.com/2013/06/09/github-script-libraries/");
        resource11.setDate("10.06.2013");
        resourceList.add(resource11);

        Resource resource12 = new Resource();
        resource12.setId(12);
        resource12.setCategory(".NET");
        resource12.setTitle("Microsoft Open Sources .NET?");
        resource12.setAuthor("Mike James");
        resource12.setUrl("http://www.i-programmer.info/news/89-net/7971-microsoft-open-sources-net-.html");
        resource12.setDate("13.11.2014");
        resourceList.add(resource12);

        Resource resource13 = new Resource();
        resource13.setId(13);
        resource13.setCategory("iOS");
        resource13.setTitle("INTRODUCING TLANIMATEDSEGUE, AN OPEN SOURCE IOS STORYBOARD SEGUE");
        resource13.setAuthor("Bruno Berisso");
        resource13.setUrl("http://blog.tryolabs.com/2015/02/11/introducing-tlanimatedsegue-an-open-source-ios-storyboard-segue/");
        resource13.setDate("11.02.2015");
        resourceList.add(resource13);

        Resource resource14 = new Resource();
        resource14.setId(14);
        resource14.setCategory(".NET");
        resource14.setTitle("Building and Running .NET’s CoreCLR on OS X");
        resource14.setAuthor("Frank A. Krueger");
        resource14.setUrl("http://praeclarum.org/post/110552954728/building-and-running-nets-coreclr-on-os-x");
        resource14.setDate("09.02.2015");
        resourceList.add(resource14);

        Resource resource15 = new Resource();
        resource15.setId(15);
        resource15.setCategory("R");
        resource15.setTitle("Programming tools: Adventures with R");
        resource15.setAuthor("Sylvia Tippmann");
        resource15.setUrl("http://www.nature.com/news/programming-tools-adventures-with-r-1.16609");
        resource15.setDate("29.12.2014");
        resourceList.add(resource15);

        Resource resource16 = new Resource();
        resource16.setId(16);
        resource16.setCategory("Excel");
        resource16.setTitle("Excel programming for nonprogrammers");
        resource16.setAuthor("Larry Hardesty");
        resource16.setUrl("http://newsoffice.mit.edu/2012/excel-programming-for-nonprogrammers-0508");
        resource16.setDate("08.03.2012");
        resourceList.add(resource16);

        ResourceLibrary library = new ResourceLibrary();
        library.setList(resourceList);

        JAXBContext context = JAXBContext.newInstance(ResourceLibrary.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        m.marshal(library, System.out);
        m.marshal(library, new File(TO_XML));

        }
    }

