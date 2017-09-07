package com.example.tutorials.tdd.testdriven;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestTemplateParse {
	@Test
	public void emptyTemplateRendersAsEmptyString() throws Exception {
		TemplateParse parse = new TemplateParse();
		List<String> segments = parse.parse("");
		assertEquals("Number of segments", 1, segments.size());
		assertEquals("", segments.get(0));
	}
}