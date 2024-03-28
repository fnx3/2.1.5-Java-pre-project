package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Island2 {

    private final Wood3 wood;

    public Island2(@Autowired Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
