package pro.nearde.richtextfx.classes;

import org.develnext.jphp.ext.javafx.classes.UXNode;
import org.develnext.jphp.ext.javafx.classes.layout.UXRegion;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.InlineCssTextArea;
import org.fxmisc.richtext.StyledTextArea;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("UXStyledTextAreaScrollPane")
@Reflection.Namespace("php\\gui")
public class UXStyledTextAreaScrollPane extends UXNode<VirtualizedScrollPane<InlineCssTextArea>> {

    public UXStyledTextAreaScrollPane(Environment env, VirtualizedScrollPane<InlineCssTextArea> wrappedObject) {
        super(env, wrappedObject);
    }

    public UXStyledTextAreaScrollPane(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct(UXInlineCssTextArea area) {
        if (area instanceof UXInlineCssTextArea) {
            __wrappedObject = new VirtualizedScrollPane<>((InlineCssTextArea) area.getWrappedObject());
        } else {
            throw new IllegalArgumentException("Invalid text area");
        }
    }

    @Reflection.Getter
    public double getScrollX() {
        return getWrappedObject().estimatedScrollXProperty().getValue();
    }

    @Reflection.Setter
    public void setScrollX(double value) {
        getWrappedObject().estimatedScrollXProperty().setValue(value);
    }

    @Reflection.Getter
    public double getScrollY() {
        return getWrappedObject().estimatedScrollYProperty().getValue();
    }

    @Reflection.Setter
    public void setScrollY(double value) {
        getWrappedObject().estimatedScrollYProperty().setValue(value);
    }
}
