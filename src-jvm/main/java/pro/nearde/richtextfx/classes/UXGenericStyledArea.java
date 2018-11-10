package pro.nearde.richtextfx.classes;

import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.IndexRange;
import org.develnext.jphp.ext.javafx.JavaFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXNode;
import org.develnext.jphp.ext.javafx.classes.layout.UXRegion;
import org.fxmisc.richtext.GenericStyledArea;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.invoke.Invoker;
import php.runtime.memory.BinaryMemory;
import php.runtime.memory.DoubleMemory;
import php.runtime.memory.LongMemory;
import php.runtime.memory.support.operation.IntegerMemoryOperation;
import php.runtime.reflection.ClassEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.IntFunction;

@Reflection.Name("UXGenericStyledArea")
@Reflection.Namespace("php\\gui")
abstract public class UXGenericStyledArea extends UXRegion<GenericStyledArea> {

    public UXGenericStyledArea(Environment env, GenericStyledArea wrappedObject) {
        super(env, wrappedObject);
    }

    public UXGenericStyledArea(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public GenericStyledArea getWrappedObject() {
        return (GenericStyledArea) __wrappedObject;
    }

    @Reflection.Setter
    public void setEditable(boolean editable)
    {
        getWrappedObject().setEditable(editable);
    }

    @Reflection.Getter
    public boolean getEditable()
    {
        return getWrappedObject().isEditable();
    }

    @Reflection.Setter
    public void setWrapText(boolean wrapText)
    {
        getWrappedObject().setWrapText(wrapText);
    }

    @Reflection.Getter
    public boolean getWrapText()
    {
        return getWrappedObject().isWrapText();
    }

    @Reflection.Setter
    public void setContextMenu(ContextMenu menu)
    {
        getWrappedObject().setContextMenu(menu);
    }

    @Reflection.Getter
    public ContextMenu getContextMenu()
    {
        return getWrappedObject().getContextMenu();
    }

    @Reflection.Signature
    public String getTextOfPosition(int from, int to)
    {
        return getWrappedObject().getText(from, to);
    }

    @Reflection.Signature
    public String getTextOfParagraph(int paragraph)
    {
        return getWrappedObject().getText(paragraph);
    }

    @Reflection.Getter
    public String getText()
    {
        return getWrappedObject().getText();
    }

    @Reflection.Getter
    public int getCaretOffset() {
        return getWrappedObject().getCaretColumn();
    }

    @Reflection.Getter
    public int getCaretLine() {
        return getWrappedObject().getCurrentParagraph();
    }

    @Reflection.Signature
    public void showParagraphInViewport(int paragraphInViewport)
    {
        getWrappedObject().showParagraphInViewport(paragraphInViewport);
    }

    @Reflection.Signature
    public void showParagraphAtTop(int paragraphAtTop)
    {
        getWrappedObject().showParagraphAtTop(paragraphAtTop);
    }

    @Reflection.Signature
    public void showParagraphAtBottom(int paragraphAtBottom)
    {
        getWrappedObject().showParagraphAtBottom(paragraphAtBottom);
    }

    @Reflection.Signature
    public void setStyleOfPosition(int from, int to, Object style)
    {
        getWrappedObject().setStyle(from, to, style);
    }

    @Reflection.Signature
    public void setStyleOfParagraph(int paragraph, Object style)
    {
        getWrappedObject().setStyle(paragraph, style);
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
    public Bounds getCharacterBounds() {
        return (Bounds) getWrappedObject().getCaretBounds().get();
    }

    @Reflection.Signature
    public Map getCharacterBoundsOnScreen(int from, int to)
    {
        Optional<Bounds> b = getWrappedObject().getCharacterBoundsOnScreen(from, to);

        Map m = new HashMap();
        m.put("width", b.get().getWidth());
        m.put("height", b.get().getHeight());

        return m;
    }

    @Reflection.Signature
    public void replaceText(int start, int end, String text)
    {
        getWrappedObject().replaceText(start, end, text);
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
    public void graphicFactory(Invoker callback)
    {
        getWrappedObject().setParagraphGraphicFactory(new IntFunction<Node>() {
            @Override
            public Node apply(int line) {
                try {
                    return callback.call(new DoubleMemory(line)).toObject(UXNode.class).getWrappedObject();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                return null;
            }
        });
    }

    @Reflection.Signature
    public void scrollToPixel(double x, double y) {
        getWrappedObject().scrollToPixel(x, y);
    }

    @Reflection.Signature
    public void scrollBy(double deltaX, double deltaY) {
        getWrappedObject().scrollBy(deltaX, deltaY);
    }

    @Reflection.Signature
    public void moveTo(int line, int pos) {
        getWrappedObject().moveTo(line, pos);
    }

    @Reflection.Signature
    public void moveTo(int line) {
        getWrappedObject().moveTo(line, getCaretOffset());
    }

    @Reflection.Signature
    public void undo() {
        try {
            getWrappedObject().undo();
        } catch (IllegalArgumentException e) {
            ;//nop hotfix
        }
    }

    @Reflection.Signature
    public void redo() {
        try {
            getWrappedObject().redo();
        } catch (IllegalArgumentException e) {
            ;// nop hotfix
        }
    }

    @Reflection.Signature
    public void cut() {
        getWrappedObject().cut();
    }

    @Reflection.Signature
    public void copy() {
        getWrappedObject().copy();
    }

    @Reflection.Signature
    public void paste() {
        getWrappedObject().paste();
    }

    @Reflection.Signature
    public boolean canUndo() {
        return getWrappedObject().isUndoAvailable();
    }

    @Reflection.Signature
    public boolean canRedo() {
        return getWrappedObject().isRedoAvailable();
    }

    @Reflection.Signature
    public void jumpToLine(int line, int pos) {
        try {
            getWrappedObject().moveTo(getWrappedObject().position(line, pos).toOffset());
        } catch (IndexOutOfBoundsException e) {
            getWrappedObject().moveTo(getText().length());
        }
        getWrappedObject().requestFollowCaret();
    }
}
