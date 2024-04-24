package chap12.sec05;

import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) throws Exception{
		// 문자열을 byte 배열로 변환시키고 다시 문자열로 복원
		String data = "자바";
		// String - > byte 배열로 변환(UTF-8 인코딩)
		byte[] arr1 = data.getBytes();
		System.out.println("arr1: " + Arrays.toString(arr1));
		
		//byte 배열 -> String(UTF-8 디코딩)
		String str1 = new String(arr1);
		System.out.println("str1: "  + str1);
		//String -> byte 배열로 변환(EUC_KR 인코딩)
		byte[] arr2 = data.getBytes("EUC_KR");
		System.out.println("arr2: " + Arrays.toString(arr2));
		/* 한글 1자를 UTF-8로 인코딩하면 3바이트가 되고 EUC_KR로 
		 * 인코딩하면 2바이트가 됨
		 */
	}

}