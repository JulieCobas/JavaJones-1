import java.util.Arrays;
import java.util.List;

public class Choix {

    private String description;
    private List<Action> actions;

    public Choix (String description, Action ... actions){
        this.description = description;
        this.actions = Arrays.asList(actions);
    }

    public String getDescription() {
        return description;
    }

    public List<Action> getActions() {
        return actions;
    }
}
