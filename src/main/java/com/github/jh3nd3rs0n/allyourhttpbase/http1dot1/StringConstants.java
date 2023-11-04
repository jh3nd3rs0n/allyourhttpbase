package com.github.jh3nd3rs0n.allyourhttpbase.http1dot1;

final class StringConstants {
	
	public static final String ANY_WHITESPACE_CHAR_REGEX = "[\\h\\s\\v]";
	public static final String CRLF = "\r\n";
	public static final String HTTP_VERSION = "HTTP/1.1";
	public static final String HTTP_VERSION_REGEX = "^HTTP/[\\d]\\.[\\d]$";
	public static final String UNACCEPTABLE_WHITESPACE_CHAR_REGEX = 
			"[[\\h\\s\\v]&&[^ \\t]]";

	private StringConstants() { }
	
}
