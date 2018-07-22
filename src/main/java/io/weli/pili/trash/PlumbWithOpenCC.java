package io.weli.pili.trash;

import com.github.houbb.opencc4j.util.ZhConverterUtil;

public class PlumbWithOpenCC {
    public static void main(String[] args) {
        String original = "生命不息，奮鬥不止.jpg";
        String result = ZhConverterUtil.convertToSimple(original);
        System.out.println(result);
    }
}
