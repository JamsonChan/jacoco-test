/* TestRootTest.java

        Purpose:
                
        Description:
                
        History:
                Fri Mar 01 12:36:08 CST 2024, Created by jamson

Copyright (C) 2024 Potix Corporation. All Rights Reserved.
*/
package org.jamson.jacoco.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.jamson.jacoco.prj1.Project1;
import org.jamson.jacoco.prj2.Project2;

public class TestRootTest {
	@Test
	public void test() {
		assertEquals(3, new Project1().add(2, 1));
		assertEquals(1, new Project2().minus(2, 1));
	}
}
