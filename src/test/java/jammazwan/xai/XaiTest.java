package jammazwan.xai;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jammazwan.util.HoldContextOpenUntilDone;

public class XaiTest extends CamelSpringTestSupport {

	@Override
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
	}

	@Test
	public void testLineFeedCount() throws Exception {
		MockEndpoint mock1 = getMockEndpoint("mock:assert1");
		mock1.expectedMessageCount(25);
		mock1.assertIsSatisfied();
	}

	@Test
	public void testDelimiterCount() throws Exception {
		MockEndpoint mock2 = getMockEndpoint("mock:assert2");
		mock2.expectedMinimumMessageCount(300);
		mock2.assertIsSatisfied();
	}

	@Test
	public void testPairsCount() throws Exception {
		MockEndpoint mock3 = getMockEndpoint("mock:assert3");
		mock3.expectedMinimumMessageCount(4);
		mock3.assertIsSatisfied();
	}

}
