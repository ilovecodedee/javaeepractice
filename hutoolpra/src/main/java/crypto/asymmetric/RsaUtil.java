package crypto.asymmetric;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;

import java.io.*;
import java.util.Properties;

public class RsaUtil {

    static String path = "C:/log/log";
    static String name = "2020_11_30.txt";
    static File jiami = new File(path + "/jiami/" + name);
    static File jiemi = new File(path + "/jiemi/" + name);
    static String PUBLIC_KEY = "";
    //846位
    static String PRIVATE_KEY = "";



    /*
     *  rsa算法生成公钥和私钥匙
     * */

    public static void rsa() {
        RSA rsa = new RSA();
        String publicKeyBase64 = rsa.getPublicKeyBase64();
        String privateKeyBase64 = rsa.getPrivateKeyBase64();
        System.out.println(publicKeyBase64);
        System.out.println(privateKeyBase64);

    }

    /*
     * 加密为Base字符串
     * */

    public static void encryptBase64() {
        setKey();
        RSA rsa = new RSA(PRIVATE_KEY, PUBLIC_KEY);
        BufferedInputStream in = FileUtil.getInputStream(jiemi);
        BufferedOutputStream out = FileUtil.getOutputStream(jiami);
        byte[] bytes = IoUtil.readBytes(in);
        String StrBase64 = rsa.encryptBase64(bytes, KeyType.PublicKey);
        IoUtil.writeUtf8(out, true, StrBase64);


    }

    /*
     * 解密Base字符串为明文
     *
     * 理论上应该将加密后的StrBase64解密回byte数组，在将byte数组解密回它所对应的文件
     * */

    public static void decrypt() {
        setKey();
        RSA rsa = new RSA(PRIVATE_KEY, PUBLIC_KEY);
        BufferedInputStream in = FileUtil.getInputStream(jiami);
        BufferedOutputStream out = FileUtil.getOutputStream(jiemi);
        String StrBase64 = IoUtil.readUtf8(in);
        String plaintext = rsa.decryptStr(StrBase64, KeyType.PrivateKey);
        IoUtil.writeUtf8(out, true, plaintext);
    }


    public static void setKey() {
        Properties props = new Properties();
        try {
            FileInputStream in = new FileInputStream(path + "/config.properties");
            props.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }


        PUBLIC_KEY = props.getProperty("PUBLIC_KEY");
        PRIVATE_KEY = props.getProperty("PRIVATE_KEY");

    }

    public static void main(String[] args) {
        //RsaUtil.encryptBase64();
        RsaUtil.decrypt();
    }
}
