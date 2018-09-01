package pro.nearde.richtextfx.classes;

import org.develnext.jphp.ext.javafx.JavaFXExtension;
import org.fxmisc.richtext.StyleClassedTextArea;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("UXStyleClassedTextArea")
@Reflection.Namespace(JavaFXExtension.NS)
public class UXStyleClassedTextArea extends UXGenericStyledArea {

    public UXStyleClassedTextArea(Environment env, StyleClassedTextArea wrappedObject) {
        super(env, wrappedObject);
    }

    public UXStyleClassedTextArea(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public StyleClassedTextArea getWrappedObject() {
        return (StyleClassedTextArea) __wrappedObject;
    }

    @Reflection.Signature
    public void __construct() {
        __wrappedObject = new StyleClassedTextArea();
    }

    @Reflection.Signature
    public void setStyleOfPosition(int from, int to, String style)
    {
        super.setStyleOfPosition(from, to, style);
    }

    @Reflection.Signature
    public void setStyleOfParagraph(int paragraph, String style)
    {
        super.setStyleOfParagraph(paragraph, style);
    }

    @Reflection.Signature
    public void setStyleClass(int from, int to, String styleClass) {
        getWrappedObject().setStyleClass(from, to, styleClass);
    }
}
