package chap12.sec11.exam03;

import chap06.sec06.exam01.Car;

public class GetResourceExample {

    public static void main(String[] args) {
        Class clazz = Car.class;

        // getResource()는 클래스 패스 상의 리소스를 가져오기 때문에 절대 경로를 얻기 위해선 getAbsolutePath()를 사용해야 합니다.
        String photo1Path = clazz.getResource("photo1.jpg").getPath();
        System.out.println(photo1Path);
        String photo1Path2 = clazz.getResource("images/photo1.jpg").getPath();
        System.out.println(photo1Path2);
        
    }
}