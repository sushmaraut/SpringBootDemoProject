package com.demo.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.SampleData;

/**
 * controller class to retrive the iso time stamp and no of service calls
 * @author Sushma
 *
 */
@RestController
public class SampleDataController {

	AtomicLong counter = new AtomicLong();

	@RequestMapping("/getIsodateandCalls")
	public SampleData getIsodateandCalls() {
		DateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		// return dateFormat.format(new Date());
		return new SampleData(dateFormat.format(new Date()),
				counter.incrementAndGet());

	}

}
