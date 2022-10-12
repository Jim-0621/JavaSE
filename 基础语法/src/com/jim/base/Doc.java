package com.jim.base;
//命令行生成JavaDoc文档 ：javadoc 参数 文件名
//D:\Projects\Java\JavaSE\基础语法\src\com\jim\base> javadoc -encoding UTF-8 -charset UTF-8 Doc.java
//生成后打开index.html即可查看

/**
 * @author 作者名
 * @version 版本号
 * @since 指明需要最早使用的jdk版本
 * //@param 参数名
 * @return 返回值情况
 * //@throws 异常抛出处理
 */

public class Doc {
    String name;    //类变量

    /**
     * @author Jim
     * @param name
     * @return
     * @throws Exception
     */
    public String test(String name)throws Exception{
        return name;
    }
}
