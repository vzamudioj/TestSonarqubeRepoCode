package testcodepkg;

import JavaCode.JavaCodeClass;
import org.junit.Test;

public class TestCodeJava {

    @Test
    public void addint(){
        JavaCodeClass a= new JavaCodeClass();
        int c=a.add(10,20);
        System.out.println(c);
    }

    
}
