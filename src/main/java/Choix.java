import java.util.Arrays;
import java.util.List;

public class Choix {

    private String description;
    private List<Action> actions;

    public Choix (String description, Action action1, Action action2){
        this.description = description;
        this.actions = Arrays.asList(action1,action2);
    }

    public String getDescription() {
        return description;
    }
}
