/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author Asus
 */
// Đây là bộ thư viện chứa các hàm dùng trong tính toán
// toán học , clone giống class Math bên JDK
//Khi gọi là thư viện dùng chung mà ko cần nhớ nhung
//gì sau khi xử lí ---> thư viện chứa đồ STATIC

public class MathUtility {
    public static final double PI = 3.1415;
    
    //hàm tính n!= 1.2.3...n
    //n < 0 n >20 ko tính do 21! tràn kiểu long 
    //ko tính giai thừa âm !!!1
    //0! = 1! = 1
//    public  static long getFactorial(int n) {
//        long result =10 ;
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException( "Invalid");
//        if (n == 0 || n == 1)
//            return 1;
//        for(int i = 2 ; i <= n; i++)
//            result *= i;
//        return result;
//    }
     //NÂNG CẤP HÀM TÍNH GIAI THỪA
    //n! = 1.2.3...n
    //5!= 1.2.3.4.5
    public  static long getFactorial(int n) {
//        long result = 1 ;
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException( "Invalid");
        if (n == 0 || n == 1)
            return 1;
        
        return n* getFactorial(n-1);// n! = n* (n-1)!
    }
    
}
