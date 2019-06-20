package com.droptable.utils;

import java.nio.charset.Charset;

public class CyrillicTextDecoder {

	public static String getUtf8String(String encodedIso8859) {
		byte[] bytes = encodedIso8859.getBytes(Charset.forName("ISO-8859-1"));
		return new String(bytes, Charset.forName("UTF-8"));
	}
}