package org.venity.nearde.richtextfx;

import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.GenericStyledArea;
import org.fxmisc.richtext.InlineCssTextArea;
import org.fxmisc.richtext.StyleClassedTextArea;
import org.venity.nearde.richtextfx.classes.UXGenericStyledArea;
import org.venity.nearde.richtextfx.classes.UXInlineCssTextArea;
import org.venity.nearde.richtextfx.classes.UXStyleClassedTextArea;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;
import org.venity.nearde.richtextfx.classes.UXVirtualizedScrollPane;

public class RichTextExtension extends Extension {

    @Override
    public Status getStatus() {
        return Status.STABLE;
    }

    @Override
    public String getName() {
        return "RichTextFX";
    }

    @Override
    public String[] getPackageNames() {
        return new String[] { "gui" };
    }

    @Override
    public String getVersion() {
        return "1.2.0";
    }

    @Override
    public void onRegister(CompileScope compileScope) {
        registerWrapperClass(compileScope, GenericStyledArea.class, UXGenericStyledArea.class);
        registerWrapperClass(compileScope, InlineCssTextArea.class, UXInlineCssTextArea.class);
        registerWrapperClass(compileScope, StyleClassedTextArea.class, UXStyleClassedTextArea.class);
        registerWrapperClass(compileScope, VirtualizedScrollPane.class, UXVirtualizedScrollPane.class);
    }
}