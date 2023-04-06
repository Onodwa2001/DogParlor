package za.ac.cput.dogparlor.repository;

public interface IRepository<T, W> {

    T create(T t);
    T read(W w);
    T update(T t);
    T delete(T t);

}
