package com.izaanschool;

import org.testng.annotations.Test;

public class herokuAppTest {
    @Test
    public void forgetPassword() {
        herokuApp Herokuapp= new herokuApp();
        Herokuapp.forgetPassword();
    }
}
