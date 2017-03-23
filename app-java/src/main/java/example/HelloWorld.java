package example;

import org.apache.log4j.Logger;

public class HelloWorld {

public final static Logger logger = Logger.getLogger(HelloWorld.class);
	
  public void coveredByUnitTest() {
    logger.info("coveredByUnitTest1 tjiosndskndslksdfklajklj");
    logger.info("coveredByUnitTest2");
  }

  public void coveredByIntegrationTest() {
	  logger.info("coveredByIntegrationTest1");
	  logger.info("coveredByIntegrationTest2");
	  logger.info("coveredByIntegrationTest3");
  }

  public void notCovered() {
	  logger.info("notCovered");
  }

}
