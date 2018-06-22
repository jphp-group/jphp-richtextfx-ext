package pro.nearde.richtextfx;

import org.develnext.jphp.ext.javafx.classes.UXNode;
import org.develnext.jphp.ext.javafx.classes.layout.UXRegion;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;
import pro.nearde.richtextfx.classes.UXInlineCssTextArea;
import pro.nearde.richtextfx.classes.UXStyledTextAreaScrollPane;

public class RichTextExtension extends Extension {

    @Override
    public Status getStatus() {
        return Status.BETA;
    }

    @Override
    public void onRegister(CompileScope compileScope) {
        registerWrapperClass(compileScope, UXRegion.class, UXInlineCssTextArea.class);
        registerWrapperClass(compileScope, UXNode.class, UXStyledTextAreaScrollPane.class);
    }
}