import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;

/**
 * Unit test for simple App.
 */
public class PasswordTest
{
    //218位
    String PUBLIC_KEY="";
    //846位
    String PRIVATE_KEY="";
    String name="2020_11_30.txt";

         RSA rsa = new RSA(PRIVATE_KEY, PUBLIC_KEY);
    File jiami = new File("E:/youngCloud/readfile/rearEnd/java/code/hutoolpro/src/main/resources/jiami/"+name);

    File jiemi = new File("E:/youngCloud/readfile/rearEnd/java/code/hutoolpro/src/main/resources/jiemi/"+name);





    /*
    *  rsa算法生成公钥和私钥匙
    * */
    @Test
    public void rsa(){
        RSA rsa = new RSA();
        String publicKeyBase64 = rsa.getPublicKeyBase64();
        String privateKeyBase64 = rsa.getPrivateKeyBase64();
        System.out.println(publicKeyBase64);
        System.out.println(privateKeyBase64);

    }

    /*
    * 加密为Base字符串
    * */
    @Test
    public void encryptBase64(){

        BufferedInputStream in = FileUtil.getInputStream(jiemi);

        BufferedOutputStream out = FileUtil.getOutputStream(jiami);


        byte[] bytes = IoUtil.readBytes(in);

        String StrBase64 = rsa.encryptBase64(bytes, KeyType.PublicKey);
        IoUtil.writeUtf8(out,true,StrBase64);


    }

    /*
    * 解密Base字符串为明文
    *
    * 理论上应该将加密后的StrBase64解密回byte数组，在将byte数组解密回它所对应的文件
    * */
    @Test
    public void decrypt(){
        BufferedInputStream in = FileUtil.getInputStream(jiami);

        BufferedOutputStream out = FileUtil.getOutputStream(jiemi);

        String StrBase64 = IoUtil.readUtf8(in);


        String plaintext = rsa.decryptStr(StrBase64, KeyType.PrivateKey);

        IoUtil.writeUtf8(out,true,plaintext);
    }



}
