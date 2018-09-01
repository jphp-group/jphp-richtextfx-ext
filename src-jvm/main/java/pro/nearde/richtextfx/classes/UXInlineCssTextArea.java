package pro.nearde.richtextfx.classes;

import org.develnext.jphp.ext.javafx.JavaFXExtension;
import org.fxmisc.richtext.GenericStyledArea;
import org.fxmisc.richtext.InlineCssTextArea;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("UXInlineCssTextArea")
@Reflection.Namespace(JavaFXExtension.NS)
public class UXInlineCssTextArea extends UXGenericStyledArea {

    public UXInlineCssTextArea(Environment env, InlineCssTextArea wrappedObject) {
        super(env, wrappedObject);
    }

    public UXInlineCssTextArea(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public InlineCssTextArea getWrappedObject() {
        return (InlineCssTextArea) __wrappedObject;
    }

    @Reflection.Signature
    public void __construct() {
        __wrappedObject = new InlineCssTextArea();
    }

    @Reflection.Signature
    public void __construct(String text) {
        __wrappedObject = new InlineCssTextArea(text);
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
}
