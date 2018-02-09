package com.heihaier.springbootdemo.pattern;

import java.util.regex.Pattern;

/**
 * @author heihaier@xfuweng.com
 * Date: 05/02/2018
 * Time: 17:50
 */
public class PatternDemo {
    public static final Pattern pattern1 = Pattern.compile("^[0-9]$");
    public static final Pattern pattern2 = Pattern.compile("^\\d+$");

    public static final Pattern pattern_zip = Pattern.compile("^P-\\d+-\\d+-\\d+(.zip)$");

    public static void main(String[] args) {
//        System.out.println(pattern1.matcher("123d").find());
//        System.out.println(pattern2.matcher("a123").find());
        System.out.println(pattern_zip.matcher("P-12-3-4.zip").find());
        System.out.println(pattern_zip.matcher("-12-3-4.zip").find());
    }
}
