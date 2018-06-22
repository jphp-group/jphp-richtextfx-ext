<?php

namespace php\gui;

use php\gui\layout\UXRegion;

class UXInlineCssTextArea extends UXRegion
{
    /**
     * @var bool
     */
    public $warpText;

    public function clear() {}

    public function selectLine() {}

    public function selectAll() {}

    public function getText() : string {}

    /**
     * @param int $anchor
     * @param int $caret
     */
    public function selectRange(int $anchor, int $caret) {}

    public $caretPosition;

    public $selectedText;

    /**
     * @var array
     */
    public $selection;

    /**
     * @param int $index
     * @param string $text
     */
    public function insertText(int $index, string $text) {}

    /**
     * @param string $text
     * @param string|null $style
     */
    public function appendText(string $text, string $style = null) {}

    /**
     * @param int $from
     * @param int $to
     */
    public function clearStyle(int $from, int $to) {}

    /**
     * @param int $paragraph
     */
    public function clearStyleOfParagraph(int $paragraph) {}

    /**
     * @param int $from
     * @param int $to
     * @param string $style
     */
    public function setStyle(int $from, int $to, string $style) {}

    /**
     * @param int $paragraph
     * @param string $style
     */
    public function setStyleOfParagraph(int $paragraph, string $style) {}

    /**
     * @param int $paragraph
     * @return string
     */
    public function getStyleAtPosition(int $paragraph) : string {}

    /**
     * @param int $line
     * @param int $pos
     */
    public function jumpToLine(int $line, int $pos) {}

    /**
     * @param int|null $pos
     * @param int|null $offset
     */
    public function jumpToEndLine(int $pos = null, int $offset = null) {}
}