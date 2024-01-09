package heroes;
import java.util.Objects;
public abstract class Human {
    public String name;
    public Human(String name) {
        this.name = name;
    }
    public abstract String talking();
    public abstract String looking();
    public abstract String thinking();
    public abstract String going();
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // Дополнительные методы
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String eating() {
        return name + " ест";
    }
}
