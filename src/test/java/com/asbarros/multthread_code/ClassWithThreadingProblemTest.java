package com.asbarros.multthread_code;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class ClassWithThreadingProblemTest  {

    
    @Test
    public void twoThreadsShouldFailEventually() throws Exception {
        ClassFile.write("Iniciando teste");
        final ClassWithThreadingProblem classWithThreadingProblem = new ClassWithThreadingProblem();
        Runnable runnable = () -> {
            classWithThreadingProblem.takeNextId();
        };
        int i = 0;
        for (; i < 1000000; i++) {
            int startingId = classWithThreadingProblem.lastId();
            int expectedResult = 2 + startingId;
            Thread t1 = new Thread(runnable);
            Thread t2 = new Thread(runnable);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            int endingId = classWithThreadingProblem.lastId();
            if (endingId != expectedResult) {
               ClassFile.write("endingId: " + endingId + " | expectedResult: " + expectedResult);
                return;
            }
        }
        ClassFile.write("falhou " + i);
        Assert.fail("falhou " + i);
    }

}
