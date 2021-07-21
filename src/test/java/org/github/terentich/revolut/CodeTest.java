package org.github.terentich.revolut;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CodeTest {
    @Test
    public void evaluatesExpression() {
        Code codeObject = new Code();
        int result = codeObject.method("1+2+3");
        assertEquals(1, result);
    }
}