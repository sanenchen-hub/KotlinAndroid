package com.sanenchen.kotlindemo

/**
 * @ClassName: TestKotlinClass
 * @Description: 测试Kotlin的返回
 * @Author: sanenchen
 * @Date: 2020-08-18 10:02
 **/
class TestKotlinClass constructor(test: String) {
    private var test: String = test;

    /**
     * 返回test
     */
    fun returnTest(): String {
        return test;
    }
    /**
     * 返回test
     */
    fun returnTest(tess: String): String {
        return test;
    }

}
