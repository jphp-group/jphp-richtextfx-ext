# UXGenericStyledArea

- **class** `UXGenericStyledArea` (`php\gui\UXGenericStyledArea`) **extends** `UXRegion` (`php\gui\layout\UXRegion`)
- **source** `php/gui/UXGenericStyledArea.php`

**Child Classes**

> [UXInlineCssTextArea](https://github.com/jphp-group/jphp-richtextfx-ext/blob/master/api-docs/classes/php/gui/UXInlineCssTextArea.md), [UXStyleClassedTextArea](https://github.com/jphp-group/jphp-richtextfx-ext/blob/master/api-docs/classes/php/gui/UXStyleClassedTextArea.md)

---

#### Properties

- `->`[`editable`](#prop-editable) : `boolean`
- `->`[`wrapText`](#prop-wraptext) : `boolean`
- `->`[`contextMenu`](#prop-contextmenu) : `UXContextMenu`
- `->`[`text`](#prop-text) : `string`
- `->`[`caretPosition`](#prop-caretposition) : `int`
- `->`[`selectedText`](#prop-selectedtext) : `string`
- `->`[`selection`](#prop-selection) : `array`

---

#### Methods

- `->`[`getTextOfPosition()`](#method-gettextofposition)
- `->`[`getTextOfParagraph()`](#method-gettextofparagraph)
- `->`[`showParagraphInViewport()`](#method-showparagraphinviewport)
- `->`[`showParagraphAtTop()`](#method-showparagraphattop)
- `->`[`showParagraphAtBottom()`](#method-showparagraphatbottom)
- `->`[`setStyleOfPosition()`](#method-setstyleofposition)
- `->`[`setStyleOfParagraph()`](#method-setstyleofparagraph)
- `->`[`clearStyle()`](#method-clearstyle)
- `->`[`clearStyleOfParagraph()`](#method-clearstyleofparagraph)
- `->`[`getCharacterBoundsOnScreen()`](#method-getcharacterboundsonscreen)
- `->`[`replaceText()`](#method-replacetext)
- `->`[`clear()`](#method-clear)
- `->`[`selectLine()`](#method-selectline)
- `->`[`selectRange()`](#method-selectrange)
- `->`[`insertText()`](#method-inserttext)
- `->`[`appendText()`](#method-appendtext)
- `->`[`graphicFactory()`](#method-graphicfactory)
- `->`[`scrollToPixel()`](#method-scrolltopixel)
- `->`[`scrollBy()`](#method-scrollby)
- `->`[`moveTo()`](#method-moveto)
- `->`[`undo()`](#method-undo)
- `->`[`redo()`](#method-redo)
- `->`[`cut()`](#method-cut)
- `->`[`copy()`](#method-copy)
- `->`[`paste()`](#method-paste)
- `->`[`canUndo()`](#method-canundo)
- `->`[`canRedo()`](#method-canredo)
- `->`[`jumpToLine()`](#method-jumptoline)

---
# Methods

<a name="method-gettextofposition"></a>

### getTextOfPosition()
```php
getTextOfPosition(int $from, int $to): string
```

---

<a name="method-gettextofparagraph"></a>

### getTextOfParagraph()
```php
getTextOfParagraph(int $paragraph): string
```

---

<a name="method-showparagraphinviewport"></a>

### showParagraphInViewport()
```php
showParagraphInViewport(int $paragraph): void
```

---

<a name="method-showparagraphattop"></a>

### showParagraphAtTop()
```php
showParagraphAtTop(int $paragraph): void
```

---

<a name="method-showparagraphatbottom"></a>

### showParagraphAtBottom()
```php
showParagraphAtBottom(int $paragraph): void
```

---

<a name="method-setstyleofposition"></a>

### setStyleOfPosition()
```php
setStyleOfPosition(int $from, int $to, string $style): void
```

---

<a name="method-setstyleofparagraph"></a>

### setStyleOfParagraph()
```php
setStyleOfParagraph(int $paragraph, string $style): void
```

---

<a name="method-clearstyle"></a>

### clearStyle()
```php
clearStyle(int $from, int $to): void
```

---

<a name="method-clearstyleofparagraph"></a>

### clearStyleOfParagraph()
```php
clearStyleOfParagraph(int $paragraph): void
```

---

<a name="method-getcharacterboundsonscreen"></a>

### getCharacterBoundsOnScreen()
```php
getCharacterBoundsOnScreen(int $from, int $to): array
```

---

<a name="method-replacetext"></a>

### replaceText()
```php
replaceText(int $from, int $to, string $text): void
```

---

<a name="method-clear"></a>

### clear()
```php
clear(): void
```

---

<a name="method-selectline"></a>

### selectLine()
```php
selectLine(): void
```

---

<a name="method-selectrange"></a>

### selectRange()
```php
selectRange(int $anchor, int $caret): void
```

---

<a name="method-inserttext"></a>

### insertText()
```php
insertText(int $index, string $text): void
```

---

<a name="method-appendtext"></a>

### appendText()
```php
appendText(string $text, string|null $style): void
```

---

<a name="method-graphicfactory"></a>

### graphicFactory()
```php
graphicFactory(callback $callback): void
```

---

<a name="method-scrolltopixel"></a>

### scrollToPixel()
```php
scrollToPixel(int $x, int $y): void
```

---

<a name="method-scrollby"></a>

### scrollBy()
```php
scrollBy(mixed $deltaX, mixed $deltaY): void
```

---

<a name="method-moveto"></a>

### moveTo()
```php
moveTo(int $line, int $pos): void
```

---

<a name="method-undo"></a>

### undo()
```php
undo(): void
```

---

<a name="method-redo"></a>

### redo()
```php
redo(): void
```

---

<a name="method-cut"></a>

### cut()
```php
cut(): void
```

---

<a name="method-copy"></a>

### copy()
```php
copy(): void
```

---

<a name="method-paste"></a>

### paste()
```php
paste(): void
```

---

<a name="method-canundo"></a>

### canUndo()
```php
canUndo(): boolean
```

---

<a name="method-canredo"></a>

### canRedo()
```php
canRedo(): boolean
```

---

<a name="method-jumptoline"></a>

### jumpToLine()
```php
jumpToLine(int $line, int $pos): void
```