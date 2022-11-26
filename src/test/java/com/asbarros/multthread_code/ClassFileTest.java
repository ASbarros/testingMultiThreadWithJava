
package com.asbarros.multthread_code;

import org.junit.jupiter.api.Test;

public class ClassFileTest  {
    
  @Test
    public void testWrite() {
        System.out.println("write");
        String result_2 = "teste do arquivo";
        ClassFile.write(result_2);
        
        //fail("The test case is a prototype.");
    }
    
}
