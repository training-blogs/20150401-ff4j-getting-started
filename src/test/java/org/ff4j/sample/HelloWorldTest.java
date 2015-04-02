package org.ff4j.sample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.ff4j.FF4j;
import org.ff4j.exception.FeatureNotFoundException;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void myFirstFF4JTest() {
        FF4j ff4j = new FF4j("ff4j.xml");
        assertEquals(2, ff4j.getFeatures().size());
        assertTrue(ff4j.exist("sayHello"));
        assertTrue(ff4j.check("sayHello"));

        // Test value at runtime
        if (ff4j.check("sayHello")) {
            // Feature ok !
            System.out.println("Hello World !");
        } else {
            fail();
        }
    }

    @Test
    public void autoCreateFeatureEnableTest() {
        // Default: store = inMemory, load features from ff4j.xml file
        FF4j ff4j = new FF4j("ff4j.xml");

        try {
            ff4j.check("autoCreatedFeature");
            fail(); // error is Expected here
        } catch (FeatureNotFoundException fnfe) {
            System.out.println("Standard behaviour");
        }

        // Change default behavior
        ff4j.autoCreate(true);

        if (!ff4j.check("autoCreatedFeature")) {
            System.out.println("Not available but code won't fail");
        } else {
            fail();
        }
    }
}