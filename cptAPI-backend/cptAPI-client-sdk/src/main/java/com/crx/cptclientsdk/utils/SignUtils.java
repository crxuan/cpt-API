package com.crx.cptclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * ClassName: SignUtils
 * Package: com.crx.cptapiinterface.utils
 * Description:
 */
public class SignUtils {
    public static String getSign(String body, String secretKey){
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        String content = body+"."+secretKey;
        String digestHex = md5.digestHex(content);
        return digestHex;
    }
}
