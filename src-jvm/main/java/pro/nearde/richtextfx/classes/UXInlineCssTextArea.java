package pro.nearde.richtextfx.classes;

import javafx.scene.control.IndexRange;
import org.develnext.jphp.ext.javafx.classes.layout.UXRegion;
import org.fxmisc.richtext.InlineCssTextArea;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

import java.util.HashMap;
import java.util.Map;

@Reflection.Name("UXInlineCssTextArea")
@Reflection.Namespace("php\\gui")
public class UXInlineCssTextArea extends UXRegion<InlineCssTextArea> {

    public UXInlineCssTextArea(Environment env, InlineCssTextArea wrappedObject) {
        super(env, wrappedObject);
    }

    public UXInlineCssTextArea(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct()
    {
        __wrappedObject = new InlineCssTextArea();
    }

    public InlineCssTextArea getWrappedObject()
    {
        return (InlineCssTextArea) __wrappedObject;
    }

    @Reflection.Getter
    public boolean getWrapText() {
        return getWrappedObject().isWrapText();
    }

    @Reflection.Setter
    public void setWrapText(boolean value) {
        getWrappedObject().setWrapText(value);
    }

    @Reflection.Signature
    public void clear() {
        getWrappedObject().clear();
    }

    @Reflection.Signature
    public void selectLine() {
        getWrappedObject().selectLine();
    }

    @Reflection.Signature
    public void selectAll() {
        getWrappedObject().selectAll();
    }

    @Reflection.Signature
    public void selectRange(int anchor, int caret) {
        getWrappedObject().selectRange(anchor, caret);
    }

    @Reflection.Getter
    public int getCaretPosition() {
        return getWrappedObject().getCaretPosition();
    }

    @Reflection.Setter
    public void setCaretPosition(int value) {
        getWrappedObject().moveTo(value);
        getWrappedObject().requestFollowCaret();
    }

    @Reflection.Getter
    public String getSelectedText() {
        return getWrappedObject().getSelectedText();
    }

    @Reflection.Setter
    public void setSelectedText(String text) {
        getWrappedObject().replaceSelection(text);
    }

    @Reflection.Getter
    public Map<String, Integer> getSelection() {
        IndexRange selection = getWrappedObject().getSelection();
        HashMap<String, Integer> result = new HashMap<>();
        result.put("start", selection.getStart());
        result.put("end", selection.getEnd());
        result.put("length", selection.getLength());

        return result;
    }

    @Reflection.Signature
    public void insertText(int index, String text) {
        getWrappedObject().insertText(index, text);
    }

    @Reflection.Signature
    public void appendText(String text) {
        appendText(text, null);
    }

    @Reflection.Signature
    public void appendText(String text, String style) {
        int length = getWrappedObject().getLength();
        getWrappedObject().appendText(text);

        if (style != null && !style.trim().isEmpty()) {
            getWrappedObject().setStyle(length, length + text.length(), style);
        }
    }

    @Reflection.Signature
    public void clearStyle(int from, int to) {
        getWrappedObject().clearStyle(from, to);
    }

    @Reflection.Signature
    public void clearStyleOfParagraph(int paragraph) {
        getWrappedObject().clearStyle(paragraph);
    }

    @Reflection.Signature
    public void setStyle(int from, int to, String style) {
        getWrappedObject().setStyle(from, to, style);
    }

    @Reflection.Signature
    public void setStyleOfParagraph(int paragraph, String style) {
        getWrappedObject().setStyle(paragraph, style);
    }

    @Reflection.Signature
    public String getStyleAtPosition(int position) {
        return getWrappedObject().getStyleAtPosition(position);
    }

    @Reflection.Signature
    public String getStyleAtParagraph(int paragraph, int offset) {
        return getWrappedObject().getStyleAtPosition(paragraph, offset);
    }

    @Reflection.Signature
    public void jumpToLine(int line, int pos) {
        getWrappedObject().moveTo(getWrappedObject().position(line, pos).toOffset());
        getWrappedObject().requestFollowCaret();
    }

    @Reflection.Signature
    public void jumpToEndLine() {
        jumpToEndLine(0, 0);
    }

    @Reflection.Signature
    public void jumpToEndLine(int pos) {
        jumpToEndLine(pos, 0);
    }

    @Reflection.Signature
    public void jumpToEndLine(int pos, int offset) {
        jumpToLine(getWrappedObject().getParagraphs().size() - 1 - offset, pos);
    }

    @Reflection.Signature
    public String getText()
    {
        return getWrappedObject().getText();
    }
}
