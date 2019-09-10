package com.baymax.dailynotes.dailynotes.list;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author bx
 * @date 9/10/2019 9:38 AM
 */
@Slf4j
public class List {
    @Test
    public void StringTOList(){
        java.util.List<String> list = Arrays.asList("1248580915");
        log.info("##################"+list);
    }
}
