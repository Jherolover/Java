package com.company;

import com.sun.xml.internal.fastinfoset.algorithm.UUIDEncodingAlgorithm;
import sun.net.util.URLUtil;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
/**
 * @description 哈希加密算法
 * MD5	128 bits	16 bytes
 * SHA-1	160 bits	20 bytes
 * RipeMD-160	160 bits	20 bytes
 * SHA-256	256 bits	32 bytes
 * SHA-512	512 bits	64 bytes
 */
public class HashAlgorithy {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        System.out.println("hash".hashCode());

        // 创建一个MessageDigest实例:
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 反复调用update输入数据:
        md.update("Hello".getBytes("UTF-8"));
        md.update("World".getBytes("UTF-8"));
        byte[] result = md.digest(); // 16 bytes: 68e109f0f40ca72a15e05cc22786f8e6
        System.out.println(new BigInteger(1, result).toString(16));


        // 创建一个MessageDigest实例:
        MessageDigest md1 = MessageDigest.getInstance("SHA-1");
        // 反复调用update输入数据:
        md.update("Hello".getBytes("UTF-8"));
        md.update("World".getBytes("UTF-8"));
        byte[] result1 = md1.digest(); // 20 bytes: db8ac1c259eb89d4a131b253bacfca5f319d54f2
        System.out.println(new BigInteger(1, result1).toString(16));



    }
}
