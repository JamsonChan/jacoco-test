/* Test2.java

        Purpose:
                
        Description:
                
        History:
                Mon Mar 11 11:56:35 CST 2024, Created by jamson

Copyright (C) 2024 Potix Corporation. All Rights Reserved.
*/
package org.jamson.jacoco.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jamson.jacoco.prj3.Project3;
import org.junit.jupiter.api.Test;

public class Test2 {
	@Test
	public void test() {
		assertEquals(2, new Project3().times(2, 1));
	}
}
