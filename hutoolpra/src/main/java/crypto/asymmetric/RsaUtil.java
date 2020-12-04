package crypto.asymmetric;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;

import java.io.*;
import java.util.Properties;

/**
 * @author Tiantun
 * @date 2020/12/4
 */
public class RsaUtil {
    /**
     * @description:   公钥
     */
    static final String PUBLIC_KEY ;
    /**
     * @description: 私钥
     */
    static final String PRIVATE_KEY;
    static  RSA rsa;
    static String path;
    static String name;
    static File jiami ;
    static File jiemi ;

    /*
    * 静态变量初始化
    * */
    static {
        path = "C:/log/log";
        name = "2020.txt";
        jiami = new File(path + "/jiami/" + name);
        jiemi = new File(path + "/jiemi/" + name);
        Properties props = new Properties();
        try {
            FileInputStream in = new FileInputStream(path + "/config.properties");
            props.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PUBLIC_KEY = props.getProperty("PUBLIC_KEY");
        PRIVATE_KEY = props.getProperty("PRIVATE_KEY");
        rsa = new RSA(PRIVATE_KEY, PUBLIC_KEY);
    }

    /*
     *  rsa算法生成公钥和私钥匙
     * */

    public static void rsa() {
        //
        /*
        * */
        /**
         *
         * */
        RSA rsa = new RSA();
        String publicKeyBase64 = rsa.getPublicKeyBase64();
        String privateKeyBase64 = rsa.getPrivateKeyBase64();
        System.out.println(publicKeyBase64);
        System.out.println(privateKeyBase64);

    }

    /*
     * 加密为Base字符串
     * */

    @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
    public static void encryptBase64() {
        BufferedInputStream in = FileUtil.getInputStream(jiemi);
        BufferedOutputStream out = FileUtil.getOutputStream(jiami);
        byte[] bytes = IoUtil.readBytes(in);
        //noinspection AlibabaLowerCamelCaseVariableNaming
        String strBase = rsa.encryptBase64(bytes, KeyType.PublicKey);
        IoUtil.writeUtf8(out, true, strBase);


    }

    /*
     * 解密Base字符串为明文
     *
     * 理论上应该将加密后的StrBase64解密回byte数组，在将byte数组解密回它所对应的文件
     * */

    public static void decrypt() {
        BufferedInputStream in = FileUtil.getInputStream(jiami);
        BufferedOutputStream out = FileUtil.getOutputStream(jiemi);
        String strBase = IoUtil.readUtf8(in);
        String plaintext = rsa.decryptStr(strBase, KeyType.PrivateKey);
        IoUtil.writeUtf8(out, true, plaintext);
    }






    public static void main(String[] args) {
        RsaUtil.decrypt();
    }
}
