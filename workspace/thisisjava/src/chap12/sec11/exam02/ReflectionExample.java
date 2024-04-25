package chap12.sec11.exam02;

import java.lang.reflect.*;
/* 리플렉션
 * Class 객체로 관리하는 클래스와 인터페이스의 메타 정보를 프로그램에서 읽고 수정하는 것
 * 메타 정보 : 패키지 정보, 타입 정보, 멤버 정보(생성자, 필드, 메소드) 정보 말함
 */
//생성자, 필드, 메소드, 클래스 모두 java.lang.reflect 패키지에 있다

import chap06.sec06.exam01.Car;

public class ReflectionExample {

    public static void main(String[] args) throws Exception {
        Class clazz = Car.class;
        System.out.println("[생성자 정보]");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        // getDeclaredConstructors() : 생성자 정보 읽기
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");//getName(): 패키지를 포함한 전체 타입 이름
            Class[] parameters = constructor.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
        System.out.println();

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        // getDeclaredFields() :  필드 정보 읽기
        for (Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println();
        
        
    }

    private static void printParameters(Class[] parameters) {
        for (int i = 0; i < parameters.length; i++) {
            System.out.println(parameters[i].getName());
        }
    }
}