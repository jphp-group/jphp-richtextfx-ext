package org.venity.nearde.richtextfx.classes;

import org.fxmisc.richtext.model.StyleSpansBuilder;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.util.Collection;

@Reflection.Name("UXStyleSpansBuilder")
@Reflection.Namespace("php\\gui")
public class UXStyleSpansBuilder extends BaseWrapper<StyleSpansBuilder<Collection<String>>> {

    public UXStyleSpansBuilder(Environment env, StyleSpansBuilder<Collection<String>> wrappedObject) {
        super(env, wrappedObject);
    }

    public UXStyleSpansBuilder(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() {
        this.__wrappedObject = new StyleSpansBuilder<>();
    }

    @Reflection.Signature
    public UXStyleSpansBuilder add(Collection<String> style, int length) {
        getWrappedObject().add(style, length);
        return this;
    }
}
