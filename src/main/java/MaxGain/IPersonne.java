package MaxGain;

import java.util.List;

public interface IPersonne<P> {
    public interface InterfacePersonne<T> {
        void ajouter(T t);
        void modifier(T t);
        void supprimer(T t);
        List<T> dispaly();
    }
}
