package com.euler.problem.p0001;

import org.junit.Assert;
import org.junit.Test;

import static com.euler.problem.p0001.MultipleSum.sumTwoMultiples;

public class MultipleSumTest {

    @Test
    public void testSumTwoMultiples() {
        Assert.assertEquals(23, sumTwoMultiples(3, 5, 10));
    }
}
