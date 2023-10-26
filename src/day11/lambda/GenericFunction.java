package day11.lambda;

@FunctionalInterface
public interface GenericFunction<X, Y> {

    // X에서 Y를 추출해줘야함
    Y apply(X x);
}
