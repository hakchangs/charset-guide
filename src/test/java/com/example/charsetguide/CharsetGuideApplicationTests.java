package com.example.charsetguide;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

@SpringBootTest
class CharsetGuideApplicationTests {

    @Test
    void contextLoads() throws UnsupportedEncodingException {

        //1. byte 준비
        String encodingType = "euc-kr";
        String origin = "asdf1234하이";
        byte[] payload = origin.getBytes(encodingType);
        System.out.println("[string] origin >> " + origin);
        System.out.println("[byte] payload >> " + payload);

        //2. decode
//        String decodingType = "utf-16";
//        String decodingType = "utf-8";
//        String decodingType = "ascii";
//        String decodingType = "iso8859-1";
//        String decodingType = "iso8859-2";
//        String decodingType = "ksc5601";
//        String decodingType = "ms949";
//        String decodingType = "cp949";
//        String decodingType = "euc-kr";
//        String decodingType = "ksc5601";
        String decodingType = "cp437";
        String decoded = new String(payload, decodingType);
        System.out.println("[string] decoded >> " + decoded);

    }

}
