/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sondz.mathutil.core;

import com.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Asus
 */
public class MathUtilityDDTTest {
    
   // chuẩn bị bộ date , sẽ nhồi vào hàm assert()
    public static Object[] [] initData(){
        
//        int[] a = {5, 10, 15, 20, 25};
        
        Object[][] testData = {{0, 1},{1, 1},{3, 6},{4, 24},{5, 120}};
        
        return testData;
    }
    // nhồi data vào hàm kiểm thử
    @ParameterizedTest
    @MethodSource("initData")//DDT vừa xong
    public void verifyFactorialGivenRightArgumentReturnsOk(int n, long expected){
        
        assertEquals(expected, MathUtility.getFactorial(n));
    
    }
}
