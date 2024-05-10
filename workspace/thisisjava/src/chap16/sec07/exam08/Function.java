package chap16.sec07.exam08;

@FunctionalInterface
public interface Function<T> {
	public double apply(T t);
}