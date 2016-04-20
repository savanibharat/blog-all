package com.learninghorizon.all.arrays;

import java.util.ArrayList;

import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import com.learninghorizon.blog.stream.Handler;

public class TestMock {
	
	@Test
	public void testCallMe() throws Exception {
		//PowerMockito.spy(Handler.class);
		PowerMockito.when(Handler.class).thenReturn(Handler.class);
		Handler.methodCallMe();
		//PowerMockito.mock()
		PowerMockito.verifyNew(ArrayList.class).withNoArguments();
	}
}
