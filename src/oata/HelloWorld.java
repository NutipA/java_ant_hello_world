package oata;

import org.apache.log4j.Logger;

public class HelloWorld {
    static Logger logger = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        logger.info("Hello World!");          // the old SysO-statement
		
		for (int i=1;i<=3;i++){
			System.out.println("Hello World!!"+i);
		}
    }
}
