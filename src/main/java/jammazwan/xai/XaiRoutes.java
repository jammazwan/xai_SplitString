package jammazwan.xai;

import org.apache.camel.builder.RouteBuilder;

public class XaiRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		/*
		 * to get a visual, follow tokenize() with .to("${body}")
		 */
		
		// LINE FEED COUNT
		from("file://../jammazwan.shared/src/main/resources/data/xml/?noop=true&fileName=employees.xml").split()
				.tokenize("\n").to("mock:assert1");

		// WHITESPACE REGEX DELIMITER COUNT
		from("file://./?noop=true&fileName=README.md").split().tokenize("(\\W+)\\s*", null, true).to("mock:assert2");

		// PAIR COUNT
		from("file://./?noop=true&fileName=NOTES.md").split().tokenizePair("[", "]").to("mock:assert3");
	}
}
