# UXGenericStyledArea

- **класс** `UXGenericStyledArea` (`php\gui\UXGenericStyledArea`) **унаследован от** `UXRegion` (`php\gui\layout\UXRegion`)
- **исходники** `php/gui/UXGenericStyledArea.php`

**Классы наследники**

> [UXInlineCssTextArea](https://github.com/jphp-group/jphp-richtextfx-ext/blob/master/api-docs/classes/php/gui/UXInlineCssTextArea.ru.md), [UXStyleClassedTextArea](https://github.com/jphp-group/jphp-richtextfx-ext/blob/master/api-docs/classes/php/gui/UXStyleClassedTextArea.ru.md)

---

#### Свойства

- `->`[`editable`](#prop-editable) : `boolean`
- `->`[`wrapText`](#prop-wraptext) : `boolean`
- `->`[`contextMenu`](#prop-contextmenu) : `UXContextMenu`
- `->`[`text`](#prop-text) : `string`
- `->`[`caretPosition`](#prop-caretposition) : `int`
- `->`[`selectedText`](#prop-selectedtext) : `string`
- `->`[`selection`](#prop-selection) : `array`

---

#### Методы

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

---
# Методы

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