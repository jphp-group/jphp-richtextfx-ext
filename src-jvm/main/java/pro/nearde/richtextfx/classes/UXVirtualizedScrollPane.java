package pro.nearde.richtextfx.classes;

import org.develnext.jphp.ext.javafx.JavaFXExtension;
import org.develnext.jphp.ext.javafx.classes.layout.UXRegion;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.GenericStyledArea;
import org.fxmisc.richtext.InlineCssTextArea;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("UXVirtualizedScrollPane")
@Reflection.Namespace("php\\gui")
public class UXVirtualizedScrollPane extends UXRegion<VirtualizedScrollPane<GenericStyledArea>> {

    public UXVirtualizedScrollPane(Environment env, VirtualizedScrollPane<GenericStyledArea> wrappedObject) {
        super(env, wrappedObject);
    }

    public UXVirtualizedScrollPane(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct(GenericStyledArea area) {
        __wrappedObject = new VirtualizedScrollPane<GenericStyledArea>(area);
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
