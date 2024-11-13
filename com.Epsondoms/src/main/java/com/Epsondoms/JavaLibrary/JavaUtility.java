package com.Epsondoms.JavaLibrary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public static void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int generateRandomNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);

	}

	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_mm_yyyy_hh_mm_ss");
		return sdf.format(date);

	}

}
