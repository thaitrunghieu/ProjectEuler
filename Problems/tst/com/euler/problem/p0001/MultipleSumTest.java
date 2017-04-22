package com.euler.problem.p0001;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSumTest {

    @Test
    public void testSumTwoMultiples() {
        Assert.assertEquals(23, MultipleSum.sumTwoMultiples(3, 5, 10));
    }
}