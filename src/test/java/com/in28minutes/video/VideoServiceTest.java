package com.in28minutes.video;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.in28minutes.model.Video;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

public class VideoServiceTest {

	@InjectMocks
	private VideoService videoService;

	@Mock
	private Video video;


	@BeforeClass
	public void beforeTests() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testRetrieveVideos() {
		String user = "teja";
		Mockito.when(video.getUser()).thenReturn(user);
		List<Video> output = videoService.retrieveVideos(user);
		assertNotEquals(output,null); 
		assertNotEquals(output.size(),null); 
		assertEquals(output.size(),3);
	}

	@Test
	public void testAddVideo() {
		String name = "teja";
		String desc ="Learn Angular2";
		Date targetDate = new Date();
		boolean isDone = false;
		videoService.addVideo(name, desc, targetDate, isDone);
	}

	@Test
	public void testRetrieveVideoWithVideo() {
		int id = 1;
		Mockito.when(video.getId()).thenReturn(id);
		Video output = videoService.retrieveVideo(id);
		assertNotEquals(output,null); 
		assertEquals(output.getUser(),"teja");	
	}


	@Test
	public void testRetrieveVideoWithNoVideo() {
		int id = 6;
		Mockito.when(video.getId()).thenReturn(id);
		Video output = videoService.retrieveVideo(id);
		assertEquals(output,null); 	
	}

	@Test
	public void testUpdateVideo() {
		int id = 4;
		String desc = "Learn AngularJs";	
		Mockito.when(video.getId()).thenReturn(id);
		videoService.updateVideo(video,id,desc); 
	}

	@Test
	public void testDeleteVideo() {
		int id = 4;	
		Mockito.when(video.getId()).thenReturn(id);
		videoService.deleteVideo(id); 
	}
}