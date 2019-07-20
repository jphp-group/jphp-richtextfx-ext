package org.venity.nearde.richtextfx.classes;

import javafx.concurrent.Task;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import org.reactfx.Subscription;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.ext.java.JavaException;
import php.runtime.invoke.Invoker;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

import java.time.Duration;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UXHighlightClassedTextArea extends UXStyleClassedTextArea {

    public UXHighlightClassedTextArea(Environment env, CodeArea wrappedObject) {
        super(env, wrappedObject);
    }

    public UXHighlightClassedTextArea(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    private ExecutorService executor;
    private Invoker callback;

    @Reflection.Signature
    public void __construct(String text) {
        __wrappedObject = new CodeArea(text);
        executor = Executors.newSingleThreadExecutor();
    }

    @Reflection.Signature
    public void __construct() {
        __construct("");
    }

    @Reflection.Signature
    public void setHighlightCallback(int ms, Invoker callback) {
        this.callback = callback;

        Subscription cleanupWhenDone = this.getWrappedObject().multiPlainChanges()
                .successionEnds(Duration.ofMillis(ms))
                .supplyTask(this::computeHighlightingAsync)
                .awaitLatest(this.getWrappedObject().multiPlainChanges())
                .filterMap(t -> {
                    if(t.isSuccess()) {
                        return Optional.of(t.get());
                    } else {
                        t.getFailure().printStackTrace();
                        return Optional.empty();
                    }
                })
                .subscribe(this::applyHighlighting);
    }

    private Task<StyleSpans<Collection<String>>> computeHighlightingAsync() {
        String text = getWrappedObject().getText();
        Task<StyleSpans<Collection<String>>> task = new Task<StyleSpans<Collection<String>>>() {
            @Override
            protected StyleSpans<Collection<String>> call() throws Exception {
                StyleSpans<Collection<String>> ss = null;

                try {
                    StyleSpansBuilder ssb = (StyleSpansBuilder) Memory.unwrap(
                            __env__, callback.callNoThrow(StringMemory.valueOf(text)));

                    ss = (StyleSpans<Collection<String>>) ssb.create();
                } catch (ClassCastException ex) {
                    __env__.__throwException(new JavaException(__env__, ex));
                }

                return ss;
            }
        };
        executor.execute(task);
        return task;
    }

    private void applyHighlighting(StyleSpans<Collection<String>> highlighting) {
        getWrappedObject().setStyleSpans(0, highlighting);
    }
}
