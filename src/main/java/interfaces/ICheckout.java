package interfaces;
@FunctionalInterface
public interface ICheckout<T, U> {
    void apply(T t, U u);
}
