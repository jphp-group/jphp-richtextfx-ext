<?php

namespace php\gui;

class UXHighlightClassedTextArea extends UXStyleClassedTextArea {

    /**
     * UXHighlightClassedTextArea constructor.
     * @param string $text
     */
    public function __construct(string $text = "") {

    }

    /**
     * @param int $ms
     * @param callable $callback function(string text): UXStyleSpansBuilder
     */
    public function setHighlightCallback(int $ms, callable $callback) {

    }
}