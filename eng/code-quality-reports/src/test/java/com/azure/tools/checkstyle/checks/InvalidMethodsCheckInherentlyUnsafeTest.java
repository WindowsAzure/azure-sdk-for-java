// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.tools.checkstyle.checks;

import com.puppycrawl.tools.checkstyle.AbstractModuleTestSupport;
import com.puppycrawl.tools.checkstyle.Checker;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InvalidMethodsCheckInherentlyUnsafeTest extends AbstractModuleTestSupport {
    String[] invalidMethods = {
        "System.runFinalizersOnExit",
        "java.lang.System.runFinalizersOnExit",
        "Runtime.runFinalizersOnExit",
        "java.lang.Runtime.runFinalizersOnExit"
    };

    private Checker checker;

    @Before
    public void prepare() throws Exception {
        checker = TestUtils.prepareCheckStyleChecker(prepareConfiguration());
        checker.addListener(this.getBriefUtLogger());
    }

    @After
    public void cleanup() {
        checker.destroy();
    }

    @Override
    protected String getPackageLocation() {
        return "com/azure/tools/checkstyle/checks/InvalidMethodsCheck";
    }

    @Test
    public void mathRandomTestData() throws Exception  {
        String[] expected = {
            TestUtils.expectedErrorMessage(4, 35, String.format("Function %s is inherently unsafe and deprecated.", invalidMethods[0])),
            TestUtils.expectedErrorMessage(9, 45, String.format("Function %s is inherently unsafe and deprecated.", invalidMethods[1])),
            TestUtils.expectedErrorMessage(14, 36, String.format("Function %s is inherently unsafe and deprecated.", invalidMethods[2])),
            TestUtils.expectedErrorMessage(19, 46, String.format("Function %s is inherently unsafe and deprecated.", invalidMethods[3]))
        };
        verify(checker, getPath("InherentlyUnsafeTestData.java"), expected);
    }


    private DefaultConfiguration prepareConfiguration() {
        DefaultConfiguration checks = new DefaultConfiguration("Checks");
        DefaultConfiguration treeWalker = new DefaultConfiguration("TreeWalker");
        DefaultConfiguration invalidMethodsCheck = new DefaultConfiguration(InvalidMethodsCheck.class.getCanonicalName());
        invalidMethodsCheck.addAttribute("methods",
        "java.lang.System.runFinalizersOnExit, System.runFinalizersOnExit, java.lang.Runtime.runFinalizersOnExit, Runtime.runFinalizersOnExit");
        invalidMethodsCheck.addAttribute("message", "Function %s is inherently unsafe and deprecated.");
        checks.addChild(treeWalker);
        treeWalker.addChild(invalidMethodsCheck);
        return checks;
    }
}
