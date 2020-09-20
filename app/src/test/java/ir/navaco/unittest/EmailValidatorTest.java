package ir.navaco.unittest;

import junit.framework.Assert;

import org.junit.Test;

import ir.navaco.unittest.Tools.Helper_Validation;

public class EmailValidatorTest {

    @Test
    public void emailValidator_CorrentEmail_ReturnsTrue() {


        junit.framework.Assert.assertFalse(Helper_Validation.Valid_Email(""));
        junit.framework.Assert.assertFalse(Helper_Validation.Valid_Email("b.bfsdfsd"));
        junit.framework.Assert.assertTrue(Helper_Validation.Valid_Email("m@gmail.com"));
        junit.framework.Assert.assertFalse(Helper_Validation.Valid_Email("dfs"));
        junit.framework.Assert.assertFalse(Helper_Validation.Valid_Email("123"));
        junit.framework.Assert.assertTrue(Helper_Validation.Valid_Email("b.sherafati@navaco.ir"));
        junit.framework.Assert.assertFalse(Helper_Validation.Valid_Email("b.com"));


    }

}
