package org.ff4j.sample;

import org.ff4j.FF4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:jdbcApplicationContext.xml")
public class JdbcSpringTest {

    @Autowired
    private FF4j ff4j;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testWithJdbcSpring() {

    }

}