package interfaces;
@FunctionalInterface
public interface ICheckout<E, U, N, V, T> {
    void apply(E e, U u, N n,V v,T t);
}
