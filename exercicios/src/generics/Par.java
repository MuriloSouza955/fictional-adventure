package generics;

import java.util.Objects;

public class Par <C, V>{

    private C chave;
    private V valor;

    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() {
        return chave;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Par)) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return getChave().equals(par.getChave());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChave());
    }
}
