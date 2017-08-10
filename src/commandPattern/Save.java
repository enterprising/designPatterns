package commandPattern;

/**
 * Created by peng.tan on 17/8/10.
 */
public class Save implements Action {

    private final Editor editor;

    public Save(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.save();
    }
}
