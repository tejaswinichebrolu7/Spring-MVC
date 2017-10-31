package com.in28minutes.model;

import static org.testng.Assert.assertEquals;

import java.util.Date;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VideoTest {
	
	@InjectMocks
	Video video;
	
	@BeforeClass
	public void beforeTests() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testId() {
		int id = 2;
		video.setId(id);
		assertEquals(video.getId(),id);
	}
	
	@Test
	public void testUser() {
		String user = "teja";
		video.setUser(user);
		assertEquals(video.getUser(),user);
	}
	
	@Test
	public void testDesc() {
		String desc = "Angular2";
		video.setDesc(desc);
		assertEquals(video.getDesc(),desc);
	}
	
	@Test
	public void testTargetDate() {
		Date date = new Date();
		video.setTargetDate(date);
		assertEquals(video.getTargetDate(),date);
	}
	
	@Test
	public void testisDone() {
		boolean isDone = true;
		video.setDone(isDone);
		assertEquals(video.isDone(),isDone);
	}
}