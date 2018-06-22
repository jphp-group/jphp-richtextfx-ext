# UXInlineCssTextArea

- **класс** `UXInlineCssTextArea` (`php\gui\UXInlineCssTextArea`) **унаследован от** `UXRegion` (`php\gui\layout\UXRegion`)
- **исходники** `php/gui/UXInlineCssTextArea.php`

---

#### Свойства

- `->`[`warpText`](#prop-warptext) : `bool`
- `->`[`caretPosition`](#prop-caretposition) : `mixed`
- `->`[`selectedText`](#prop-selectedtext) : `mixed`
- `->`[`selection`](#prop-selection) : `array`

---

#### Методы

- `->`[`clear()`](#method-clear)
- `->`[`selectLine()`](#method-selectline)
- `->`[`selectAll()`](#method-selectall)
- `->`[`getText()`](#method-gettext)
- `->`[`selectRange()`](#method-selectrange)
- `->`[`insertText()`](#method-inserttext)
- `->`[`appendText()`](#method-appendtext)
- `->`[`clearStyle()`](#method-clearstyle)
- `->`[`clearStyleOfParagraph()`](#method-clearstyleofparagraph)
- `->`[`setStyle()`](#method-setstyle)
- `->`[`setStyleOfParagraph()`](#method-setstyleofparagraph)
- `->`[`getStyleAtPosition()`](#method-getstyleatposition)
- `->`[`jumpToLine()`](#method-jumptoline)
- `->`[`jumpToEndLine()`](#method-jumptoendline)

---
# Методы

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

<a name="method-selectall"></a>

### selectAll()
```php
selectAll(): void
```

---

<a name="method-gettext"></a>

### getText()
```php
getText(): string
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

<a name="method-setstyle"></a>

### setStyle()
```php
setStyle(int $from, int $to, string $style): void
```

---

<a name="method-setstyleofparagraph"></a>

### setStyleOfParagraph()
```php
setStyleOfParagraph(int $paragraph, string $style): void
```

---

<a name="method-getstyleatposition"></a>

### getStyleAtPosition()
```php
getStyleAtPosition(int $paragraph): string
```

---

<a name="method-jumptoline"></a>

### jumpToLine()
```php
jumpToLine(int $line, int $pos): void
```

---

<a name="method-jumptoendline"></a>

### jumpToEndLine()
```php
jumpToEndLine(int|null $pos, int|null $offset): void
```