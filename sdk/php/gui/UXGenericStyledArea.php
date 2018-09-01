<?php

namespace php\gui;


use php\gui\layout\UXRegion;

abstract class UXGenericStyledArea extends UXRegion
{
    /**
     * @var boolean
     */
    public $editable;

    /**
     * @var boolean
     */
    public $wrapText;

    /**
     * @var UXContextMenu
     */
    public $contextMenu;

    /**
     * @var string
     */
    public $text;

    /**
     * @var int
     */
    public $caretPosition;

    /**
     * @var string
     */
    public $selectedText;

    /**
     * @var array
     */
    public $selection;

    /**
     * @param int $from
     * @param int $to
     * @return string
     */
    public function getTextOfPosition(int $from, int $to) : string {}

    /**
     * @param int $paragraph
     * @return string
     */
    public function getTextOfParagraph(int $paragraph) : string {}

    /**
     * @param int $paragraph
     */
    public function showParagraphInViewport(int $paragraph) : void {}

    /**
     * @param int $paragraph
     */
    public function showParagraphAtTop(int $paragraph) : void {}

    /**
     * @param int $paragraph
     */
    public function showParagraphAtBottom(int $paragraph) : void {}

    /**
     * @param int $from
     * @param int $to
     * @param string $style
     */
    public function setStyleOfPosition(int $from, int $to, string $style) : void {}

    /**
     * @param int $paragraph
     * @param string $style
     */
    public function setStyleOfParagraph(int $paragraph, string $style) : void {}

    /**
     * @param int $from
     * @param int $to
     */
    public function clearStyle(int $from, int $to) : void {}

    /**
     * @param int $paragraph
     */
    public function clearStyleOfParagraph(int $paragraph) : void {}

    /**
     * @param int $from
     * @param int $to
     * @return array
     */
    public function getCharacterBoundsOnScreen(int $from, int $to) : array {}

    /**
     * @param int $from
     * @param int $to
     * @param string $text
     */
    public function replaceText(int $from, int $to, string $text) : void {}

    public function clear() : void {}

    public function selectLine() : void {}

    /**
     * @param int $anchor
     * @param int $caret
     */
    public function selectRange(int $anchor, int $caret) : void {}

    /**
     * @param int $index
     * @param string $text
     */
    public function insertText(int $index, string $text) : void {}

    /**
     * @param string $text
     * @param string|null $style
     */
    public function appendText(string $text, string $style = null) : void {}

    /**
     * @param callback $callback (int $line) return UXNode
     */
    public function graphicFactory(callable $callback) : void {}
}